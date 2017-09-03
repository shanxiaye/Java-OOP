package ziji;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 员工类
 * @author Administrator
 *
 */
 class Employeed {
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 出生年份
	 */
	private int year;
	/**
	 * 出生日期
	 */
	private Date hireDate;
	/**
	 * 岗位
	 */
	private String job;
	/**
	 * 薪水
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
	 * 打卡
	 */
	public void clock() {
		System.out.println(this.name +"打卡了");
	}
	/**
	 * 上班
	 */
	public void clockIn() {
		clockInOrOut("上");
	}
	/**
	 * 下班
	 */
	public void clockOut() {
		clockInOrOut("下");
	}
	
	/**
	 * 员工上下班
	 * @param inOrOut “上”表示上班，“下”表示下班
	 */
	private void clockInOrOut(String inOrOut) {
//		clock();
		SimpleDateFormat format = new SimpleDateFormat(
				"yyyy/MM/dd HH:mm"); // 2017/03/27 20:00
//				"yyyy/M/dd HH:mm"); // 2017/3/27 20:00
		System.out.println(this.name +
				format.format(new Date()) + "打卡" +
				inOrOut + "班");
	}
}

/**
 * 经理类
 * @author Administrator
 *
 */
 class Managerd extends Employeed {
	/**
	 * 岗位级别
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
	 * 经理跟下属谈话
	 */
	public void talkWithEmployee(Employeed employee) {
		System.out.println("经理" + getName() + "跟"
				+ "下属" + employee.getName() + "谈话");
	}
	
	/**
	 * 招聘
	 */
	public void recruit(Employeed employee) {
		System.out.println("经理" + getName() + "在招聘"
				+ "新员工" + employee.getName());
	}
	
	/**
	 * 辞退员工
	 */
	public void fire(Employeed employee) {
		System.out.println("经理" + getName() + "辞退"
				+ "员工" + employee.getName());
	}

	void d(){};
}

public class TestDemo {

	public static void main(String[] args) {
//		Employeed employee = new Employeed(
//				"王", 1995, new Date(), "实习", 2000.0);
//		employee.clockIn();
//		employee.clockOut();
		
		Managerd manager = new Managerd(
				"张无忌", 1800, new Date(), "经理", 4000.0,
				"普通经理");
		manager.clockIn();
		manager.clockOut();
		
//		manager.recruit(employee);
//		manager.talkWithEmployee(employee);
//		manager.fire(employee);
		
		Employeed e2 = manager; // 向上转型：父类引用指向子类对象
//		Managerd m2 = (Managerd) e2;
	}

}

