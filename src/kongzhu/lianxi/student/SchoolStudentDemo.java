package kongzhu.lianxi.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class SchoolStudentDemo {

	public static void main(String[] args) {
		SchoolStudent student = new SchoolStudent(20170002, "董恩康", "XXXX", "XXXX", "1幢1单元111室02#床位");
		int rowCount;
//		rowCount = insertStudent(student);
//		if (rowCount == 1) {
//			System.out.println("学员信息添加成功");
//		} else {
//			System.out.println("学员信息添加失败");
//		}
		
//		rowCount = deleteStudent(20170001);
//		if (rowCount == 1) {
//			System.out.println("学员信息删除成功");
//		} else {
//			System.out.println("学员信息删除失败");
//		}
		
//		student = new SchoolStudent();
//		student.setId(20170001);
//		student.setFamilyAddress("浙江省杭州市");
//		student.setProfessionName("计算机");
//		rowCount = updateStudent(student);
//		if (rowCount == 1) {
//			System.out.println("学员信息修改成功");
//		} else {
//			System.out.println("学员信息修改失败");
//		}
		
		SchoolStudent stu1 = selectStudent(20170001);
		SchoolStudent stu2 = selectStudent(20170002);
		int[] arr = exchangeStudentDormitory(stu1, stu2);
		if (arr[0] == 1 && arr[1] == 1) {
			System.out.println("学员宿舍交换成功");
		} else {
			System.out.println("学员宿舍交换失败");
		}
	}
	
	public static int insertStudent(SchoolStudent student) {
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			Properties props = new Properties();
			props.load(SchoolStudentDemo.class.getResourceAsStream("/jdbc.properties"));
			
			Class.forName(props.getProperty("driverClassName"));
			conn = DriverManager.getConnection(
					props.getProperty("url"),
					props.getProperty("user"),
					props.getProperty("password"));
			String sql = "insert into student(id, student_name, family_address, profession_name, dormitory) values (?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
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
		return -1;
	}
	
	public static int deleteStudent(Integer id) {
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			Properties props = new Properties();
			props.load(SchoolStudentDemo.class.getResourceAsStream("/jdbc.properties"));
			
			Class.forName(props.getProperty("driverClassName"));
			conn = DriverManager.getConnection(
					props.getProperty("url"),
					props.getProperty("user"),
					props.getProperty("password"));
			String sql = "delete from student where id = ?";
			psmt = conn.prepareStatement(sql);
			int i = 1;
			psmt.setInt(i++, id);
			return psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
		return -1;
	}
	
	public static int updateStudent(SchoolStudent student) {
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			Properties props = new Properties();
			props.load(SchoolStudentDemo.class.getResourceAsStream("/jdbc.properties"));
			
			Class.forName(props.getProperty("driverClassName"));
			conn = DriverManager.getConnection(
					props.getProperty("url"),
					props.getProperty("user"),
					props.getProperty("password"));
			
			StringBuffer sql = new StringBuffer();
			sql.append("update student set");
			if (student.getStudentName() != null) {
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
			// 删除第一个逗号
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
		return -1;
	}
	
	public static int[] exchangeStudentDormitory(SchoolStudent stu1, SchoolStudent stu2) {
		int[] arr = {-1, -1};
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			Properties props = new Properties();
			props.load(SchoolStudentDemo.class.getResourceAsStream("/jdbc.properties"));
			
			Class.forName(props.getProperty("driverClassName"));
			conn = DriverManager.getConnection(
					props.getProperty("url"),
					props.getProperty("user"),
					props.getProperty("password"));
			conn.setAutoCommit(false);
			String sql = "update student set dormitory = ? where id = ?";
			psmt = conn.prepareStatement(sql);
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
		return arr;
	}

	public static SchoolStudent selectStudent(Integer id) {
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			Properties props = new Properties();
			props.load(SchoolStudentDemo.class.getResourceAsStream("/jdbc.properties"));
			
			Class.forName(props.getProperty("driverClassName"));
			conn = DriverManager.getConnection(
					props.getProperty("url"),
					props.getProperty("user"),
					props.getProperty("password"));
			String sql = "select * from student where id = ?";
			psmt = conn.prepareStatement(sql);
			int i = 1;
			psmt.setInt(i++, id);
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
		return null;
	}
}
