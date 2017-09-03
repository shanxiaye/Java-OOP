package kongzhu.lianxi.library;

import java.util.ArrayList;

public class StudentEntity {
	private Integer id;
	private String name;
	private String sex;
	private Integer age;
	private ArrayList<Integer> bookIds;
	
	public StudentEntity() {} 
	
	public StudentEntity(Integer id, String name, String sex, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.bookIds = new ArrayList<Integer>();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public ArrayList<Integer> getBookIds() {
		return bookIds;
	}
	public void setBookIds(ArrayList<Integer> bookIds) {
		this.bookIds = bookIds;
	}
	
	@Override
	public String toString() {
		return "StudentEntity ["
				+ "学号=" + id + ", "
				+ "姓名=" + name + ", "
//				+ "性别=" + sex + ", "
//				+ "年龄=" + age + ", "
				+ "已借图书ID=" + bookIds + "]";
	}
	
}
