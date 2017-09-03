package ziji;

import java.util.Calendar;

public class CharacterDemo {
	
	public static boolean isChinese(char c) {
		//判断是否是中文字符表之内
		if((c >= 0x4e00)&&(c <= 0x9fbb)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		char c='8';
		isChinese(c);
	Character a;
	Character b=2;
	Character d=new Character('A');
	Character x,y,z;
//	Calendar z=Calendar.getInstance();
//	System.out.println(z.get(Calendar.DAY_OF_MONTH));
	
    //判断是否是数字
	System.out.println(Character.isDigit('1'));//Character.isDigit(' ')
    //判断是否是字母
	System.out.println(Character.isLetter(d));//Character.isLetter(' ');
    //判断是否是数字或字母
	System.out.println(Character.isLetterOrDigit('B'));//Character.isLetterOrDigit();
    //判断是否是小写字母
	System.out.println(Character.isLowerCase('c'));//Character.isLowerCase();
    //判断是否是大写字母
	System.out.println(Character.isUpperCase('D'));//Character.isUpperCase(ch);
    //判断是否是空白字符
	System.out.println(Character.isWhitespace(' '));//character.isWhitespace();
    //判断是否是中文
	System.out.println(isChinese('中'));
	
	
	
	
	
	
	
    }
}
