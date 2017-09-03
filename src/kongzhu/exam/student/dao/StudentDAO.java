package kongzhu.exam.student.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import kongzhu.exam.student.entity.StudentEntity;


public class StudentDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	String insertsql = "insert into student values(?, ?, ?, ?, ?, ?, ?, ?)";
	String deletesql = "delete from student where student_id = ?";
	String selectnamesql = "select * from student where student_name like %?";
	String selectidsql = "select student_id, student_name, student_sex, student_birthday, student_numble, student_qq, student_weixin, student_dizhi from student where student_id = ?";
	
	public void insertStudent(StudentEntity student){
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(insertsql);
			int i =1;
			System.out.println("dfdfvdsjlas");
			pstmt.setInt(i++, student.getStudent_id());
			pstmt.setString(i++, student.getStudent_name());
			pstmt.setString(i++, student.getStudent_sex());
			pstmt.setString(i++, student.getStudent_birthday());
			pstmt.setInt(i++, student.getStudent_numble());
			pstmt.setInt(i++, student.getStudent_qq());
			pstmt.setString(i++, student.getStudent_weixin());
			pstmt.setString(i++, student.getStudent_dizhi());
			int rowcount = pstmt.executeUpdate();
			if(rowcount != 1){
				System.out.println("插入失败");
			}else{
				System.out.println("插入成功");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close();
		}
	}
	public void updateStudent(StudentEntity student){
		try {
			conn = getConnection();
			StringBuffer sb = new StringBuffer();
			sb.append("update student set");
			if(student.getStudent_name() != null){
				sb.append(", Student_name = " + student.getStudent_name());
			}
			if(student.getStudent_sex() != null){
				sb.append(", Student_sex = " + student.getStudent_sex());
			}
			if(student.getStudent_birthday() != null){
				sb.append(", Student_birthday = " + student.getStudent_birthday());
			}
			if(student.getStudent_numble() != null){
				sb.append(", Student_numble = " + student.getStudent_numble());
			}
			if(student.getStudent_qq() != null){
				sb.append(", Student_qq = " + student.getStudent_qq());
			}
			if(student.getStudent_weixin() != null){
				sb.append(", Student_weixin = " + student.getStudent_weixin());
			}
			if(student.getStudent_dizhi() != null){
				sb.append(", Student_dizhi = " + student.getStudent_dizhi());
			}
			sb.append("where student_id = ?");
			pstmt.setInt(1, student.getStudent_id());
			pstmt = conn.prepareStatement(sb.toString());
			int rowcount = pstmt.executeUpdate();
			if(rowcount != 1){
				System.out.println("修改失败");
			}else{
				System.out.println("修改成功");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close();
		}
		
	}
	public void deleteStudent(StudentEntity student){
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(deletesql);
			int rowcount = pstmt.executeUpdate();
			if(rowcount != 1){
				System.out.println("删除失败");
			}else{
				System.out.println("删除成功");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close();
		}
		
	}
	public StudentEntity selectname(String studentname){
		StudentEntity stu = new StudentEntity();
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(selectnamesql);
			pstmt.setString(1, studentname);
			rs = pstmt.executeQuery();
			while(rs.next()){
				int i = 1;
				stu.setStudent_id(rs.getInt(i++));
				System.out.println(stu.getStudent_id());
				stu.setStudent_name(rs.getString(i++));
				System.out.println(stu.getStudent_name());
				stu.setStudent_sex(rs.getString(i++));
				System.out.println(stu.getStudent_sex());
				stu.setStudent_birthday(rs.getString(i++));
				System.out.println(stu.getStudent_birthday());
				stu.setStudent_numble(rs.getInt(i++));
				System.out.println(stu.getStudent_numble());
				stu.setStudent_qq(rs.getInt(i++));
				System.out.println(stu.getStudent_qq());
				stu.setStudent_weixin(rs.getString(i++));
				System.out.println(stu.getStudent_weixin());
				stu.setStudent_dizhi(rs.getString(i++));
				System.out.println(stu.getStudent_dizhi());
				return stu;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close();
		}
		return stu;
	}
	public StudentEntity selectid(Integer studentid){
		StudentEntity stu = new StudentEntity();
		System.out.println("rdhaka");
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(selectidsql);
			pstmt.setInt(1, studentid);
			rs = pstmt.executeQuery();
			while(rs.next()){
				int i = 1;
				stu.setStudent_id(rs.getInt(i++));
				System.out.println(stu.getStudent_id());
				stu.setStudent_name(rs.getString(i++));
				System.out.println(stu.getStudent_name());
				stu.setStudent_sex(rs.getString(i++));
				System.out.println(stu.getStudent_sex());
				stu.setStudent_birthday(rs.getString(i++));
				System.out.println(stu.getStudent_birthday());
				stu.setStudent_numble(rs.getInt(i++));
				System.out.println(stu.getStudent_numble());
				stu.setStudent_qq(rs.getInt(i++));
				System.out.println(stu.getStudent_qq());
				stu.setStudent_weixin(rs.getString(i++));
				System.out.println(stu.getStudent_weixin());
				stu.setStudent_dizhi(rs.getString(i++));
				System.out.println(stu.getStudent_dizhi());
				return stu;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close();
		}
		return stu;
	}
	public Connection getConnection(){
		try {
			Properties pro = new Properties();
			InputStream in = StudentDAO.class.getResourceAsStream("/pro.properties");
			pro.load(in);
			String className = pro.getProperty("className");
			String url = pro.getProperty("url");
			String user = pro.getProperty("user");
			String password = pro.getProperty("password");
			Class.forName(className);
			conn = DriverManager.getConnection(url, user, password);
			return conn;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	public void close(){
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(pstmt != null){
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
