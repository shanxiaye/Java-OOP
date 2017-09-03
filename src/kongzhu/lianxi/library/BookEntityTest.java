package kongzhu.lianxi.library;

public class BookEntityTest {

	public static void main(String[] args) {
		BookEntity book = new BookEntity(
				100001,
				"Head First Java",
				54.30,
				"塞若",
				"中国电力出版社",
				false);
		System.out.println(book);
		// 设置图书已借出
		book.setBorrowed(true);
		System.out.println(book);
	}

}
