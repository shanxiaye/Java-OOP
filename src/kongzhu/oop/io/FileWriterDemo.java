package kongzhu.oop.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		File file = new File("D:/Java/eclipse-jee-neon-2-win32-x86_64/"
				+ "workspace/kongzhu/src/kongzhu/oop/io/file.txt");
		// 声明一个字符输入流
		FileWriter fw = null;
		BufferedReader br = null;
		try {
//			fw = new FileWriter(file);
			fw = new FileWriter(file,false);
			char[] arr = {'a', 'b', 'c'};
			fw.write(arr);
			fw.write("defg");
			fw.flush();
			br = new BufferedReader(new FileReader(file));
			while(br.ready())System.out.println(br.readLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 释放资源（关水龙头）
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
