package kongzhu.oop;

import ziji.Person;

//�̳йؼ��֣�extends
//Student��֮Ϊ���࣬Person��֮Ϊ����
//�����ӵ���˸�������Ժͷ���
//���Ǹ�����private���Ժͷ����޷�ӵ��
public class Student extends Person {
	private int score;
	public int getScore() {
		return score;
	}
	public void setScore(int score){
		this.score=score;
	}
	
	
	public Student(){

		System.out.println("person()��������");
	}
	
	public void study(){
		
		System.out.println("�ú�ѧϰ��������");
	}
	//final���ܱ��̳�
	public final void doTaiJi(){
		System.out.println("��̫��");
	}

}
