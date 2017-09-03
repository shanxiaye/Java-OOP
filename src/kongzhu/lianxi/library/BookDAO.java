package kongzhu.lianxi.library;

/**
 * 图书操作接口
 * @author caicai
 */
public interface BookDAO {
	/**
	 * 添加图书
	 * @param book
	 * @return
	 */
	public boolean insertBook(BookEntity book);
	/**
	 * 修改图书信息
	 * @param book
	 * @return
	 */
	public boolean updateBook(BookEntity book);
	/**
	 * 根据图书ID删除图书
	 * @param bookId
	 * @return
	 */
	public boolean deleteBook(int bookId);
	/**
	 * 根据图书ID查询图书信息
	 * @param bookId
	 * @return
	 */
	public BookEntity selectBook(int bookId);
	/**
	 * 查询所有图书信息，返回值由学员自定
	 * @return
	 */
//	public ? selectAllBook();
}
