package kongzhu.lianxi.library;

public class StudentStoreTest {

	public static void main(String[] args) {
		// ѧ�������ݺ�ͼ����½�һ�μ���
		StudentStore studentStore = new StudentStore();
		BookStore bookStore = new BookStore();
		
		Integer studentId;
		Integer bookId;
		
		studentId = 20170002;
		System.out.println(studentStore.getStudent(studentId));
		
		bookId = 100003;
		studentStore.borrowBook(bookStore, studentId, bookId);
		bookId = 100004;
		studentStore.borrowBook(bookStore, studentId, bookId);
		
		bookId = 100003;
		studentStore.returnBook(bookStore, studentId, bookId);
		
		bookId = 100004;
		studentStore.returnBook(bookStore, studentId, bookId);
	}

}
