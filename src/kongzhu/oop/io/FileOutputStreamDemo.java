package kongzhu.oop.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		File file = new File("D:/Java/eclipse-jee-neon-2-win32-x86_64/"
				+ "workspace/kongzhu/src/kongzhu/oop/io/file.txt");
		FileOutputStream fos = null;
		try {
//			fos = new FileOutputStream(file);
			fos = new FileOutputStream(file, false);//true是再写一次，false是覆盖
//			fos.write(66);
			String fc="夏目友人帐";
			byte[] b=fc.getBytes();
			byte[] d = {67, 68, 69, 70, 71,};
			fos.write(b);
			fos.write(d);
			fos.flush();
			System.out.println("写完了");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 释放资源（关水龙头）
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
