package kongzhu.oop.io;

import java.io.ByteArrayInputStream; //����ByteArrayInputStream�İ�  
import java.io.IOException;  
import java.io.PushbackInputStream;  

/** 
* ���������� 
* */  
public class PushBackInputStreamDemo {  
public static void main(String[] args) throws IOException {  
 String str = "hello,rollenholt";  
 PushbackInputStream push = null; // ��������������  
 ByteArrayInputStream bat = null; // �����ֽ�����������  
 bat = new ByteArrayInputStream(str.getBytes());  
 push = new PushbackInputStream(bat); // �������������󣬽������ֽ�����������  
 int temp = 0;  
 while ((temp = push.read()) != -1) { // push.read()���ֽڶ�ȡ�����temp�У������ȡ��ɷ���-1  
    if (temp == ',') { // �ж϶�ȡ���Ƿ��Ƕ���  
       push.unread(temp); //�ص�temp��λ��  
       System.out.println("(����" + (char)temp + ") "); // ������˵��ַ�  
       temp = push.read(); //���Ŷ�ȡ�ֽ�  
    } else {  
       System.out.println((char) temp); // ��������ַ�  
    }  
 }  
 char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
 int i = 0;
 while(true){
	 System.out.println("fd");
	 for(char c : a){
		 if(i == c){
			 System.out.println(i+"------"+c);
			 if(i == 'j')return;
			 break;
		 }
	 }
		 i++;
 }
}  
} 
