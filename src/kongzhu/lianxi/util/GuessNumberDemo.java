package kongzhu.lianxi.util;

import java.util.Random;

public class GuessNumberDemo {

	public static void main(String[] args) {
		guessNumber(100);
	}
	
	public static void guessNumber(int num) {
		// �������Ƿ��������
		if (1 <= num && num <= 100) {
			int count = 0;
			Random r = new Random();
			int d = 0;
			while (num != d) {
//				d = (int) (r.nextDouble() * 100); // ʧ��
//				d = (int) (r.nextDouble() * 101);
//				d = (int) (r.nextDouble() * 100 + 1);
//				d = (int) Math.ceil(r.nextDouble() * 100);
				d = (int) (Math.random() * 100 + 1);
				System.out.println("������������ǣ�" + d);
				count++;
			}
			System.out.println("�齱������" + count);
		} else {
			// ��Ӵ���
		}
	}

}
