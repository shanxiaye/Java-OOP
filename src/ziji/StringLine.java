package ziji;

import java.io.*;
public class StringLine
{
    public static void main(String[] args)throws IOException
   {
      BufferedReader reader=new BufferedReader(new FileReader("D:\\Javaѧϰ\\���ϰ���\\gh.txt"));
      BufferedWriter writer=new BufferedWriter(new FileWriter("D:\\Javaѧϰ\\���ϰ���\\hg.txt"));
      String s;
      while((s=reader.readLine())!=null) //��a������
      {
          System.out.println(s);  //��ʾ������a����
          writer.write(s.toUpperCase());   //��a������ת��Ϊ��д,д��b����
          writer.write("\r\n");
      }
      reader.close();
      writer.close();
   }
}