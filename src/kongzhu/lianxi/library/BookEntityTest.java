package kongzhu.lianxi.library;

public class BookEntityTest {

	public static void main(String[] args) {
		BookEntity book = new BookEntity(
				100001,
				"Head First Java",
				54.30,
				"����",
				"�й�����������",
				false);
		System.out.println(book);
		// ����ͼ���ѽ��
		book.setBorrowed(true);
		System.out.println(book);
	}

}
