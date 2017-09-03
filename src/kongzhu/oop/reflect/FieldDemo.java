package kongzhu.oop.reflect;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import kongzhu.lianxi.library.StudentEntity;

public class FieldDemo {

	public static void main(String[] args) {
		try {
			// 获取学员类
			Class c = Class.forName("kongzhu.lianxi.library.StudentEntity");
			
			// 获取学员类的所有属性
			Field[] fs = c.getDeclaredFields();
			for (int i = 0; i < fs.length; i++) {
				Field f = fs[i];
				// Modifier用于获取属性的修饰符
				// getType()用于获取属性的类型
				// getName()用于获取属性的名称
				System.out.println(
						Modifier.toString(f.getModifiers())
						+ " " + f.getType().getSimpleName()
						+ " " + f.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
