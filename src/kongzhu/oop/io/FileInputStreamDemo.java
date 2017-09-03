package kongzhu.oop.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// ����һ��File����������������������ǽ�Ҫ��ȡ���ļ�
		File f = new File("D:/Java/eclipse-jee-neon-2-win32-x86_64/"
				+ "workspace/kongzhu/src/kongzhu/oop/io/file.txt");
		// ����һ���ֽ�������
		FileInputStream fis;
		try {
			// ��ʼ��
			f.createNewFile();
			fis = new FileInputStream(f);
			// ����һ������أ�ư��������һ���ֽ�һ���ֽڵĶ�ȡ�ļ�����
			// ����һưһư�Ķ�ȡ
			// �������ش�С���ã�С�ļ�����fis.available()�����ļ�1024
			byte[] arr = new byte[fis.available()]; // С�ļ�
//			byte[] arr = new byte[1024]; // ���ļ�
			// ÿ�ζ�ȡ���ֽ�����
			int num ;
//			byte[] as=new byte[1024];
//			int ds=fis.read(as);
			System.out.println(fis.read(arr));
			if(fis.read()!= -1){
				while ((num = fis.read(arr)) > -1) {
//					String sd=new String(arr,0,num);
//						 ��ÿ�ζ�ȡ���ֽ�ת���ַ���
						System.out.println(new String(arr,0,num));
					}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
