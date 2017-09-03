package kongzhu.oop.thread;
public class Account {
	/**
	 * 账户余额
	 */
	private int balance = 0;
	
	/**
	 * 存款
	 * @param money 存款金额
	 */
	public synchronized void setMoney(int money) {
		balance = balance + money;
		System.out.println(Thread.currentThread().getName() + "本次存款：" + money + "元，" + "余额：" + balance + "元");
		// 通知取款线程可以取款了
		notify();
	}
	
	/**
	 * 取款
	 * @param money 取款金额
	 */
	public synchronized void getMoney(int money) {
		if (balance >= money) {
			balance = balance - money;
			System.out.println(Thread.currentThread().getName() + "本次取款：" + money + "元，" + "余额：" + balance + "元");
		} else {
			System.out.println(Thread.currentThread().getName() + "账户余额不足！");
			try {
				// 让取款线程等待（存钱）
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
