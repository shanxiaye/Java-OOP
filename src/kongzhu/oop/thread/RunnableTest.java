package kongzhu.oop.thread;

public class RunnableTest {

	// ���߳�
	public static void main(String[] args) {
		// ����Ŀ�꣩
		RunnableDemo target = new RunnableDemo();
		// �����߳��������߳�
		Thread t1 = new Thread(target);
		Thread t2 = new Thread(target);
		t1.start();
		t2.start();
	}

}
