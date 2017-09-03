package kongzhu.oop.reflect;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

import kongzhu.lianxi.library.StudentEntity;

public class MethodDemo {

	public static void main(String[] args) {
		try {
			// ��ȡѧԱ��
			Class c = Class.forName("kongzhu.lianxi.library.StudentEntity");
			
			// ��ȡѧԱ������з��������������췽����
			Method[] ms = c.getDeclaredMethods();
			for (int i = 0; i < ms.length; i++) {
				Method m = ms[i];
				// Modifier���ڻ�ȡ���������η�
				// getName()���ڻ�ȡ����������
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
