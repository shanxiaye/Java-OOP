package ziji;

import java.util.Random;
import java.util.Scanner;

public class Lianf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		Integer i1 = 128;  // 装箱，相当于 Integer.valueOf(128);
		int t = i1; //相当于 i1.intValue() 拆箱
		System.out.println(t);
		*/

		/**
		对于–128到127（默认是127）之间的值,被装箱后，会被放在内存里进行重用
		但是如果超出了这个值,系统会重新new 一个对象
		*/
		Integer i1 = 200;
		Integer i2 = 200;

		/**
		注意 == 与 equals的区别
		== 它比较的是对象的地址
		equlas 比较的是对象的内容
		*/
		if(i1==i2)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if(i1.equals(i2))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		Random random=new Random();
		int y =158;   
		byte b = (byte)y;
//		System.out.println(b);
//		System.out.println((int)23.7);
//		System.out.println((int)-45.89f );
		int bill;
		bill=new Scanner(System.in).nextInt();
		if(bill>0){
			for(int i=1;i<=100;i++){
				int r=random.nextInt(101);
				if(bill==r){
					
					System.out.println(r + "....." +i);
					break;
				}
			}
	    }

	}

}
