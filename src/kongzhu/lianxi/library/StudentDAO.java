package kongzhu.lianxi.library;

/**
 * 学员操作接口
 * @author caicai
 */
public interface StudentDAO {
	/**
	 * 借阅图书
	 * @param book
	 * @return
	 */
	public boolean borrowBook(BookEntity book);
	/**
	 * 归还图书
	 * @param book
	 * @return
	 */
	public boolean returnBook(BookEntity book);
}
