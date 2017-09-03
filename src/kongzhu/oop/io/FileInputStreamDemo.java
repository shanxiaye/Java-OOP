package kongzhu.oop.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// 创建一个File对象，这个对象里面存的是我们将要读取的文件
		File f = new File("D:/Java/eclipse-jee-neon-2-win32-x86_64/"
				+ "workspace/kongzhu/src/kongzhu/oop/io/file.txt");
		// 声明一个字节输入流
		FileInputStream fis;
		try {
			// 初始化
			f.createNewFile();
			fis = new FileInputStream(f);
			// 设置一个缓冲池（瓢），不用一个字节一个字节的读取文件内容
			// 而是一瓢一瓢的读取
			// 这个缓冲池大小设置：小文件就是fis.available()，大文件1024
			byte[] arr = new byte[fis.available()]; // 小文件
//			byte[] arr = new byte[1024]; // 大文件
			// 每次读取的字节总数
			int num ;
//			byte[] as=new byte[1024];
//			int ds=fis.read(as);
			System.out.println(fis.read(arr));
			if(fis.read()!= -1){
				while ((num = fis.read(arr)) > -1) {
//					String sd=new String(arr,0,num);
//						 将每次读取的字节转成字符串
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
