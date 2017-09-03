package kongzhu.lianxi.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionDemo2 {

	public static void main(String[] args) {
		// ����һ��List�����������ѧ����Ϣ
		// ѧ����Ϣ�����ġ���ѧ��Ӣ�Java��MySQL��HTML��CSS
		// 1.��ʾѧ����Ϣ
		// 2.ɾ�����ġ���ѧ��Ӣ��
		// 3.���һ��JavaScriptѧ��
		// 4.��ѧ�ƽ������򣨰���ĸ˳������
		// 5.��ʾ������ѧ����Ϣ
		LinkedList list = new LinkedList();
		
		list.add("����");
		list.add("��ѧ");
		list.add("Ӣ��");
		list.add("Java");
		list.add("MySQL");
		list.add("HTML");
		list.add("CSS");
		
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		list.remove("����");
		list.remove("��ѧ");
		list.remove("Ӣ��");
		
		list.add("JavaScript");
		
		Object[] arr = list.toArray();
		// ѡ������ÿ��ѡȡһ��λ�õ�Ԫ����Ϊ�Ƚ϶���
		// ���θ���������λ��Ԫ�رȽ�
		// �����ǰλ��Ԫ�ش�������λ��Ԫ�أ��򽻻�
		// ������ϼ����Ƚ�
		for (int i = 0; i < arr.length; i++) {
			String s1 = arr[i].toString();
			for (int j = i + 1; j < arr.length; j++) {
				String s2 = arr[j].toString();
				if (s1.compareTo(s2) > 0) {
					// i���ڵ�λ�õ�Ԫ����Ҫ��j����λ�õ�Ԫ�ؽ��н���
					String temp = s1;
					arr[i] = arr[j];
					arr[j] = temp;
					
					// ���ң�s1��ֵ��Ҫ�޸�Ϊ�������ֵ
					s1 = arr[i].toString();
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
