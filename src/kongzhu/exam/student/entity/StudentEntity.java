package kongzhu.exam.student.entity;

public class StudentEntity {
	/**
	 * 学号
	 */
	private Integer student_id;
	/**
	 * 姓名
	 */
	private String student_name;
	/**
	 * 性别
	 */
	private String student_sex;
	/**
	 * 出生年月
	 */
	private String student_birthday;
	/**
	 * 手机号码
	 */
	private Integer student_numble;
	/**
	 * 学生QQ
	 */
	private Integer student_qq;
	/**
	 * 学生微信
	 */
	private String student_weixin;
	/**
	 * 学生地址
	 */
	private String student_dizhi;
	public StudentEntity(){}
	public StudentEntity(Integer student_id, String student_name, String student_sex, String student_birthday, Integer student_numble, Integer student_qq, String student_weixin, String student_dizhi){
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_sex = student_sex;
		this.student_birthday = student_birthday;
		this.student_numble = student_numble;
		this.student_qq = student_qq;
		this.student_weixin = student_weixin;
		this.student_dizhi = student_dizhi;
		
	}
	public Integer getStudent_id() {
		return student_id;
	}
	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_sex() {
		return student_sex;
	}
	public void setStudent_sex(String student_sex) {
		this.student_sex = student_sex;
	}
	public String getStudent_birthday() {
		return student_birthday;
	}
	public void setStudent_birthday(String student_birthday) {
		this.student_birthday = student_birthday;
	}
	public Integer getStudent_numble() {
		return student_numble;
	}
	public void setStudent_numble(Integer student_numble) {
		this.student_numble = student_numble;
	}
	public Integer getStudent_qq() {
		return student_qq;
	}
	public void setStudent_qq(Integer student_qq) {
		this.student_qq = student_qq;
	}
	public String getStudent_weixin() {
		return student_weixin;
	}
	public void setStudent_weixin(String student_weixin) {
		this.student_weixin = student_weixin;
	}
	public String getStudent_dizhi() {
		return student_dizhi;
	}
	public void setStudent_dizhi(String student_dizhi) {
		this.student_dizhi = student_dizhi;
	}
	@Override
	public String toString() {
		return "StudentDAO [student_id=" + student_id + ", student_name=" + student_name + ", student_sex="
				+ student_sex + ", student_birthday=" + student_birthday + ", student_numble=" + student_numble
				+ ", student_qq=" + student_qq + ", student_weixin=" + student_weixin + ", student_dizhi="
				+ student_dizhi + "]";
	}

}
