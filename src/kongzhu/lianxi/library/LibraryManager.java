package kongzhu.lianxi.library;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LibraryManager {

	public static void main(String[] args) {
		// 学员档案馆和图书馆新建一次即可
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
			bw.write("同学，你好！借书请输入B，还书请输入R！");
			bw.newLine();
			bw.flush();
			// 输入编号或者书名之前判断是否输入B or R
			boolean isBorrow = false;
			boolean isReturn = false;
			String line;
			while (true) {
				line = br.readLine();
//				if (!(isBorrow || isReturn)) {
				if (!isBorrow && !isReturn) {
					if ("B".equalsIgnoreCase(line)) {
						bw.write("同学，你好！请输入图书编号：");
						bw.newLine();
						bw.flush();
						isBorrow = true;
					} else if ("R".equalsIgnoreCase(line)) {
						bw.write("同学，你好！请输入图书编号：");
						bw.newLine();
						bw.flush();
						isReturn = true;
					} else {
						bw.write("同学，你输入的是什么玩意？");
						bw.newLine();
						bw.flush();
					}
				} else {
					if(isDigit(line)) {
						if (line.length() == 6) {
							bookId = Integer.valueOf(line);
							bw.write("同学，你输入的图书编号是：" + bookId);
							bw.newLine();
							bw.flush();
							bw.write("同学，你好！请输入学员学号：");
							bw.newLine();
							bw.flush();
						} else if (line.length() == 8) {
							studentId = Integer.valueOf(line);
							bw.write("同学，你输入的学员学号是：" + studentId);
							bw.newLine();
							bw.flush();
						} else {
							bw.write("同学，你输入的是什么鬼？");
							bw.newLine();
							bw.flush();
						}
						if (bookId != null && studentId != null) {
							studentStore.borrowBook(bookStore, studentId, bookId);
							// 重置reset：重新设置变量的初始值
							studentId = null;
							bookId = null;
							isBorrow = false;
							isReturn = false;
						}
					} else {
						bw.write("同学，你输入的是什么东西？");
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
