package ziji;

public class Person {
//�����˵����ԣ�����
	private String name;
//�����˵����ԣ��Ա�1��ʾ�У�0��ʾŮ
	private String sex;
//�����˵����ԣ�����
	private int age;
	//��������get+������������ĸ��д��
	//��������ֵ���ͣ�������������
	//������fan
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

//���췽��
//1.��������������ͬ
//2.�����޷���ֵ����
//3.�޲����Ĺ��췽����ϵͳĬ���Դ���,���ǣ��������������������췽�������޲ι��췽��ʧЧ
public Person () {
	System.out.println("person()��������");
}

public Person (String name,String sex,int age) {
	this.name = name;
	this.sex = sex;
	this.age = age;
}


//�����˵���Ϊ��������
public void dodo() {
	System.out.println("������");
}

void dodo(String name,String what) {
	System.out.println(name+ "����"+ what);
}

String dodo(String name,int age, String what) {
	System.out.println(age+"���"+name+"����"+what);
	return "����������";
}

//�����涨�����ԣ���ʵ��������������
//������ı�����һ���������ƣ���Ϊ��Ա����
//1�����涨����Ϊ����ʵ���ڶ��巽��
//������ķ�����һ���������ƣ���Ϊ��Ա����

public void introduce(String name,String sex,int age){
System.out.println("�ҽ�" +name+ "������" +sex+ "��������" +age+ "�ꡣ");

}
public void introduce(Person person){
System.out.println("�ҽ�" +person.name+ "������" +person.sex+ "��������" +person.age+ "�ꡣ");

}
public void introduce(){};
//public static int AgeException extends Exceotion{
//	try {
//		return getAge;
//	}catch(Exception s){
//		//throw�׳��쳣
//		throw s;
//	}
//}
}

