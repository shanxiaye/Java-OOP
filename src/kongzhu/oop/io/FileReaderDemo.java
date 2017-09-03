package kongzhu.oop.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {
		File file = new File("D:/Java/eclipse-jee-neon-2-win32-x86_64/"
				+ "workspace/kongzhu/src/kongzhu/oop/io/file.txt");
		// 声明一个字符输入流
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			char[] arr = new char[4];
			int num=-1 ;
			while ((num = fr.read(arr)) > -1) {
				System.out.println(new String(arr, 0, num));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
