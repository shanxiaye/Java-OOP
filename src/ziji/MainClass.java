package ziji;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//ʹ�ùؼ���new����һ��������������Ϊʵ����
//		Person person;
//		person = new Person();
//		//ʹ�ö�����.��Ա����������������������ĳ��ֵ
//		/*person.name = "������";
//		person.sex = "��";
//		person.age = 108;*/
//		System.out.println("�ҽ�" +person.name+ "������" +person.sex+ "��������" +person.age+ "�ꡣ");
//		System.out.println(person.age);
//		//ʹ�ö�����.��Ա������ִ�ж����ĳ����Ϊ
//		person.dodo();
//		Person person2;
//		person2 = new Person("���޼�","��",18);
//		System.out.println("�ҽ�" +person2.name+ "������" +person2.sex+ "��������" +person2.age+ "�ꡣ");
//		
//		person.dodo("����", "˯��");
//		
//
//		Person person3 = new Person("��","��",1);
//		System.out.println("�ҽ�" +person3.name+ "������" +person3.sex+ "��������" +person3.age+ "�ꡣ");
//
//		System.out.println(Person.headCount);
		Person p=new Person();
		p.setName("�ƶ�");
		System.out.println(p.getName());
		p.setAge(-18);
		System.out.println(p.getAge());
		p.setSex("��");
		System.out.println(p.getSex());
		p.dodo();
		
	}

}
