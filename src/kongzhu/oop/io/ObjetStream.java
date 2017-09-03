package kongzhu.oop.io;

import java.io.*;  

public class ObjetStream {  

/** 
 * @param args 
 */  
public static void main(String[] args) {  
   // TODO自动生成的方法存根  
   ObjectOutputStream objectwriter=null;  
   ObjectInputStream objectreader=null;  
    
   try {  
      objectwriter=new ObjectOutputStream(new FileOutputStream("D:/Java/eclipse-jee-neon-2-win32-x86_64/"
      			+ "workspace/kongzhu/src/kongzhu/oop/io/student.txt"));  
      objectwriter.writeObject(new Student("gg", null, 22));  
      objectwriter.writeObject(new Student("tt", null, 18));  
      objectwriter.writeObject(new Student("rr", null, 17));  
      objectreader=new ObjectInputStream(new FileInputStream("D:/Java/eclipse-jee-neon-2-win32-x86_64/"
      			+ "workspace/kongzhu/src/kongzhu/oop/io/student.txt"));  
      for (int i = 0; i < 3; i++) {  
         System.out.println(objectreader.readObject());  
      }  
   } catch (IOException | ClassNotFoundException e) {  
      // TODO自动生成的 catch 块  
      e.printStackTrace();  
   }finally{  
      try {  
         objectreader.close();  
         objectwriter.close();  
      } catch (IOException e) {  
         // TODO自动生成的 catch 块  
         e.printStackTrace();  
      }  
       
   }  
    
}  

}  
