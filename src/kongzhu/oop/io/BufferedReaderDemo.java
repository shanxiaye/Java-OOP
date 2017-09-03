package kongzhu.oop.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		File file = new File("D:/Java/eclipse-jee-neon-2-win32-x86_64/"
      			+ "workspace/kongzhu/src/kongzhu/oop/io/file.txt");
		BufferedReader br = null;
		try {
//			file.mkdirs();
			file.createNewFile();
			br = new BufferedReader(new FileReader(file));
			// ��ȡ�ļ�������ȡ���˷���falseb
			while (br.ready()) {
				// �ж�ȡ
				System.out.println(br.readLine());
			}

			BufferedReader bh=new BufferedReader(new InputStreamReader(System.in));
				System.out.println(bh.readLine());
				br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
}
