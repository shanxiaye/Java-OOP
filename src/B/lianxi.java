package B;

public class lianxi {
	public static void main(String[] args){
		User user=new User("admin","123456");
		user.login();
		User user2=new User("guest","guest");
		user2.login();
	}

}
