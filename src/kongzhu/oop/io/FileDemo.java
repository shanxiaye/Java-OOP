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
			
			// 创建一个新文件
			success = file.createNewFile();
			System.out.println(success);
			String s=file.getParent();
			System.out.println(s);
			s=file.getPath();
			System.out.println(file.exists());
			System.out.println(s);
			if (success) {
				System.out.println("文件创建成功");
			} else {
				System.out.println("文件已经存在");
			}
			System.out.println(file.length());
			System.out.println(file.getName());
			System.out.println("该分区大小"+file.getTotalSpace()/(1024*1024*1024)+"G");
			// 删除文件
//			success = file.delete();   
//			if (success) {
//				System.out.println("文件删除成功");
//			} else {
//				System.out.println("文件删除失败");
//			}
		} catch (IOException e) {
			// 文件所在目录不存在时会抛出异常
			e.printStackTrace();
			System.out.println("创建文件时发生了异常");
		}
	}

}
