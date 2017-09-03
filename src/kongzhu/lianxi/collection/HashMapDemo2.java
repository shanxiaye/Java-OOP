package kongzhu.lianxi.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		// 添加key-value
		map.put(1, "111");
		map.put(2, "222");
		map.put(3, "333");
		HashMap map2 = new HashMap();
		map2.put(4, "444");
		map2.put(5, "555");
		map2.put(6, "666");
		map.putAll(map2);
		
		int size = map.size();
		boolean isEmpty = map.isEmpty();
		
		// 根据key取value
		map.get(1);
		boolean contain = map.containsKey(2);
		System.out.println(contain);
//		map.remove(3);
//		boolean success = map.remove(2, "222");
//		System.out.println(success);
//		map.clear();
		
		map.put(2, "111");
		
		// key的迭代
		Set keys = map.keySet();
		Iterator kit = keys.iterator();
		while (kit.hasNext()) {
			System.out.println(kit.next());
		}
		
		// value的迭代
		Collection c = map.values();
		Iterator vit = c.iterator();
		while (vit.hasNext()) {
			System.out.println(vit.next());
		}
		
		// key-value的迭代
		Set kvs = map.entrySet();
		Iterator kvit = kvs.iterator();
		while (kvit.hasNext()) {
			Map.Entry entry = (Map.Entry) kvit.next();
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}
	}

}
