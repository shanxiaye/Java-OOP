package ziji;

import java.util.Random;
import java.util.Scanner;

public class Lianf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		Integer i1 = 128;  // װ�䣬�൱�� Integer.valueOf(128);
		int t = i1; //�൱�� i1.intValue() ����
		System.out.println(t);
		*/

		/**
		���ڨC128��127��Ĭ����127��֮���ֵ,��װ��󣬻ᱻ�����ڴ����������
		����������������ֵ,ϵͳ������new һ������
		*/
		Integer i1 = 200;
		Integer i2 = 200;

		/**
		ע�� == �� equals������
		== ���Ƚϵ��Ƕ���ĵ�ַ
		equlas �Ƚϵ��Ƕ��������
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
