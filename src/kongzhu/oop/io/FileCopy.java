package kongzhu.oop.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {  
	   
	  public static void main(String[] args) {  
	     // TODO�Զ����ɵķ������  
	     byte[] buffer=new byte[1024];   //һ��ȡ�����ֽ�����С,��������С  
	     int numberRead=0;  
	     FileInputStream input=null;  
	     FileOutputStream out =null;  
	     try {  
	        input=new FileInputStream("E:/bilibili/������������ϵ��/01�������2009��7�£�/Bakemonogatari #01.mp4");  
	        out=new FileOutputStream("E:/bilibili/s/Bakemonogatari #01.mp4"); //����ļ������ڻ��Զ�����  
	         
	        while ((numberRead=input.read(buffer))!=-1) {  //numberRead��Ŀ�����ڷ�ֹ���һ�ζ�ȡ���ֽ�С��buffer���ȣ�  
	           out.write(buffer, 0, numberRead);       //������Զ������0  
	        }  
	     } catch (final IOException e) {  
	        // TODO�Զ����ɵ� catch ��  
	        e.printStackTrace();  
	     }finally{  
	        try {  
	           input.close();  
	           out.close();  
	        } catch (IOException e) {  
	           // TODO�Զ����ɵ� catch ��  
	           e.printStackTrace();  
	        }  
	         
	     }  
	  }  
	   
}
