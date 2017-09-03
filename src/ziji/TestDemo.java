package ziji;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Ա����
 * @author Administrator
 *
 */
 class Employeed {
	/**
	 * ����
	 */
	private String name;
	/**
	 * �������
	 */
	private int year;
	/**
	 * ��������
	 */
	private Date hireDate;
	/**
	 * ��λ
	 */
	private String job;
	/**
	 * нˮ
	 */
	private double com;
	
	public Employeed() {}
	public Employeed(String name, int year, Date hireDate,
			String job, double com) {
		this.name = name;
		this.year = year;
		this.hireDate = hireDate;
		this.job = job;
		this.com = com;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getCom() {
		return com;
	}
	public void setCom(double com) {
		this.com = com;
	}
	
	/**
	 * ��
	 */
	public void clock() {
		System.out.println(this.name +"����");
	}
	/**
	 * �ϰ�
	 */
	public void clockIn() {
		clockInOrOut("��");
	}
	/**
	 * �°�
	 */
	public void clockOut() {
		clockInOrOut("��");
	}
	
	/**
	 * Ա�����°�
	 * @param inOrOut ���ϡ���ʾ�ϰ࣬���¡���ʾ�°�
	 */
	private void clockInOrOut(String inOrOut) {
//		clock();
		SimpleDateFormat format = new SimpleDateFormat(
				"yyyy/MM/dd HH:mm"); // 2017/03/27 20:00
//				"yyyy/M/dd HH:mm"); // 2017/3/27 20:00
		System.out.println(this.name +
				format.format(new Date()) + "��" +
				inOrOut + "��");
	}
}

/**
 * ������
 * @author Administrator
 *
 */
 class Managerd extends Employeed {
	/**
	 * ��λ����
	 */
	private String jobLevel;
	
	public Managerd() {
//		super();
	}
	public Managerd(String name, int year, Date hireDate,
			String job, double com, String jobLevel) {
		super(name, year, hireDate, jobLevel, com);
		this.jobLevel = jobLevel;
	}

	public String getJobLevel() {
		return jobLevel;
	}
	public void setJobLevel(String jobLevel) {
		this.jobLevel = jobLevel;
	}
	
	/**
	 * ���������̸��
	 */
	public void talkWithEmployee(Employeed employee) {
		System.out.println("����" + getName() + "��"
				+ "����" + employee.getName() + "̸��");
	}
	
	/**
	 * ��Ƹ
	 */
	public void recruit(Employeed employee) {
		System.out.println("����" + getName() + "����Ƹ"
				+ "��Ա��" + employee.getName());
	}
	
	/**
	 * ����Ա��
	 */
	public void fire(Employeed employee) {
		System.out.println("����" + getName() + "����"
				+ "Ա��" + employee.getName());
	}

	void d(){};
}

public class TestDemo {

	public static void main(String[] args) {
//		Employeed employee = new Employeed(
//				"��", 1995, new Date(), "ʵϰ", 2000.0);
//		employee.clockIn();
//		employee.clockOut();
		
		Managerd manager = new Managerd(
				"���޼�", 1800, new Date(), "����", 4000.0,
				"��ͨ����");
		manager.clockIn();
		manager.clockOut();
		
//		manager.recruit(employee);
//		manager.talkWithEmployee(employee);
//		manager.fire(employee);
		
		Employeed e2 = manager; // ����ת�ͣ���������ָ���������
//		Managerd m2 = (Managerd) e2;
	}

}

