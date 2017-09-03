package kongzhu.lianxi.library;

/**
 * 图书类
 * @author kongzhu
 *
 */
public class BookEntity {
	/**
	 * 书的编号
	 */
	private Integer id;
	/**
	 * 书名
	 */
	private String name;
	/**
	 * 书的价格
	 */
	private double price;
	/**
	 * 书的作者
	 */
	private String author;
	/**
	 * 书的出版社
	 */
	private String publisher;
	/**
	 * 书是否借出
	 */
	private boolean isBorrowed;
	/**
	 * 书已借出时，借书的学员ID
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
				+ "编号=" + id + ", "
//				+ "书名=" + name + ", "
//				+ "价格=" + price + ", "
//				+ "作者=" + author + ", "
//				+ "出版社=" + publisher + ", "
				+ "已借出=" + isBorrowed + ","
				+ "学员ID=" + studentId + "]";
	}

}
