package kongzhu.lianxi.library;

public class BookStoreTest {

	public static void main(String[] args) {
		BookStore bookStore = new BookStore();
		Integer id = 100003;
		BookEntity bookEntity = new BookEntity();
		bookEntity.setId(id);
		bookEntity.setName("Java编程思想");
//		bookEntity.setPublisher("机械工业出版社");
//		bookEntity.setAuthor("李刚");
		System.out.println(bookStore.borrowBook(bookEntity));
		System.out.println(bookStore.borrowBook(bookEntity));
//		System.out.println(bookStore.returnBook(id));
//		System.out.println(bookStore.returnBook(id));
	}
}
