package kongzhu.lianxi.library;

public class StudentEntityTest {

	public static void main(String[] args) {
		Integer studentId = 20170001;
		StudentEntity s = new StudentEntity(
				studentId,
				"����ʤ",
				"��",
				18);
		System.out.println(s);
	}

}
