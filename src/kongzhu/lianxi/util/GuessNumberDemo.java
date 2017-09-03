package kongzhu.lianxi.util;

import java.util.Random;

public class GuessNumberDemo {

	public static void main(String[] args) {
		guessNumber(100);
	}
	
	public static void guessNumber(int num) {
		// 检查参数是否符合条件
		if (1 <= num && num <= 100) {
			int count = 0;
			Random r = new Random();
			int d = 0;
			while (num != d) {
//				d = (int) (r.nextDouble() * 100); // 失败
//				d = (int) (r.nextDouble() * 101);
//				d = (int) (r.nextDouble() * 100 + 1);
//				d = (int) Math.ceil(r.nextDouble() * 100);
				d = (int) (Math.random() * 100 + 1);
				System.out.println("产生的随机数是：" + d);
				count++;
			}
			System.out.println("抽奖次数：" + count);
		} else {
			// 添加处理
		}
	}

}
