package ziji;

public class Person {
//定义人的属性：姓名
	private String name;
//定义人的属性：性别，1表示男，0表示女
	private String sex;
//定义人的属性：年龄
	private int age;
	//方法名：get+属性名（首字母大写）
	//方法返回值类型：就是属性类型
	//方法的fan
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getSex(){
		return sex;
	}
	public void setSex(String sex) {
		this.sex=sex;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age) {
		if(age>0){
		this.age=age;
		}
	}


	public static int headCount =1;

//构造方法
//1.方法名与类名相同
//2.方法无返回值类型
//3.无参数的构造方法是系统默认自带的,但是，如果类里面存在其他构造方法，该无参构造方法失效
public Person () {
	System.out.println("person()被调用了");
}

public Person (String name,String sex,int age) {
	this.name = name;
	this.sex = sex;
	this.age = age;
}


//定义人的行为：做事情
public void dodo() {
	System.out.println("做事情");
}

void dodo(String name,String what) {
	System.out.println(name+ "正在"+ what);
}

String dodo(String name,int age, String what) {
	System.out.println(age+"岁的"+name+"正在"+what);
	return "事情做完了";
}

//类里面定义属性，其实是在声明变量，
//类里面的变量有一个特殊名称，成为成员变量
//1类里面定义行为，其实是在定义方法
//类里面的方法有一个特殊名称，成为成员方法

public void introduce(String name,String sex,int age){
System.out.println("我叫" +name+ "，我是" +sex+ "生，今年" +age+ "岁。");

}
public void introduce(Person person){
System.out.println("我叫" +person.name+ "，我是" +person.sex+ "生，今年" +person.age+ "岁。");

}
public void introduce(){};
//public static int AgeException extends Exceotion{
//	try {
//		return getAge;
//	}catch(Exception s){
//		//throw抛出异常
//		throw s;
//	}
//}
}

