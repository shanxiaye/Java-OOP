package kongzhu.lianxi.library;

/**
 * ͼ������ӿ�
 * @author caicai
 */
public interface BookDAO {
	/**
	 * ���ͼ��
	 * @param book
	 * @return
	 */
	public boolean insertBook(BookEntity book);
	/**
	 * �޸�ͼ����Ϣ
	 * @param book
	 * @return
	 */
	public boolean updateBook(BookEntity book);
	/**
	 * ����ͼ��IDɾ��ͼ��
	 * @param bookId
	 * @return
	 */
	public boolean deleteBook(int bookId);
	/**
	 * ����ͼ��ID��ѯͼ����Ϣ
	 * @param bookId
	 * @return
	 */
	public BookEntity selectBook(int bookId);
	/**
	 * ��ѯ����ͼ����Ϣ������ֵ��ѧԱ�Զ�
	 * @return
	 */
//	public ? selectAllBook();
}
