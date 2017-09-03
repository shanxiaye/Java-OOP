package kongzhu.oop.reflect;
import java.lang.reflect.Method;

import kongzhu.lianxi.library.StudentEntity;

public class ReflectionDemo {

	public static void main(String[] args) {
		try {
			StudentEntity s = new StudentEntity();
			s.setName("张三");
			System.out.println(s.getName());
			
			// 让对象c指向学员类，参数为学员类的完全限定名：包名+类名
			Class<?> c = Class.forName("kongzhu.lianxi.library.StudentEntity");
			
			// 使用反射创建对象
			StudentEntity obj = (StudentEntity) c.newInstance();
			obj.setName("李四");
			System.out.println(obj.getName());
			
			// 使用反射获取方法，调用方法
			// getMethod第一个参数是你要调用的方法名，
			// getMethod后面的参数是你要调用方法时传递的参数类型，必须以一对应，多个时逗号隔开
			Method m = c.getMethod("setName", String.class);
			// invoke第一个参数指定哪个对象调用这个方法，后面是传递的参数值
			m.invoke(obj, "王五");
			// getMethod调用的方法没有参数时，就不用设置参数类型
			m = c.getMethod("getName");
			String name = (String) m.invoke(obj);
			System.out.println(name);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
