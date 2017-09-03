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
		BookEntity book1 = new BookEntity(100001, "Head First Java", 54.30, "塞若", "中国电力出版社", false);
		BookEntity book2 = new BookEntity(100002, "Java核心技术", 94.00, "霍斯特曼，科内尔", "机械工业出版社", false);
		BookEntity book3 = new BookEntity(100003, "Java编程思想", 86.40, "Bruce Eckel", "机械工业出版社", false);
		BookEntity book4 = new BookEntity(100004, "Java开发实战1200例", 75.80, "李钟尉", "清华大学出版社", false);
		BookEntity book5 = new BookEntity(100005, "疯狂Java讲义", 86.10, "李刚", "电子工业出版社", false);
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
//				+ "100001, 'Head First Java', 54.30, '塞若', '中国电力出版社', false"
//				+ ")";
//		String sql2 = "insert into book_entity ("
//				+ "id, name, price, author, publisher, is_borrowed"
//				+ ") values ("
//				+ "100002, 'Java核心技术', 94.00, '霍斯特曼，科内尔', '机械工业出版社', false"
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
			
			/*// 静态SQL语句
			stmt = conn.createStatement();
			int rowCount = stmt.executeUpdate(sql);
			System.out.println("受影响的行: " + rowCount);
			rowCount = stmt.executeUpdate(sql2);
			System.out.println("受影响的行: " + rowCount);*/
			
			/*// 预编译——动态SQL语句
			psmt = conn.prepareStatement(sql);
			int i = 1;
			psmt.setInt(i++, 100001);
			psmt.setString(i++, "Head First Java");
			psmt.setDouble(i++, 94.00);
			psmt.setString(i++, "塞若");
			psmt.setString(i++, "中国电力出版社");
			psmt.setBoolean(i++, false);
			int rowCount = psmt.executeUpdate();
			System.out.println("受影响的行: " + rowCount);
			i = 1;
			psmt.setInt(i++, 100002);
			psmt.setString(i++, "Java核心技术");
			psmt.setDouble(i++, 54.30);
			psmt.setString(i++, "霍斯特曼，科内尔");
			psmt.setString(i++, "机械工业出版社");
			psmt.setBoolean(i++, false);
			rowCount = psmt.executeUpdate();
			System.out.println("受影响的行: " + rowCount);*/
			
			/*// 批处理
			conn.setAutoCommit(false);
			psmt = conn.prepareStatement(sql);
			int i = 1;
			psmt.setInt(i++, 100001);
			psmt.setString(i++, "Head First Java");
			psmt.setDouble(i++, 94.00);
			psmt.setString(i++, "塞若");
			psmt.setString(i++, "中国电力出版社");
			psmt.setBoolean(i++, false);
			psmt.addBatch();
			i = 1;
			psmt.setInt(i++, 100002);
			psmt.setString(i++, "Java核心技术");
			psmt.setDouble(i++, 54.30);
			psmt.setString(i++, "霍斯特曼，科内尔");
			psmt.setString(i++, "机械工业出版社");
			psmt.setBoolean(i++, false);
			psmt.addBatch();
			int[] arr = psmt.executeBatch();
//			for (int j = 0; j < arr.length; j++) {
//				System.out.println("受影响的行: " + arr[j]);
//			}
			// 增强for循环
			for (int rowCount : arr) {
				System.out.println("受影响的行: " + rowCount);
			}
			conn.commit();*/
			
			// 批处理的优化
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
				System.out.println("受影响的行: " + rowCount);
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