package com.kzkj.demo;

import java.util.Random;

public class PasswordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		//toCharArray将此字符串转换为新的字符数组
		char[] charArr = s.toCharArray();
		int len = charArr.length;
		int[] intArr = new int[len];

		System.out.println(charArr);
		System.out.println(len);
		for (int i = 0; i < len; i++) {
			System.out.println(charArr);
			Random r = new Random(charArr[i]);
			intArr[i] = r.nextInt();
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < len; i++) {
			sb.append(intArr[i]);
		}
		System.err.println(sb);
		System.out.println(sb);
		System.out.println(Math.random());
	}

}
