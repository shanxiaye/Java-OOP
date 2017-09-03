package ziji;

import java.util.Date;  
import java.text.SimpleDateFormat;  
import java.text.DateFormat;  
import java.text.ParseException;  
import java.util.Calendar;  
  
public class Test  
{  
  public Test()  
  {  
  }  
  
  public static void main(String[] args)  
  {  
    // �ַ���ת�����ڸ�ʽ  
    // DateFormat fmtDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
    // ���մ������  
    // String strDate = args[1];  
    // �õ����ڸ�ʽ����  
    // Date date = fmtDateTime.parse(strDate);  
  
    // ������ʾ��������ʱ��  
    String str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")).format(new Date());  
    System.out.println(str);  
  
    // ���� Calendar ����  
    Calendar calendar = Calendar.getInstance();  
  
    try  
    {  
      // �� calendar ����ʱ��ķ���  
      // ���ô����ʱ���ʽ  
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-d H:m:s");  
      // ָ��һ������  
      Date date = dateFormat.parse("2013-6-1 13:24:16");  
      // �� calendar ����Ϊ date ����������  
      calendar.setTime(date);  
  
      // ���ض���ʽ��ʾ�����õ�ʱ��  
      str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")).format(calendar.getTime());  
      System.out.println(str);  
    }  
    catch (ParseException e)  
    {  
      e.printStackTrace();  
    }  
  
    // ������һ�N�O�� calendar ��ʽ  
    // �քe�� year, month, date, hourOfDay, minute, second  
    calendar = Calendar.getInstance();  
    calendar.set(2013, 1, 2, 17, 35, 44);  
    str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")).format(calendar.getTime());  
    System.out.println(str);  
  
    // Calendar ȡ�õ�ǰʱ��ķ���  
    // ��ʼ�� (����) Calendar ����  
    calendar = Calendar.getInstance();  
    // ������ Date ����ʼ�� Calendar ����  
//    calendar.setTime(new Date());  
  
    // setTime ��������һ��  
    // Date date = new Date();  
    // calendar.setTime(date);  
  
    str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")).format(calendar.getTime());  
    System.out.println(str);  
  
    // ��ʾ���  
    int year = calendar.get(Calendar.YEAR);  
    System.out.println("year is = " + String.valueOf(year));  
  
    // ��ʾ�·� (��0��ʼ, ʵ����ʾҪ��һ)  
    int month = calendar.get(Calendar.MONTH);  
    System.out.println("nth is = " + (month + 1));  
  
    // ���ܼ�  
    int week = calendar.get(Calendar.DAY_OF_WEEK);  
    System.out.println("week is = " + week);  
  
    // ����ĵ� N ��  
    int DAY_OF_YEAR = calendar.get(Calendar.DAY_OF_YEAR);  
    System.out.println("DAY_OF_YEAR is = " + DAY_OF_YEAR);  
  
    // ���µ� N ��  
    int DAY_OF_MONTH = calendar.get(Calendar.DAY_OF_MONTH);  
    System.out.println("DAY_OF_MONTH = " + String.valueOf(DAY_OF_MONTH));  
  
    // 3Сʱ�Ժ�  
    calendar.add(Calendar.HOUR_OF_DAY, 3);  
    int HOUR_OF_DAY = calendar.get(Calendar.HOUR_OF_DAY);  
    System.out.println("HOUR_OF_DAY + 3 = " + HOUR_OF_DAY);  
  
    // ��ǰ������  
    int MINUTE = calendar.get(Calendar.MINUTE);  
    System.out.println("MINUTE = " + MINUTE);  
  
    // 15 �����Ժ�  
    calendar.add(Calendar.MINUTE, 15);  
    MINUTE = calendar.get(Calendar.MINUTE);  
    System.out.println("MINUTE + 15 = " + MINUTE);  
  
    // 30����ǰ  
    calendar.add(Calendar.MINUTE, -30);  
    MINUTE = calendar.get(Calendar.MINUTE);  
    System.out.println("MINUTE - 30 = " + MINUTE);  
  
    // ��ʽ����ʾ  
    str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendar.getTime());  
    System.out.println(str);  
  
    // ���� Calendar ��ʾ��ǰʱ��  
    calendar.setTime(new Date());  
    str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendar.getTime());  
    System.out.println(str);  
  
    // ����һ�� Calendar ���ڱȽ�ʱ��  
    Calendar calendarNew = Calendar.getInstance();  
  
    // �趨Ϊ 5 Сʱ��ǰ�����ߴ���ʾ -1  
    calendarNew.add(Calendar.HOUR, -5);  
    System.out.println("ʱ��Ƚϣ�" + calendarNew.compareTo(calendar));  
  
    // �趨7Сʱ�Ժ�ǰ�ߴ���ʾ 1  
    calendarNew.add(Calendar.HOUR, +7);  
    System.out.println("ʱ��Ƚϣ�" + calendarNew.compareTo(calendar));  
  
    // �˻� 2 Сʱ��ʱ����ͬ����ʾ 0  
    calendarNew.add(Calendar.HOUR, -2);  
    System.out.println("ʱ��Ƚϣ�" + calendarNew.compareTo(calendar));  
  }  
} 