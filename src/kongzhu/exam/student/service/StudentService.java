package kongzhu.exam.student.service;

import kongzhu.exam.student.entity.StudentEntity;

public interface StudentService {
	/**
	 * ����ѧ��
	 */
	public void insertStudent(StudentEntity student);
	/**
	 * �޸�ѧ����Ϣ
	 */
	public void updateStudent(StudentEntity student);
	/**
	 * ɾ��ѧ��
	 */
	public void deleteStudent(StudentEntity student);
	/**
	 * ����������ѯѧ��
	 */
	public void selectname(String studentname);
	/**
	 * ����ѧ�Ų�ѯѧ��
	 */
	public void selectid(Integer studenid);
}
