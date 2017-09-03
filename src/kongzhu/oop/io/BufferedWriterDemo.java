package kongzhu.oop.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("D:/Java/eclipse-jee-neon-2-win32-x86_64/"
				+ "workspace/kongzhu/src/kongzhu/oop/io/file.txt");
		BufferedWriter bw = null;
		BufferedReader br = null;
		try {
			bw = new BufferedWriter(new FileWriter(file,true));
			bw.write("abcdefg");
			bw.newLine(); // 换行
			bw.write("ABCDEFG");
			bw.flush();
			BufferedWriter bn=new BufferedWriter(new OutputStreamWriter(System.out));
			br = new BufferedReader(new FileReader(file));
			char[] str={'2','3','3'};
			bn.write(str);
			bn.newLine();
			while(br.ready())bn.write(br.readLine());
			bn.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 释放资源（关水龙头）
			if (bw!= null) {
				try {
					
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		  }
//		boolean s=file.delete();
//		if(s){
//			System.out.println("文件删除成功");
//		}else{
//			System.out.println("文件删除失败");
//		}
	}

}
