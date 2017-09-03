package kongzhu.oop.reflect;
import java.lang.reflect.Modifier;

import kongzhu.lianxi.library.StudentEntity;

public class ClassDemo {

	public static void main(String[] args) {
		try {
			StudentEntity s = new StudentEntity();
			
			Class c;
			
			c = StudentEntity.class;
//			System.out.println("����.class " + c.getName());
			
			c = s.getClass();
//			System.out.println("����.getClass " + c.getName());
			
			// ��ȡ�ࣨ�Ƽ�ʹ�ã�
			c = Class.forName("kongzhu.lianxi.library.StudentEntity");
//			System.out.println("Class.forName " + c.getName());
			
			// Modifier���ڻ�ȡ������η�
			// getName()���ڻ�ȡ�����ȫ�޶���
			// getSimpleName()���ڻ�ȡ�������
			System.out.println(
					Modifier.toString(c.getModifiers())
					+ " class " + c.getSimpleName());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
