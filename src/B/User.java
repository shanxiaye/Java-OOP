package B;

public class User {
	/**
	 * �û���
	 */
	String name;
	/**
	 * ����
	 */
	String password;
	/**
	 * Ȩ��
	 */
	String auth;
	
	User() {}
	
	User(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
	void login() {
		if (this.name == "admin" && this.password == "123456") {
			System.out.print("��¼�ɹ�");
			this.auth = "administrator";
			System.out.println("��Ȩ���ǣ�" + this.auth);
		} else if (this.name == "guest" && this.password == "guest") {
			System.out.print("��¼�ɹ�");
			this.auth = "user";
			System.out.println("��Ȩ���ǣ�" + this.auth);
		} else { // ����
			System.out.print("��¼ʧ��");
		}
	}
}
