package kongzhu.lianxi.library;

/**
 * ѧԱ�����ӿ�
 * @author caicai
 */
public interface StudentDAO {
	/**
	 * ����ͼ��
	 * @param book
	 * @return
	 */
	public boolean borrowBook(BookEntity book);
	/**
	 * �黹ͼ��
	 * @param book
	 * @return
	 */
	public boolean returnBook(BookEntity book);
}
