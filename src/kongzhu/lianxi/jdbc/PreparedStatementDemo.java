package kongzhu.lianxi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import kongzhu.oop.Student;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			String url = "jdbc:mysql://localhost:3306/kongzhu?useSSL=true";
			String user = "root";
			String password = "mysql";
			// ����jar��
			// ������������
			Class.forName("com.mysql.jdbc.Driver");
			// ��������
			conn = DriverManager.getConnection(url, user, password);
			
			// Ԥ����
			psmt = conn.prepareStatement("select"
					+ " id, student_id, student_name, student_sex,"
					+ " student_age from student"
					+ " where student_age > ?"
					+ " and student_sex = ?");
			psmt.setInt(1, 20);
			psmt.setString(2, "��");
			rs = psmt.executeQuery();
			
			System.out.println("����\tѧ��\t����\t�Ա�\t����");
			// ������ѯ���
			while (rs.next()) {
				// ��ȡÿ�е�ÿ������
				
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getInt(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.println(rs.getInt(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// �ͷ���Դ
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

}
