package kongzhu.lianxi.library;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 图书馆
 * @author kongzhu
 *
 */
public class BookStore {
	private ArrayList<BookEntity> allBook;
	
	public BookStore() {
		allBook = new ArrayList<BookEntity>();
		BookEntity book1 = new BookEntity(100001, "Head First Java", 54.30, "塞若", "中国电力出版社", false);
		BookEntity book2 = new BookEntity(100002, "Java核心技术", 94.00, "霍斯特曼，科内尔", "机械工业出版社", false);
		BookEntity book3 = new BookEntity(100003, "Java编程思想", 86.40, "Bruce Eckel", "机械工业出版社", false);
		BookEntity book4 = new BookEntity(100004, "Java开发实战1200例", 75.80, "李钟尉", "清华大学出版社", false);
		BookEntity book5 = new BookEntity(100005, "疯狂Java讲义", 86.10, "李刚", "电子工业出版社", false);
		allBook.add(book1);
		allBook.add(book2);
		allBook.add(book3);
		allBook.add(book4);
		allBook.add(book5);
	}

	public ArrayList<BookEntity> getAllBook() {
		return allBook;
	}

	/**
	 * 借书
	 * @param studentId
	 * @param bookId
	 * @return
	 */
	public boolean borrowBook(Integer studentId, Integer bookId) {
		// 该中间变量用于检查list集合中是否包含编号为id或书名为name的图书
		boolean has = false;
		// 该中间变量表示借书前该书已被借阅
		boolean isBorrowed = false;
		Integer bindStudentId = null;
		BookEntity book; // 为了重复利用
		Iterator<BookEntity> it = allBook.iterator();
		while (it.hasNext()) {
			book = it.next();
			if (book.getId().equals(bookId)) {
				has = true;
				// 借书之前检查该书是否已被借阅
				if (book.isBorrowed()) {
					isBorrowed = true;
					bindStudentId = book.getStudentId();
				} else {
					book.setBorrowed(true);
					book.setStudentId(studentId);
				}
				break;
			}
		}
		// 借书是否成功
		boolean result = false;
		if (has) {
			if (isBorrowed) {
				System.out.println("该书" + bookId + "已被" + bindStudentId + "借阅！");
			} else {
				System.out.println(studentId + "借书" + bookId + "成功！");
				result = true;
			}
		} else {
			System.out.println("图书馆暂无该书" + bookId + "，无法借阅！");
		}
		
		it = allBook.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		return result;
	}

	/**
	 * 借书
	 * @param bookEntity
	 * @return
	 */
	public boolean borrowBook(BookEntity bookEntity) {
		// 该中间变量用于检查list集合中是否包含编号为id或书名为name的图书
		boolean has = false;
		// 该中间变量表示借书前该书已被借阅
		boolean isBorrowed = false;
		BookEntity book; // 为了重复利用
		Iterator<BookEntity> it = allBook.iterator();
		while (it.hasNext()) {
			book = it.next();
			if (book.getId().equals(bookEntity.getId())
					|| book.getName().equals(bookEntity.getName())) {
				has = true;
				// 借书之前检查该书是否已被借阅
				if (book.isBorrowed()) {
					isBorrowed = true;
				} else {
					book.setBorrowed(true);
				}
				break;
			}
		}
		// 借书是否成功
		boolean result = false;
		if (has) {
			if (isBorrowed) {
				System.out.println("该书已被XXX借阅！");
			} else {
				System.out.println("XXX借书成功！");
				result = true;
			}
		} else {
			System.out.println("图书馆暂无该书，无法借阅！");
		}
		
		it = allBook.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		return result;
	}
	
	/**
	 * 还书
	 * @param bookId
	 * @return
	 */
	public boolean returnBook(Integer bookId) {
		// 该中间变量用于检查list集合中是否包含编号为id的图书
		boolean has = false;
		// 还书成功状态
		boolean isReturn = false;
		Integer bindStudentId = null;
		BookEntity book; // 为了重复利用
		Iterator<BookEntity> it = allBook.iterator();
		while (it.hasNext()) {
			book = it.next();
			if (book.getId().equals(bookId)) {
				has = true;
				// 还书之前检查该书是否已被借阅
				if (book.isBorrowed()) {
					book.setBorrowed(false);
					bindStudentId = book.getStudentId();
					book.setStudentId(null);
					isReturn = true;
					break;
				}
			}
		}
		// 还书是否成功
		boolean result = false;
		if (has) {
			if (isReturn) {
				System.out.println(bindStudentId + "还书" + bookId + "成功！");
				result = true;
			} else {
				System.out.println("该书未被借阅，无法还书！");
			}
		} else {
			System.out.println("图书馆暂无该书，无法还书！");
		}
		
		it = allBook.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		return result;
	}
}
