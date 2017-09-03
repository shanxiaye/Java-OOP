package kongzhu.oop;

public class StringDemo2 {
	public static void main(String[] args){
	//String最重要的特性：不可变性————值不变
		String s = "abc";
		System.out.println(s.replaceFirst("c", "d"));
		System.out.println(s);
		//s不变，因为replaceFirst改变的是备份里的
		

		System.out.println(s.toString());
		
		
		
		
		
		
		
		
		
	}
}
