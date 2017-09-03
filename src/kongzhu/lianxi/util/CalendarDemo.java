package kongzhu.lianxi.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {	 
	public static void main(String[] args){
		//getInstance();将抽象实例
		Calendar c = Calendar.getInstance();//calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR)+"年");//c.get(Calendar.YEAR)
		//月从0开始
		System.out.println(c.get(Calendar.MONTH)+1+"月");//c.get(Calendar.MONTH)
		System.out.println(c.get(Calendar.DAY_OF_MONTH)+"日");//c.(Calendar.DAY_OF_MONTH)
		if(c.get(Calendar.AM_PM) == 0){//c.get(Calendar.AM.PM)
			System.out.print("上午");
			System.out.println(c.get(Calendar.HOUR)+"时");//c.get(Calendar.HOUR)
		}else{
			System.out.print("下午");
			System.out.println(c.get(Calendar.HOUR)+"时");
		}
		System.out.println(c.get(Calendar.AM_PM));
		System.out.println(c.get(Calendar.HOUR_OF_DAY)+"时");//c.get(Calendar.HOUR_OF_DAY)
		System.out.println(c.get(Calendar.MINUTE)+"秒");//c.get(Calendar.MINUTE)
		System.out.println(c.get(Calendar.SECOND)+"分");//c.get(Calendar.SECOND)
		System.out.println(c.get(Calendar.MILLISECOND)+"毫秒");//c.get(Calendar.MILLISCOND)
		
		
		//M,d,H,h,m,s单双写只是前导零的问题了
//		String s = "yyy年MM月dd日HH:mm:ss.S";//yyy年MM月dd日HH：mm：ss:S
//		String s = "yyy年MMMdd日HH:mm:ss.S";
//		String s = "yyyMM月dddHH:mm:ss.S";
		String s = "yyyy年MM月dddd日HH:mm:ss.S";
//		String s = "yyy年MM月dd日hh:mm:ss.S";
//		String s = "yyy年MM月dd日h:mm:ss.S";
		SimpleDateFormat sdf =new SimpleDateFormat(s);//SimpleDateFormat
		System.out.println(sdf.format(c.getTime()));//sdf.format(c.getTime())
	}

}
