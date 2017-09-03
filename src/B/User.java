package B;

public class User {
	/**
	 * 用户名
	 */
	String name;
	/**
	 * 密码
	 */
	String password;
	/**
	 * 权限
	 */
	String auth;
	
	User() {}
	
	User(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
	void login() {
		if (this.name == "admin" && this.password == "123456") {
			System.out.print("登录成功");
			this.auth = "administrator";
			System.out.println("，权限是：" + this.auth);
		} else if (this.name == "guest" && this.password == "guest") {
			System.out.print("登录成功");
			this.auth = "user";
			System.out.println("，权限是：" + this.auth);
		} else { // 否则
			System.out.print("登录失败");
		}
	}
}
