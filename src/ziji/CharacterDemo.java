package ziji;

import java.util.Calendar;

public class CharacterDemo {
	
	public static boolean isChinese(char c) {
		//�ж��Ƿ��������ַ���֮��
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
	
    //�ж��Ƿ�������
	System.out.println(Character.isDigit('1'));//Character.isDigit(' ')
    //�ж��Ƿ�����ĸ
	System.out.println(Character.isLetter(d));//Character.isLetter(' ');
    //�ж��Ƿ������ֻ���ĸ
	System.out.println(Character.isLetterOrDigit('B'));//Character.isLetterOrDigit();
    //�ж��Ƿ���Сд��ĸ
	System.out.println(Character.isLowerCase('c'));//Character.isLowerCase();
    //�ж��Ƿ��Ǵ�д��ĸ
	System.out.println(Character.isUpperCase('D'));//Character.isUpperCase(ch);
    //�ж��Ƿ��ǿհ��ַ�
	System.out.println(Character.isWhitespace(' '));//character.isWhitespace();
    //�ж��Ƿ�������
	System.out.println(isChinese('��'));
	
	
	
	
	
	
	
    }
}
