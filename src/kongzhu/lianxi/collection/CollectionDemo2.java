package kongzhu.lianxi.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionDemo2 {

	public static void main(String[] args) {
		// 声明一个List对象，用来存放学科信息
		// 学科信息：语文、数学、英语、Java、MySQL、HTML、CSS
		// 1.显示学科信息
		// 2.删除语文、数学、英语
		// 3.添加一个JavaScript学科
		// 4.对学科进行排序（按字母顺序升序）
		// 5.显示排序后的学科信息
		LinkedList list = new LinkedList();
		
		list.add("语文");
		list.add("数学");
		list.add("英语");
		list.add("Java");
		list.add("MySQL");
		list.add("HTML");
		list.add("CSS");
		
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		list.remove("语文");
		list.remove("数学");
		list.remove("英语");
		
		list.add("JavaScript");
		
		Object[] arr = list.toArray();
		// 选择排序：每次选取一个位置的元素作为比较对象，
		// 依次跟后面其他位置元素比较
		// 如果当前位置元素大于其他位置元素，则交换
		// 交换完毕继续比较
		for (int i = 0; i < arr.length; i++) {
			String s1 = arr[i].toString();
			for (int j = i + 1; j < arr.length; j++) {
				String s2 = arr[j].toString();
				if (s1.compareTo(s2) > 0) {
					// i所在的位置的元素需要跟j所在位置的元素进行交换
					String temp = s1;
					arr[i] = arr[j];
					arr[j] = temp;
					
					// 并且，s1的值需要修改为交换后的值
					s1 = arr[i].toString();
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
