package kongzhu.exam.student.service;

import kongzhu.exam.student.entity.StudentEntity;

public interface StudentService {
	/**
	 * 增加学生
	 */
	public void insertStudent(StudentEntity student);
	/**
	 * 修改学生信息
	 */
	public void updateStudent(StudentEntity student);
	/**
	 * 删除学生
	 */
	public void deleteStudent(StudentEntity student);
	/**
	 * 根据姓名查询学生
	 */
	public void selectname(String studentname);
	/**
	 * 根据学号查询学生
	 */
	public void selectid(Integer studenid);
}
