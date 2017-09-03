package kongzhu.oop;

import ziji.Person;

//继承关键字：extends
//Student称之为子类，Person称之为父类
//子类就拥有了父类的属性和方法
//但是父类中private属性和方法无法拥有
public class Student extends Person {
	private int score;
	public int getScore() {
		return score;
	}
	public void setScore(int score){
		this.score=score;
	}
	
	
	public Student(){

		System.out.println("person()被调用了");
	}
	
	public void study(){
		
		System.out.println("好好学习天天向上");
	}
	//final不能被继承
	public final void doTaiJi(){
		System.out.println("打太极");
	}

}
