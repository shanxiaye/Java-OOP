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
		SimpleDateFormat sim=new SimpleDateFormat("yyy��MM��dd��HH:mm:ss:S");
		System.out.println(sim.format(ca.getTime()));
		//��ȡʱ��ĺ�����
		System.out.println(date.getTime());
		//ʱ��Ƚ�
		System.out.println(date.before(new Date()));
		System.out.println(new Date().after(date));
		System.out.println(date.equals(2017));
		
		
		
		
	}

}
