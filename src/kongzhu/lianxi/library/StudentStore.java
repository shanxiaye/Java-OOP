package kongzhu.lianxi.library;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentStore {

	private ArrayList<StudentEntity> allStudent;
	
	public StudentStore() {
		allStudent = new ArrayList<StudentEntity>();
		
		StudentEntity student1 = new StudentEntity(20170001, "张三", "男", 12);
		StudentEntity student2 = new StudentEntity(20170002, "李四", "男", 15);
		StudentEntity student3 = new StudentEntity(20170003, "王五", "女", 25);
		StudentEntity student4 = new StudentEntity(20170004, "赵六", "女", 23);
		StudentEntity student5 = new StudentEntity(20170005, "钱七", "女", 18);
		
		allStudent.add(student1);
		allStudent.add(student2);
		allStudent.add(student3);
		allStudent.add(student4);
		allStudent.add(student5);
	}

	public StudentEntity getStudent(Integer studentId) {
		StudentEntity s = null;
		Iterator<StudentEntity> it = allStudent.iterator();
		while (it.hasNext()) {
			s = it.next();
			if (s.getId().equals(studentId)) {
				return s;
			}
		}
		return null;
	}

	public ArrayList<StudentEntity> getAllStudent() {
		return allStudent;
	}
	
	public boolean borrowBook(BookStore bookStore, Integer studentId, Integer bookId) {
		// 借书成功
		boolean borrowSuccess = bookStore.borrowBook(studentId, bookId);
		// 学员跟书绑定成功
		boolean bindSuccess = false;
		if (borrowSuccess) {
			StudentEntity s = getStudent(studentId);
			if (s != null) {
				ArrayList<Integer> bookIds = s.getBookIds();
				bookIds.add(bookId);
				s.setBookIds(bookIds);
				bindSuccess = true;
				System.out.println(s);
			}
		}
		return borrowSuccess && bindSuccess;
	}
	
	public boolean returnBook(BookStore bookStore, Integer studentId, Integer bookId) {
		// 还书成功
		boolean returnSuccess = bookStore.returnBook(bookId);
		// 学员跟书解绑成功
		boolean unBindSuccess = false;
		if (returnSuccess) {
			StudentEntity s = getStudent(studentId);
			if (s != null) {
				ArrayList<Integer> bookIds = s.getBookIds();
				Iterator<Integer> it2;
				it2 = bookIds.iterator();
				while (it2.hasNext()) {
					Integer next = it2.next();
					if (next.equals(bookId)) {
						bookIds.remove(bookId);
						unBindSuccess = true;
						break;
					}
				}
				System.out.println(s);
			}
		}
		return returnSuccess && unBindSuccess;
	}

}
