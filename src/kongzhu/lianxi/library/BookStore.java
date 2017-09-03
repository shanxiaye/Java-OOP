package kongzhu.lianxi.library;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ͼ���
 * @author kongzhu
 *
 */
public class BookStore {
	private ArrayList<BookEntity> allBook;
	
	public BookStore() {
		allBook = new ArrayList<BookEntity>();
		BookEntity book1 = new BookEntity(100001, "Head First Java", 54.30, "����", "�й�����������", false);
		BookEntity book2 = new BookEntity(100002, "Java���ļ���", 94.00, "��˹���������ڶ�", "��е��ҵ������", false);
		BookEntity book3 = new BookEntity(100003, "Java���˼��", 86.40, "Bruce Eckel", "��е��ҵ������", false);
		BookEntity book4 = new BookEntity(100004, "Java����ʵս1200��", 75.80, "����ξ", "�廪��ѧ������", false);
		BookEntity book5 = new BookEntity(100005, "���Java����", 86.10, "���", "���ӹ�ҵ������", false);
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
	 * ����
	 * @param studentId
	 * @param bookId
	 * @return
	 */
	public boolean borrowBook(Integer studentId, Integer bookId) {
		// ���м�������ڼ��list�������Ƿ�������Ϊid������Ϊname��ͼ��
		boolean has = false;
		// ���м������ʾ����ǰ�����ѱ�����
		boolean isBorrowed = false;
		Integer bindStudentId = null;
		BookEntity book; // Ϊ���ظ�����
		Iterator<BookEntity> it = allBook.iterator();
		while (it.hasNext()) {
			book = it.next();
			if (book.getId().equals(bookId)) {
				has = true;
				// ����֮ǰ�������Ƿ��ѱ�����
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
		// �����Ƿ�ɹ�
		boolean result = false;
		if (has) {
			if (isBorrowed) {
				System.out.println("����" + bookId + "�ѱ�" + bindStudentId + "���ģ�");
			} else {
				System.out.println(studentId + "����" + bookId + "�ɹ���");
				result = true;
			}
		} else {
			System.out.println("ͼ������޸���" + bookId + "���޷����ģ�");
		}
		
		it = allBook.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		return result;
	}

	/**
	 * ����
	 * @param bookEntity
	 * @return
	 */
	public boolean borrowBook(BookEntity bookEntity) {
		// ���м�������ڼ��list�������Ƿ�������Ϊid������Ϊname��ͼ��
		boolean has = false;
		// ���м������ʾ����ǰ�����ѱ�����
		boolean isBorrowed = false;
		BookEntity book; // Ϊ���ظ�����
		Iterator<BookEntity> it = allBook.iterator();
		while (it.hasNext()) {
			book = it.next();
			if (book.getId().equals(bookEntity.getId())
					|| book.getName().equals(bookEntity.getName())) {
				has = true;
				// ����֮ǰ�������Ƿ��ѱ�����
				if (book.isBorrowed()) {
					isBorrowed = true;
				} else {
					book.setBorrowed(true);
				}
				break;
			}
		}
		// �����Ƿ�ɹ�
		boolean result = false;
		if (has) {
			if (isBorrowed) {
				System.out.println("�����ѱ�XXX���ģ�");
			} else {
				System.out.println("XXX����ɹ���");
				result = true;
			}
		} else {
			System.out.println("ͼ������޸��飬�޷����ģ�");
		}
		
		it = allBook.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		return result;
	}
	
	/**
	 * ����
	 * @param bookId
	 * @return
	 */
	public boolean returnBook(Integer bookId) {
		// ���м�������ڼ��list�������Ƿ�������Ϊid��ͼ��
		boolean has = false;
		// ����ɹ�״̬
		boolean isReturn = false;
		Integer bindStudentId = null;
		BookEntity book; // Ϊ���ظ�����
		Iterator<BookEntity> it = allBook.iterator();
		while (it.hasNext()) {
			book = it.next();
			if (book.getId().equals(bookId)) {
				has = true;
				// ����֮ǰ�������Ƿ��ѱ�����
				if (book.isBorrowed()) {
					book.setBorrowed(false);
					bindStudentId = book.getStudentId();
					book.setStudentId(null);
					isReturn = true;
					break;
				}
			}
		}
		// �����Ƿ�ɹ�
		boolean result = false;
		if (has) {
			if (isReturn) {
				System.out.println(bindStudentId + "����" + bookId + "�ɹ���");
				result = true;
			} else {
				System.out.println("����δ�����ģ��޷����飡");
			}
		} else {
			System.out.println("ͼ������޸��飬�޷����飡");
		}
		
		it = allBook.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		return result;
	}
}
