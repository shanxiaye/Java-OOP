package kongzhu.oop.thread;

public class RunnableTest {

	// 主线程
	public static void main(String[] args) {
		// 任务（目标）
		RunnableDemo target = new RunnableDemo();
		// 借助线程类启动线程
		Thread t1 = new Thread(target);
		Thread t2 = new Thread(target);
		t1.start();
		t2.start();
	}

}
