package kongzhu.lianxi.library;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LibraryManager {

	public static void main(String[] args) {
		// ѧԱ�����ݺ�ͼ����½�һ�μ���
		StudentStore studentStore = new StudentStore();
		BookStore bookStore = new BookStore();
		
		Integer studentId = null;
		Integer bookId = null;
		
		String encoding = System.getProperty("file.encoding");
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(
					new InputStreamReader(System.in, encoding));
			bw = new BufferedWriter(
					new OutputStreamWriter(System.out, encoding));
			bw.write("ͬѧ����ã�����������B������������R��");
			bw.newLine();
			bw.flush();
			// �����Ż�������֮ǰ�ж��Ƿ�����B or R
			boolean isBorrow = false;
			boolean isReturn = false;
			String line;
			while (true) {
				line = br.readLine();
//				if (!(isBorrow || isReturn)) {
				if (!isBorrow && !isReturn) {
					if ("B".equalsIgnoreCase(line)) {
						bw.write("ͬѧ����ã�������ͼ���ţ�");
						bw.newLine();
						bw.flush();
						isBorrow = true;
					} else if ("R".equalsIgnoreCase(line)) {
						bw.write("ͬѧ����ã�������ͼ���ţ�");
						bw.newLine();
						bw.flush();
						isReturn = true;
					} else {
						bw.write("ͬѧ�����������ʲô���⣿");
						bw.newLine();
						bw.flush();
					}
				} else {
					if(isDigit(line)) {
						if (line.length() == 6) {
							bookId = Integer.valueOf(line);
							bw.write("ͬѧ���������ͼ�����ǣ�" + bookId);
							bw.newLine();
							bw.flush();
							bw.write("ͬѧ����ã�������ѧԱѧ�ţ�");
							bw.newLine();
							bw.flush();
						} else if (line.length() == 8) {
							studentId = Integer.valueOf(line);
							bw.write("ͬѧ���������ѧԱѧ���ǣ�" + studentId);
							bw.newLine();
							bw.flush();
						} else {
							bw.write("ͬѧ�����������ʲô��");
							bw.newLine();
							bw.flush();
						}
						if (bookId != null && studentId != null) {
							studentStore.borrowBook(bookStore, studentId, bookId);
							// ����reset���������ñ����ĳ�ʼֵ
							studentId = null;
							bookId = null;
							isBorrow = false;
							isReturn = false;
						}
					} else {
						bw.write("ͬѧ�����������ʲô������");
						bw.newLine();
						bw.flush();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static boolean isDigit(String str) {
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (!Character.isDigit(arr[i])) {
				return false;
			}
		}
		return true;
	}

}
