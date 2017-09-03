package ziji;

import kongzhu.oop.Student;

public class Javastudent extends Student  {
	//Java语言继承重要概念————重写<override>
	//子类对父类里面可以访问的方法的方法体重新编写，方法定义不能变
	//————外壳不变，核心重写
	public void study(){
		System.out.println("Java学生学习Java");
	}
	public void dodo(){
		System.out.println("Java学生学习Java");
	}

}
