package kongzhu.lianxi.student;

/**
 * 学院学生类，映射school数据库中的student表
 * @author caiwl
 *
 */
public class SchoolStudent {
	/**
	 * 学号
	 */
	private Integer id;
	/**
	 * 姓名
	 */
	private String studentName;
	/**
	 * 家庭住址
	 */
	private String familyAddress;
	/**
	 * 专业名称
	 */
	private String professionName;
	/**
	 * 宿舍
	 */
	private String dormitory;
	
	public SchoolStudent() {}
	public SchoolStudent(Integer id, String studentName, String familyAddress, String professionName, String dormitory) {
		this.id = id;
		this.studentName = studentName;
		this.familyAddress = familyAddress;
		this.professionName = professionName;
		this.dormitory = dormitory;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getFamilyAddress() {
		return familyAddress;
	}
	public void setFamilyAddress(String familyAddress) {
		this.familyAddress = familyAddress;
	}
	public String getProfessionName() {
		return professionName;
	}
	public void setProfessionName(String professionName) {
		this.professionName = professionName;
	}
	public String getDormitory() {
		return dormitory;
	}
	public void setDormitory(String dormitory) {
		this.dormitory = dormitory;
	}
	
	@Override
	public String toString() {
		return "SchoolStudent [id=" + id + ", studentName=" + studentName + ", familyAddress=" + familyAddress
				+ ", professionName=" + professionName + ", dormitory=" + dormitory + "]";
	}
}
