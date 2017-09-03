package kongzhu.lianxi.library;

public class LibraryDemo {

	public static void main(String[] args) {
		// 1.新建包kongzhu.lianxi.library
		// 2.定义图书类BookEntity
		// 内含属性：
		// id-编号
		// name-书名
		// price-价格
		// author-作者
		// publisher-出版社
		// isBorrowed-默认未借出，学员借书时修改为已借出
		// 无参和有参构造方法，getter和setter方法
		// 重写toString()，返回图书介绍
		
		// 3.定义图书仓库BookStore
		// 一个属性allBook，集合类存储所有图书
		// 一个方法，获取全部图书allBook()
		// 方法里面初始化五本关于Java的图书给属性allBook
		// 编号：100001-100005，图书其他信息百度
		// 另外两个方法，借书borrowBook(BookEntity)和还书returnBook(BookEntity)
		
		// 4.查询图书信息，在main方法里面使用迭代器遍历
		
		// 5.已经定义了一个接口BookDAO，方法包括图书的增删改查
		// 要求学员编写实现类BookDAOImpl，将方法体完善
		
		// 6.定义一个学员类StudentEntity
		// 内含属性：
		// id-学号
		// name-姓名
		// sex-性别
		// age-年龄
		// books-集合类，已经借阅的图书
		// 无参和有参构造方法，getter和setter方法
		// 重写toString()，返回学员介绍
		
		// 7.创建学员档案StudentStore
		// 一个属性allStudent，集合类存储所有学员
		// 一个方法，获取所有学员信息allStudent()
		// 方法里面初始化5位学员信息
		// 学号：100001-100005
		
		// 8暂不做
		// 8.已经定义了一个接口StudentDAO，方法包括借书和还书
		// 要求学员编写实现类StudentDAOImpl，将方法体完善
		
		// 9.创建一个图书管理员BookManager，就一个main方法
		// 方法里面需要实现控制台输入输出
		// 控制台首先输入学员学号或姓名，其他非法信息给出提示
		// 管理员查询是否存在该学员，存在则询问需要借书还是还书，不存在则给出提示
		// 还书则直接还书，图书放回图书仓库，提示还书成功
		// 学员借书则询问借什么书，可输入图书编号或书名
		// 管理员查询是否存在该图书，不存在给出提示
		// 存在且已借出给出提示，存在未借出则可借阅
	}

}
