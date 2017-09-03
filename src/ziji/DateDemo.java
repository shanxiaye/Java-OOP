package ziji;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args){
		Date date=new Date();
		System.out.println(date);
		Calendar ca=Calendar.getInstance();

		ca.set(2017, 5,24,23,45,0);;
		SimpleDateFormat sim=new SimpleDateFormat("yyy年MM月dd日HH:mm:ss:S");
		System.out.println(sim.format(ca.getTime()));
		//获取时间的毫秒数
		System.out.println(date.getTime());
		//时间比较
		System.out.println(date.before(new Date()));
		System.out.println(new Date().after(date));
		System.out.println(date.equals(2017));
		
		
		
		
	}

}
