package kongzhu.oop.reflect;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

import kongzhu.lianxi.library.StudentEntity;

public class MethodDemo {

	public static void main(String[] args) {
		try {
			// 获取学员类
			Class c = Class.forName("kongzhu.lianxi.library.StudentEntity");
			
			// 获取学员类的所有方法（不包含构造方法）
			Method[] ms = c.getDeclaredMethods();
			for (int i = 0; i < ms.length; i++) {
				Method m = ms[i];
				// Modifier用于获取方法的修饰符
				// getName()用于获取方法的名称
				System.out.print(
						Modifier.toString(m.getModifiers())
						+ " " + m.getReturnType().getSimpleName()
						+ " " + m.getName()
						+ "(");
//				Class[] ts = m.getParameterTypes();
//				for (int j = 0; j < ts.length; j++) {
//					System.out.print(ts[j].getSimpleName());
//				}
				Parameter[] ps = m.getParameters();
				for (int j = 0; j < ps.length; j++) {
					System.out.print(
							ps[j].getType().getSimpleName()
							+ " "
							+ ps[j].getName());
				}
				System.out.println(")");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
