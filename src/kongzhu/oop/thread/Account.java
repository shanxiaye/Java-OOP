package kongzhu.oop.thread;
public class Account {
	/**
	 * �˻����
	 */
	private int balance = 0;
	
	/**
	 * ���
	 * @param money �����
	 */
	public synchronized void setMoney(int money) {
		balance = balance + money;
		System.out.println(Thread.currentThread().getName() + "���δ�" + money + "Ԫ��" + "��" + balance + "Ԫ");
		// ֪ͨȡ���߳̿���ȡ����
		notify();
	}
	
	/**
	 * ȡ��
	 * @param money ȡ����
	 */
	public synchronized void getMoney(int money) {
		if (balance >= money) {
			balance = balance - money;
			System.out.println(Thread.currentThread().getName() + "����ȡ�" + money + "Ԫ��" + "��" + balance + "Ԫ");
		} else {
			System.out.println(Thread.currentThread().getName() + "�˻����㣡");
			try {
				// ��ȡ���̵߳ȴ�����Ǯ��
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
