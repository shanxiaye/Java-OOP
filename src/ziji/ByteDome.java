package ziji;

public class ByteDome {
	
	public static void main(String[] args){
		Byte a=1;
		Byte b=2;
//		Byte e,d,c;
		
		Byte c=new Byte((byte)123);
		Byte d=new Byte("123");
		
	//数据的最小值
	System.out.println(Byte.MIN_VALUE);//Byte.MIN_VALUE
	//数据的最大值
	System.out.println(Byte.MAX_VALUE);//Byte.MAX_VALUE
	//size表示数据占用的内存字节（bit）
	System.out.println(Byte.SIZE);//Byte.SIZE
	//type表示数据名称
	System.out.println(Byte.TYPE);//Byet.TYPE
	
	
	
	//compareTo比较两个Byte大小
	//结果为0，表示b==c
	//结果大于0，表示b>c
	//结果小于0，表示b<c
	//Byte.compare同样
	System.out.println((b.compareTo(c)+4));//B.compareTo(c)
	System.out.println(Short.compare((byte)1,(byte)10));//Byte、Integer.compare((byte)1,(byte)2)
	System.out.println(Byte.valueOf((byte)d));
	System.out.println(Byte.parseByte("oiew"));
	
	//Byte类重写了Object的equals方法
	//不在比较两个对象的地址值是否一样
	//而是比较两个对象的本身的值是否一样
	System.out.println(c==d);
	System.out.println(c.equals(d));
	

	
	}
	

}
