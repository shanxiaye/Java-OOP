package kongzhu.lianxi.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class SchoolStudentDAO {

	/**
	 * 
	 * @param student
	 * @return
	 */
	public int insertStudent(SchoolStudent student) {
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(insertSql);
			int i = 1;
			psmt.setInt(i++, student.getId());
			psmt.setString(i++, student.getStudentName());
			psmt.setString(i++, student.getFamilyAddress());
			psmt.setString(i++, student.getProfessionName());
			psmt.setString(i++, student.getDormitory());
			return psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(psmt, conn);
		}
		return -1;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public int deleteStudent(Integer id) {
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(deleteSql);
			psmt.setInt(1, id);
			return psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(psmt, conn);
		}
		return -1;
	}
	
	/**
	 * 
	 * @param student
	 * @return
	 */
	public int updateStudent(SchoolStudent student) {
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			conn = getConnection();
			
			StringBuffer sql = new StringBuffer();
			sql.append("update student set");
			// 
			if (student.getStudentName() != null) {
				// 
				sql.append(", student_name = ?");
			}
			if (student.getFamilyAddress() != null) {
				sql.append(", family_address = ?");
			}
			if (student.getProfessionName() != null) {
				sql.append(", profession_name = ?");
			}
			if (student.getDormitory() != null) {
				sql.append(", dormitory = ?");
			}
			// É¾³ýµÚÒ»¸ö¶ººÅ
			sql.deleteCharAt(sql.indexOf(","));
			sql.append(" where id = ?");
			System.out.println(sql);
			
			psmt = conn.prepareStatement(sql.toString());
			int i = 1;
			if (student.getStudentName() != null) {
				psmt.setString(i++, student.getStudentName());
			}
			if (student.getFamilyAddress() != null) {
				psmt.setString(i++, student.getFamilyAddress());
			}
			if (student.getProfessionName() != null) {
				psmt.setString(i++, student.getProfessionName());
			}
			if (student.getDormitory() != null) {
				psmt.setString(i++, student.getDormitory());
			}
			psmt.setInt(i++, student.getId());
			return psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(psmt, conn);
		}
		return -1;
	}
	
	/**
	 * @param stu1
	 * @param stu2
	 * @return
	 */
	public int[] exchangeStudentDormitory(SchoolStudent stu1, SchoolStudent stu2) {
		int[] arr = {-1, -1};
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			conn = getConnection();
			conn.setAutoCommit(false);
			psmt = conn.prepareStatement(updateDormitorySql);
			int i = 1;
			psmt.setString(i++, stu2.getDormitory());
			psmt.setInt(i++, stu1.getId());
			psmt.addBatch();
			i = 1;
			psmt.setString(i++, stu1.getDormitory());
			psmt.setInt(i++, stu2.getId());
			psmt.addBatch();
			arr = psmt.executeBatch();
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			close(psmt, conn);
		}
		return arr;
	}

	/**
	 * @param id
	 * @return
	 */
	public SchoolStudent selectStudent(Integer id) {
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(selectSql);
			psmt.setInt(1, id);
			rs = psmt.executeQuery();
			if (rs.next()) {
				return new SchoolStudent(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
					rs = null;
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			close(psmt, conn);
		}
		return null;
	}
	
	/**
	 * @return
	 * @throws Exception
	 */
	public Connection getConnection() throws Exception {
		Connection conn = null;
		
		Properties props = new Properties();
		props.load(SchoolStudentDemo.class.getResourceAsStream("/jdbc.properties"));
		
		Class.forName(props.getProperty("driverClassName"));
		conn = DriverManager.getConnection(
				props.getProperty("url"),
				props.getProperty("user"),
				props.getProperty("password"));
		
		return conn;
	}
	
	/**
	 * @param psmt
	 * @param conn
	 */
	public void close(PreparedStatement psmt, Connection conn) {
		if (psmt != null) {
			try {
				psmt.close();
				psmt = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
				conn = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 
	 */
	String insertSql = "insert into student(id, student_name, family_address, profession_name, dormitory) values (?,?,?,?,?)";
	/**
	 * 
	 */
	String deleteSql = "delete from student where id = ?";
	/**
	 * 
	 */
	String updateDormitorySql = "update student set dormitory = ? where id = ?";
	/**
	 * 
	 */
	String selectSql = "select * from student where id = ?";
}
