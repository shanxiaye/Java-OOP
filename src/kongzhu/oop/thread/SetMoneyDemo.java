package kongzhu.oop.thread;

public class SetMoneyDemo extends Thread {

	private Account account;
	
	public SetMoneyDemo() {}
	public SetMoneyDemo(Account account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			account.setMoney(100);
		}
	}

}
