package ziji;

public class Lianxia {
	public static void main(String[] args){
		Byte i=2;
		Byte j=3;
		Byte k=4;
		Byte a=new Byte((byte)123);
		Byte b=new Byte("123");
		System.out.println(Byte.BYTES);
		System.out.println(Byte.SIZE);
		System.out.println(Byte.compare(i, j));
		System.out.println(i.compareTo(b));
		System.out.println(Byte.hashCode((byte)3));
		System.out.println(a.equals(b));
		System.out.println(a==b);
		Integer c= new Integer(123);
		Integer d= new Integer(3);
		Integer e= new Integer('´ó');
		Integer f=123;
		Integer g=3;
		System.out.println(d.equals(e));
		System.out.println(d==e);
		System.out.println();
		System.out.println(f.equals(g));
		System.out.println(d.compareTo(e));
		System.out.println(i.doubleValue());
		System.out.println(d.toString());
		System.out.println(d.toString(7));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.toBinaryString((byte)20));
		System.out.println(Integer.toHexString((byte)20));
		System.out.println(Integer.toOctalString((byte)20));
		System.out.println(Integer.compare(d, e));
	}
	

}
