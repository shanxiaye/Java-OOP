package kongzhu.lianxi.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {	 
	public static void main(String[] args){
		//getInstance();������ʵ��
		Calendar c = Calendar.getInstance();//calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR)+"��");//c.get(Calendar.YEAR)
		//�´�0��ʼ
		System.out.println(c.get(Calendar.MONTH)+1+"��");//c.get(Calendar.MONTH)
		System.out.println(c.get(Calendar.DAY_OF_MONTH)+"��");//c.(Calendar.DAY_OF_MONTH)
		if(c.get(Calendar.AM_PM) == 0){//c.get(Calendar.AM.PM)
			System.out.print("����");
			System.out.println(c.get(Calendar.HOUR)+"ʱ");//c.get(Calendar.HOUR)
		}else{
			System.out.print("����");
			System.out.println(c.get(Calendar.HOUR)+"ʱ");
		}
		System.out.println(c.get(Calendar.AM_PM));
		System.out.println(c.get(Calendar.HOUR_OF_DAY)+"ʱ");//c.get(Calendar.HOUR_OF_DAY)
		System.out.println(c.get(Calendar.MINUTE)+"��");//c.get(Calendar.MINUTE)
		System.out.println(c.get(Calendar.SECOND)+"��");//c.get(Calendar.SECOND)
		System.out.println(c.get(Calendar.MILLISECOND)+"����");//c.get(Calendar.MILLISCOND)
		
		
		//M,d,H,h,m,s��˫дֻ��ǰ�����������
//		String s = "yyy��MM��dd��HH:mm:ss.S";//yyy��MM��dd��HH��mm��ss:S
//		String s = "yyy��MMMdd��HH:mm:ss.S";
//		String s = "yyyMM��dddHH:mm:ss.S";
		String s = "yyyy��MM��dddd��HH:mm:ss.S";
//		String s = "yyy��MM��dd��hh:mm:ss.S";
//		String s = "yyy��MM��dd��h:mm:ss.S";
		SimpleDateFormat sdf =new SimpleDateFormat(s);//SimpleDateFormat
		System.out.println(sdf.format(c.getTime()));//sdf.format(c.getTime())
	}

}
