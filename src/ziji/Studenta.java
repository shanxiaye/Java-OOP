package ziji;

public class Studenta {
	String name;
	int age;
	String sex;
	String dizi;
	Studenta(String name,int age,String sex,String dizi){
		this.name=name;this.age=age;
		this.sex=sex;this.dizi=dizi;
	}
	void biao(){
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
		System.out.println("性别："+sex);
		System.out.println("地址："+dizi);
	}
public static void main(String[] args){
	Studenta a=new Studenta("小强",8,"男","武汉");
	a.biao();
}
}
