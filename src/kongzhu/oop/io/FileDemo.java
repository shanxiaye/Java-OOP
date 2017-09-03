package kongzhu.oop.io;
import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:/Java/eclipse-jee-neon-2-win32-x86_64/"
				+ "workspace/kongzhu/src/kongzhu/oop/io/file.txt");
		boolean success ;
		try {
			
			// ����һ�����ļ�
			success = file.createNewFile();
			System.out.println(success);
			String s=file.getParent();
			System.out.println(s);
			s=file.getPath();
			System.out.println(file.exists());
			System.out.println(s);
			if (success) {
				System.out.println("�ļ������ɹ�");
			} else {
				System.out.println("�ļ��Ѿ�����");
			}
			System.out.println(file.length());
			System.out.println(file.getName());
			System.out.println("�÷�����С"+file.getTotalSpace()/(1024*1024*1024)+"G");
			// ɾ���ļ�
//			success = file.delete();   
//			if (success) {
//				System.out.println("�ļ�ɾ���ɹ�");
//			} else {
//				System.out.println("�ļ�ɾ��ʧ��");
//			}
		} catch (IOException e) {
			// �ļ�����Ŀ¼������ʱ���׳��쳣
			e.printStackTrace();
			System.out.println("�����ļ�ʱ�������쳣");
		}
	}

}
