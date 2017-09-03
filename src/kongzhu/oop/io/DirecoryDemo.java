package kongzhu.oop.io;

import java.io.File;

public class DirecoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:/Java/eclipse-jee-neon-2-win32-x86_64/"
				+ "workspace/kongzhu/src/kongzhu/oop/io/dir1/dir2");
		boolean success = false;
		
		// 创建单个目录
		success = file.mkdir();
		if (success) {
			System.out.println("目录创建成功");
		} else {
			if (file.exists()) {
				System.out.println("目录已经存在");
			} else {
				System.out.println("我也不知道目录创建的怎么样了");
			}
		}
		
//		// 创建多个目录
//		success = file.mkdirs();
//		if (success) {
//			System.out.println("目录创建成功");
//		} else {
//			System.out.println("我也不知道目录创建的怎么样了");
//		}
		
		// 删除目录
		success = file.delete();
		if (success) {
			System.out.println("目录删除成功");
		} else {
			System.out.println("目录删除失败");
		}
	}

}
