package ziji;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//使用关键字new创建一个对象，这个步骤称为实例化
//		Person person;
//		person = new Person();
//		//使用对象名.成员名变量名给对象属性设置某个值
//		/*person.name = "张三丰";
//		person.sex = "男";
//		person.age = 108;*/
//		System.out.println("我叫" +person.name+ "，我是" +person.sex+ "生，今年" +person.age+ "岁。");
//		System.out.println(person.age);
//		//使用对象名.成员方法名执行对象的某个行为
//		person.dodo();
//		Person person2;
//		person2 = new Person("张无忌","男",18);
//		System.out.println("我叫" +person2.name+ "，我是" +person2.sex+ "生，今年" +person2.age+ "岁。");
//		
//		person.dodo("张三", "睡觉");
//		
//
//		Person person3 = new Person("张","男",1);
//		System.out.println("我叫" +person3.name+ "，我是" +person3.sex+ "生，今年" +person3.age+ "岁。");
//
//		System.out.println(Person.headCount);
		Person p=new Person();
		p.setName("云儿");
		System.out.println(p.getName());
		p.setAge(-18);
		System.out.println(p.getAge());
		p.setSex("男");
		System.out.println(p.getSex());
		p.dodo();
		
	}

}
