package kongzhu.oop.io;

import java.io.File;

public class DirecoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:/Java/eclipse-jee-neon-2-win32-x86_64/"
				+ "workspace/kongzhu/src/kongzhu/oop/io/dir1/dir2");
		boolean success = false;
		
		// ��������Ŀ¼
		success = file.mkdir();
		if (success) {
			System.out.println("Ŀ¼�����ɹ�");
		} else {
			if (file.exists()) {
				System.out.println("Ŀ¼�Ѿ�����");
			} else {
				System.out.println("��Ҳ��֪��Ŀ¼��������ô����");
			}
		}
		
//		// �������Ŀ¼
//		success = file.mkdirs();
//		if (success) {
//			System.out.println("Ŀ¼�����ɹ�");
//		} else {
//			System.out.println("��Ҳ��֪��Ŀ¼��������ô����");
//		}
		
		// ɾ��Ŀ¼
		success = file.delete();
		if (success) {
			System.out.println("Ŀ¼ɾ���ɹ�");
		} else {
			System.out.println("Ŀ¼ɾ��ʧ��");
		}
	}

}
