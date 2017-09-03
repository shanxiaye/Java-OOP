package kongzhu.lianxi.library;

/**
 * ͼ����
 * @author kongzhu
 *
 */
public class BookEntity {
	/**
	 * ��ı��
	 */
	private Integer id;
	/**
	 * ����
	 */
	private String name;
	/**
	 * ��ļ۸�
	 */
	private double price;
	/**
	 * �������
	 */
	private String author;
	/**
	 * ��ĳ�����
	 */
	private String publisher;
	/**
	 * ���Ƿ���
	 */
	private boolean isBorrowed;
	/**
	 * ���ѽ��ʱ�������ѧԱID
	 */
	private Integer studentId;

	public BookEntity() {}
	public BookEntity(int id, String name, double price, String author, String publisher, boolean isBorrowed) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
		this.isBorrowed = isBorrowed;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public boolean isBorrowed() {
		return isBorrowed;
	}
	public void setBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "BookEntity ["
				+ "���=" + id + ", "
//				+ "����=" + name + ", "
//				+ "�۸�=" + price + ", "
//				+ "����=" + author + ", "
//				+ "������=" + publisher + ", "
				+ "�ѽ��=" + isBorrowed + ","
				+ "ѧԱID=" + studentId + "]";
	}

}
