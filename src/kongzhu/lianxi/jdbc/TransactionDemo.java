package kongzhu.lianxi.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/kongzhu?useSSL=true";
		String user = "root";
		String password = "mysql";
		
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			
			// �ر��Զ��ύ
			conn.setAutoCommit(false);
			
			// ���������ִ��һ��SQL���
			stmt = conn.createStatement();
			
			int rowCount1 = stmt.executeUpdate("UPDATE bank_account SET balance = balance - 100 WHERE student_id = 20170005");
			int rowCount2 = stmt.executeUpdate("UPDATE bank_account SET balance = balance + 100 WHERE student_id = 20170004");
			
			System.out.println(10/0);
			
			// �ύ����
			conn.commit();
			System.out.println("�ύ�ɹ�");
			
		} catch (Exception e) {
			e.printStackTrace();
			// �������ύ֮ǰ�����쳣ʱ���ع�����
			try {
				conn.rollback();
				System.out.println("�ع��ɹ�");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
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
