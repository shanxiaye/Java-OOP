package kongzhu.oop.thread;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account();
		
		SetMoneyDemo set = new SetMoneyDemo(account);
		set.start();
		
		GetMoneyDemo get = new GetMoneyDemo(account);
		get.start();
	}

}
