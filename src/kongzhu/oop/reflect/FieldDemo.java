package kongzhu.oop.reflect;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import kongzhu.lianxi.library.StudentEntity;

public class FieldDemo {

	public static void main(String[] args) {
		try {
			// ��ȡѧԱ��
			Class c = Class.forName("kongzhu.lianxi.library.StudentEntity");
			
			// ��ȡѧԱ�����������
			Field[] fs = c.getDeclaredFields();
			for (int i = 0; i < fs.length; i++) {
				Field f = fs[i];
				// Modifier���ڻ�ȡ���Ե����η�
				// getType()���ڻ�ȡ���Ե�����
				// getName()���ڻ�ȡ���Ե�����
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
