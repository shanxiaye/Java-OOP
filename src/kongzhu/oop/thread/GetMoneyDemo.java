package kongzhu.oop.thread;

public class GetMoneyDemo extends Thread {

	private Account account;
	
	public GetMoneyDemo() {}
	public GetMoneyDemo(Account account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			account.getMoney(100);
		}
	}

}
