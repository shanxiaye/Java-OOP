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
		System.out.println("������"+name);
		System.out.println("���䣺"+age);
		System.out.println("�Ա�"+sex);
		System.out.println("��ַ��"+dizi);
	}
public static void main(String[] args){
	Studenta a=new Studenta("Сǿ",8,"��","�人");
	a.biao();
}
}
