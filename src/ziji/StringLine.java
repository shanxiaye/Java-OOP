package ziji;

import java.io.*;
public class StringLine
{
    public static void main(String[] args)throws IOException
   {
      BufferedReader reader=new BufferedReader(new FileReader("D:\\Java学习\\课上案例\\gh.txt"));
      BufferedWriter writer=new BufferedWriter(new FileWriter("D:\\Java学习\\课上案例\\hg.txt"));
      String s;
      while((s=reader.readLine())!=null) //读a的内容
      {
          System.out.println(s);  //显示读到的a内容
          writer.write(s.toUpperCase());   //将a的内容转换为大写,写到b里面
          writer.write("\r\n");
      }
      reader.close();
      writer.close();
   }
}