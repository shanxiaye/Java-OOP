package kongzhu.oop;

public class StringBufferDemo {
	public static void main(String[] args){
	StringBuffer sb=new StringBuffer("0123456789");

	//数据的最小值
	System.out.println(Integer.MIN_VALUE);
	//数据的最大值
	System.out.println(Integer.MAX_VALUE);
	//size表示数据占用的内存字节（bit）
	System.out.println(Integer.SIZE);
	//type表示数据名称
	System.out.println(Integer.TYPE);
	
	System.out.println(sb);
	//将def追加到abc的结尾
	System.out.println(sb.append("def"));
	System.out.println(sb);
	//删除单个字符
	System.out.println(sb.deleteCharAt(3));
	System.out.println(sb);
	//删除子串（包括左边，不包括右边）
	System.out.println(sb.delete(3, 4));
	System.out.println(sb);
	System.out.println(sb.replace(2, 3, "dg"));
	System.out.println(sb);
	//另外截取
	System.out.println(sb.substring(2));
	System.out.println(sb);
	System.out.println(sb.substring(3, 5));
	System.out.println(sb);
	//将字符插入指定位置前面
	System.out.println(sb.insert(2, 'd'));
	System.out.println(sb);
	System.out.println(sb.toString());
	System.out.println(sb.insert(2, 'd'));
	System.out.println(sb);
	StringBuffer buffer=new StringBuffer("0123456789");
	System.out.println(buffer.reverse());
	System.out.println(buffer.indexOf("0"));
	System.out.println("%");
	System.out.println(sb.charAt(6));






	
	
	}
}