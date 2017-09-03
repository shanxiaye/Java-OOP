package kongzhu.lianxi.student;


public interface SchoolStudentService {
	int insertStudent(SchoolStudent student);
	
	int deleteStudent(Integer id);
	
	int updateStudent(SchoolStudent student);
	
	int[] exchangeStudentDormitory(SchoolStudent stu1, SchoolStudent stu2);
	
	SchoolStudent selectStudent(Integer id);
}
