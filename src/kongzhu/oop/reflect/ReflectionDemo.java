package kongzhu.oop.reflect;
import java.lang.reflect.Method;

import kongzhu.lianxi.library.StudentEntity;

public class ReflectionDemo {

	public static void main(String[] args) {
		try {
			StudentEntity s = new StudentEntity();
			s.setName("����");
			System.out.println(s.getName());
			
			// �ö���cָ��ѧԱ�࣬����ΪѧԱ�����ȫ�޶���������+����
			Class<?> c = Class.forName("kongzhu.lianxi.library.StudentEntity");
			
			// ʹ�÷��䴴������
			StudentEntity obj = (StudentEntity) c.newInstance();
			obj.setName("����");
			System.out.println(obj.getName());
			
			// ʹ�÷����ȡ���������÷���
			// getMethod��һ����������Ҫ���õķ�������
			// getMethod����Ĳ�������Ҫ���÷���ʱ���ݵĲ������ͣ�������һ��Ӧ�����ʱ���Ÿ���
			Method m = c.getMethod("setName", String.class);
			// invoke��һ������ָ���ĸ����������������������Ǵ��ݵĲ���ֵ
			m.invoke(obj, "����");
			// getMethod���õķ���û�в���ʱ���Ͳ������ò�������
			m = c.getMethod("getName");
			String name = (String) m.invoke(obj);
			System.out.println(name);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
