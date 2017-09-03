package kongzhu.lianxi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import kongzhu.lianxi.library.BookEntity;

public class JdbcForBookEntityDemo {
	

	public static void main(String[] args) {
		ArrayList<BookEntity> allBook = new ArrayList<BookEntity>();
		BookEntity book1 = new BookEntity(100001, "Head First Java", 54.30, "����", "�й�����������", false);
		BookEntity book2 = new BookEntity(100002, "Java���ļ���", 94.00, "��˹���������ڶ�", "��е��ҵ������", false);
		BookEntity book3 = new BookEntity(100003, "Java���˼��", 86.40, "Bruce Eckel", "��е��ҵ������", false);
		BookEntity book4 = new BookEntity(100004, "Java����ʵս1200��", 75.80, "����ξ", "�廪��ѧ������", false);
		BookEntity book5 = new BookEntity(100005, "���Java����", 86.10, "���", "���ӹ�ҵ������", false);
		allBook.add(book1);
		allBook.add(book2);
		allBook.add(book3);
		allBook.add(book4);
		allBook.add(book5);
		
		String url = "jdbc:mysql://localhost:3306/kongzhu?useSSL=true";
		String user = "root";
		String password = "mysql";
		
//		String sql = "insert into book_entity ("
//				+ "id, name, price, author, publisher, is_borrowed"
//				+ ") values ("
//				+ "100001, 'Head First Java', 54.30, '����', '�й�����������', false"
//				+ ")";
//		String sql2 = "insert into book_entity ("
//				+ "id, name, price, author, publisher, is_borrowed"
//				+ ") values ("
//				+ "100002, 'Java���ļ���', 94.00, '��˹���������ڶ�', '��е��ҵ������', false"
//				+ ")";
		
		String sql = "insert into book_entity ("
				+ "id, name, price, author, publisher, is_borrowed"
				+ ") values (?,?,?,?,?,?)";
		
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement psmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			
			/*// ��̬SQL���
			stmt = conn.createStatement();
			int rowCount = stmt.executeUpdate(sql);
			System.out.println("��Ӱ�����: " + rowCount);
			rowCount = stmt.executeUpdate(sql2);
			System.out.println("��Ӱ�����: " + rowCount);*/
			
			/*// Ԥ���롪����̬SQL���
			psmt = conn.prepareStatement(sql);
			int i = 1;
			psmt.setInt(i++, 100001);
			psmt.setString(i++, "Head First Java");
			psmt.setDouble(i++, 94.00);
			psmt.setString(i++, "����");
			psmt.setString(i++, "�й�����������");
			psmt.setBoolean(i++, false);
			int rowCount = psmt.executeUpdate();
			System.out.println("��Ӱ�����: " + rowCount);
			i = 1;
			psmt.setInt(i++, 100002);
			psmt.setString(i++, "Java���ļ���");
			psmt.setDouble(i++, 54.30);
			psmt.setString(i++, "��˹���������ڶ�");
			psmt.setString(i++, "��е��ҵ������");
			psmt.setBoolean(i++, false);
			rowCount = psmt.executeUpdate();
			System.out.println("��Ӱ�����: " + rowCount);*/
			
			/*// ������
			conn.setAutoCommit(false);
			psmt = conn.prepareStatement(sql);
			int i = 1;
			psmt.setInt(i++, 100001);
			psmt.setString(i++, "Head First Java");
			psmt.setDouble(i++, 94.00);
			psmt.setString(i++, "����");
			psmt.setString(i++, "�й�����������");
			psmt.setBoolean(i++, false);
			psmt.addBatch();
			i = 1;
			psmt.setInt(i++, 100002);
			psmt.setString(i++, "Java���ļ���");
			psmt.setDouble(i++, 54.30);
			psmt.setString(i++, "��˹���������ڶ�");
			psmt.setString(i++, "��е��ҵ������");
			psmt.setBoolean(i++, false);
			psmt.addBatch();
			int[] arr = psmt.executeBatch();
//			for (int j = 0; j < arr.length; j++) {
//				System.out.println("��Ӱ�����: " + arr[j]);
//			}
			// ��ǿforѭ��
			for (int rowCount : arr) {
				System.out.println("��Ӱ�����: " + rowCount);
			}
			conn.commit();*/
			
			// ��������Ż�
			conn.setAutoCommit(false);
			psmt = conn.prepareStatement(sql);
			Iterator<BookEntity> it = allBook.iterator();
			BookEntity book = null;
			int i;
			while (it.hasNext()) {
				book = it.next();
				i = 1;
				psmt.setInt(i++, book.getId());
				psmt.setString(i++, book.getName());
				psmt.setDouble(i++, book.getPrice());
				psmt.setString(i++, book.getAuthor());
				psmt.setString(i++, book.getPublisher());
				psmt.setBoolean(i++, book.isBorrowed());
				psmt.addBatch();
			}
			int[] arr = psmt.executeBatch();
			for (int rowCount : arr) {
				System.out.println("��Ӱ�����: " + rowCount);
			}
			conn.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
//			if (stmt != null) {
//				try {
//					stmt.close();
//					stmt = null;
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
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