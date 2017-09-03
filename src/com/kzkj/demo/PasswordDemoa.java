package com.kzkj.demo;

import java.util.Random;

public class PasswordDemoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		char[] charArr = s.toCharArray();
		int len = charArr.length;
		int[] intArr = new int[len];
		for (int i = 0; i < len; i++) {
			Random r = new Random(charArr[i]);
			intArr[i] = r.nextInt();
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < len; i++) {
			sb.append(intArr[i]);
		}
		System.err.println(sb);
	}

}
