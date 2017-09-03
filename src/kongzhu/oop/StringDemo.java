package kongzhu.oop;

public class StringDemo {
	public static void main(String[] args){
		
        
		String a;
		String b="a";
		String e=new String("java语言");
		String c=new String("abc");
		String d=new String("abcabc");
		String x,y,z;
		
		char[] arr = {'1','2','3','4','5','6','7','8','9','0'};
		String f = new String(arr);
		System.out.println(f);
		

		System.out.println(c==d);
		System.out.println(c.equals(d));
		
		
		//字符串长度
		System.out.println(c.length());
		System.out.println(e.length());
		
		//判断字符串是否为空串
		System.out.println(e.isEmpty());
		
		
		//字符b或子串bc在字符串第一次出现的位置（位置从0开始）
		System.out.println(c.indexOf("b"));
		//从2开始
		System.out.println(d.indexOf("b",2));
		System.out.println(d.indexOf("bc"));
		//根据位置找子串（位置从0开始）
		System.out.println(c.charAt(1));
		//字符b或子串bc在字符串最后一次出现的位置（位置从0开始）
		System.out.println(d.lastIndexOf("b"));
		System.out.println(d.lastIndexOf("bc"));
		
		//判断字符串是否以固定字符或固定字符串开始或结束
		System.out.println(e.startsWith("java"));
		System.out.println(e.endsWith("言"));
		
		//截取子串
		System.out.println(e.substring(4));//从4开始
		System.out.println(e.substring(4,5));//包含4，不包含5
		//拼接字符串
		System.out.println(e.concat(c));
		
		String[] ds = "boo:and:foo".split("o");//?
		for (int i=0;i<ds.length;i++){
			if(ds[i].isEmpty()){
				ds[i] = "a";
			}
			System.out.print(ds[i] + " ");
		}
		System.out.println();
		//将所有旧字符换成新字符
		System.out.println(d.replace("c", "d"));
		System.out.println(d.replaceFirst("c", "d"));
		System.out.println(d.replaceAll("c", "d"));

		
		//大小写转换
		System.out.println(c.toUpperCase());
		System.out.println(e.toLowerCase());
		//去掉字符串首尾空格
		System.out.println("  12  33   ".trim());
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
