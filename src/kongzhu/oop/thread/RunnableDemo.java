package kongzhu.oop.thread;
public class RunnableDemo implements Runnable {

	private int count = 4;
	@Override
	public void run() {
		while (count > 0) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " A");
			String str = "�߳�����" + name + ", ��λ�ţ�" + count;
			System.out.println(name + " B");
			count = count - 1;
			System.out.println(str);
		}
	}

}
