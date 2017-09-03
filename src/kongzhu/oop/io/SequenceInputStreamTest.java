package kongzhu.oop.io;

import java.io.*;  
import java.util.Enumeration;  
import java.util.Vector;  

public class SequenceInputStreamTest {  
/** 
* @param args 
*            SequenceInputStream�ϲ���������֮�����ӵ�������ϳ�һ�����������ӵ�һ����������ʼ��ȡ�� 
*            ֱ�������ļ�ĩβ�����Ŵӵڶ�����������ȡ���������ƣ�ֱ��������������һ�����������ļ�ĩβΪֹ�� 
*            �ϲ����������ǽ����Դ�ϲ���һ��Դ���ɽ���ö��������յĶ���ֽ������� 
*/  
public static void main(String[] args) {  
  doSequence();  
}  

private static void doSequence() {  
  // ����һ���ϲ����Ķ���  
  SequenceInputStream sis = null;  
  // �����������  
  BufferedOutputStream bos = null;  
  BufferedReader bis = null;  
  try {  
     // ���������ϡ�  
     Vector<InputStream> vector = new Vector<InputStream>();  
     vector.addElement(new FileInputStream("D:/Java/eclipse-jee-neon-2-win32-x86_64/"
      			+ "workspace/kongzhu/src/kongzhu/oop/io/members1.txt"));  
     vector.addElement(new FileInputStream("D:/Java/eclipse-jee-neon-2-win32-x86_64/"
      			+ "workspace/kongzhu/src/kongzhu/oop/io/members2.txt"));  
     vector.addElement(new FileInputStream("D:/Java/eclipse-jee-neon-2-win32-x86_64/"
      			+ "workspace/kongzhu/src/kongzhu/oop/io/members3.txt"));  
     Enumeration<InputStream> e = vector.elements();  

     sis = new SequenceInputStream(e);  

     bos = new BufferedOutputStream(new FileOutputStream("D:/Java/eclipse-jee-neon-2-win32-x86_64/"
      			+ "workspace/kongzhu/src/kongzhu/oop/io/members4.txt"));  
     // ��д����  
     byte[] buf = new byte[sis.available()];  
     int len = 0;  
     while ((len = sis.read(buf)) != -1) {  
        bos.write(buf, 0, len);  
        bos.flush();  
     }  
     bis = new BufferedReader(new FileReader("D:/Java/eclipse-jee-neon-2-win32-x86_64/"
      			+ "workspace/kongzhu/src/kongzhu/oop/io/members4.txt"));
//     buf = new byte[bis.ready()];
//     len = 0;
     while(bis.ready()){
    	 System.out.println(bis.readLine());
     }
  } catch (FileNotFoundException e1) {  
     e1.printStackTrace();  
  } catch (IOException e1) {  
     e1.printStackTrace();  
  } finally {  
     try {  
        if (sis != null)  
           sis.close();  
     } catch (IOException e) {  
        e.printStackTrace();  
     }  
     try {  
        if (bos != null)  
           bos.close();  
     } catch (IOException e) {  
        e.printStackTrace();  
     }  
  }  
}  
}
