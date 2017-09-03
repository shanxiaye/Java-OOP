package kongzhu.lianxi.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlInjectionDemo {

	public static void main(String[] args) {
		statement();
		preparedStatement();
	}
	
	public static void preparedStatement() {
		String url = "jdbc:mysql://localhost:3306/kongzhu?useSSL=true";
		String user = "root";
		String password = "mysql";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "select"
					+ " username,"
					+ " password,"
					+ " subject,"
					+ " score"
					+ " from user"
					+ " where username = ?";
			psmt = conn.prepareStatement(sql);
//			String name = "����";
			String name = "���� or 1 = 1";
			psmt.setString(1, name);
			rs = psmt.executeQuery();
			
			System.out.println("����\t����\tѧ��\t����");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.println(rs.getInt(4));
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
	}
	
	public static void statement() {
		String url = "jdbc:mysql://localhost:3306/kongzhu?useSSL=true";
		String user = "root";
		String password = "mysql";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
//			String name = "'����'";
			String name = "'ף����' or 1 = 1";
			String sql = "select"
					+ " username,"
					+ " password,"
					+ " subject,"
					+ " score"
					+ " from user"
					+ " where username = " + name;
			System.out.println(sql);
			rs = stmt.executeQuery(sql);
			System.out.println("����\t����\tѧ��\t����");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.println(rs.getInt(4));
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
			if (stmt != null) {
				try {
					stmt.close();
					stmt = null;
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
	}

}
