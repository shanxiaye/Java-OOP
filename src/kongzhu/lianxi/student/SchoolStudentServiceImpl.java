package kongzhu.lianxi.student;

public class SchoolStudentServiceImpl implements SchoolStudentService {

	private SchoolStudentDAO dao;
	
	public SchoolStudentServiceImpl() {
		dao = new SchoolStudentDAO();
	}
	
	@Override
	public int insertStudent(SchoolStudent student) {
		return dao.insertStudent(student);
	}

	@Override
	public int deleteStudent(Integer id) {
		return dao.deleteStudent(id);
	}

	@Override
	public int updateStudent(SchoolStudent student) {
		return dao.updateStudent(student);
	}

	@Override
	public int[] exchangeStudentDormitory(SchoolStudent stu1, SchoolStudent stu2) {
		return dao.exchangeStudentDormitory(stu1, stu2);
	}

	@Override
	public SchoolStudent selectStudent(Integer id) {
		return dao.selectStudent(id);
	}

}
