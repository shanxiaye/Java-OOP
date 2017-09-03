package kongzhu.exam.student.service;

import kongzhu.exam.student.dao.StudentDAO;
import kongzhu.exam.student.entity.StudentEntity;

public class StudentServiceImpl implements StudentService{
	StudentDAO stud = new StudentDAO();

	@Override
	public void insertStudent(StudentEntity student) {
		// TODO Auto-generated method stub

		System.out.println("此");
		if(stud.selectid(student.getStudent_id()) != null){
			System.out.println("此人已存在");
			stud.insertStudent(student);
		}else{
			stud.insertStudent(student);
			System.out.println("此人已");
		}
		
	}

	@Override
	public void updateStudent(StudentEntity student) {
		// TODO Auto-generated method stub
		if(stud.selectid(student.getStudent_id()) != null){
			stud.updateStudent(student);
		}else{
			System.out.println("此人不存在");
		}
		
	}

	@Override
	public void deleteStudent(StudentEntity student) {
		if(stud.selectid(student.getStudent_id()) != null){
			stud.deleteStudent(student);;
		}else{
			System.out.println("此人不存在");
		}
		
	}

	@Override
	public void selectname(String studentname) {
		stud.selectname(studentname);
	}

	@Override
	public void selectid(Integer studentid) {
		stud.selectid(studentid);
	}

}
