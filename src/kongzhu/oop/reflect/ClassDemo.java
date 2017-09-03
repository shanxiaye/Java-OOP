package kongzhu.oop.reflect;
import java.lang.reflect.Modifier;

import kongzhu.lianxi.library.StudentEntity;

public class ClassDemo {

	public static void main(String[] args) {
		try {
			StudentEntity s = new StudentEntity();
			
			Class c;
			
			c = StudentEntity.class;
//			System.out.println("类名.class " + c.getName());
			
			c = s.getClass();
//			System.out.println("对象.getClass " + c.getName());
			
			// 获取类（推荐使用）
			c = Class.forName("kongzhu.lianxi.library.StudentEntity");
//			System.out.println("Class.forName " + c.getName());
			
			// Modifier用于获取类的修饰符
			// getName()用于获取类的完全限定名
			// getSimpleName()用于获取类的名称
			System.out.println(
					Modifier.toString(c.getModifiers())
					+ " class " + c.getSimpleName());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
