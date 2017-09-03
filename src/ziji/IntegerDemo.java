package ziji;

public class IntegerDemo {
	public static void main(String[] args){
		
		
		Integer a=1;
		Integer b=2;
		Integer e=2;
		Integer f=2;
		Integer c=new Integer(123);
		Integer d=new Integer("123");
		Integer x,y,z;
		
		
		
		

		//数据的最小值
		System.out.println(Integer.MIN_VALUE);
		//数据的最大值
		System.out.println(Integer.MAX_VALUE);
		//size表示数据占用的内存字节（bit）
		System.out.println(Integer.SIZE);
		//type表示数据名称
		System.out.println(Integer.TYPE);
		
        //进制转换  
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toOctalString(20));
		System.out.println(Integer.toHexString(20));
		
        //Integer类型比大小等于1说明左比右大，等于-1，说明右比左
		System.out.println(b.compareTo(c));
		System.out.println(Integer.compare((byte)1,(byte)11));
		//Byte类型比大小等于左边减右边
		System.out.println(Byte.compare((byte)1,(byte)11));

		System.out.println(c==d);
		System.out.println(c.equals(d));
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(e==f);
		System.out.println(e.equals(f));
		
		
		//算数运算
		System.out.println(Integer.min(2, 3));
		System.out.println(Integer.max(3, 4));
		System.out.println(Integer.sum(3, 4));
		
		
	}

}
