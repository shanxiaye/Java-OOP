package kongzhu.lianxi.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map=new HashMap();

		map.put(1, 22333);
		map.put(2, 3244);
		map.put(-1, "vnjk");
		map.put(0, 324);
		map.put(3, 5);
		map.put(4, "vnjk");	
		map.put(2, " ");
		int size=map.size();
		System.out.println(size);
		boolean empty=map.isEmpty();
		System.out.println(empty);
		
		System.out.println(map.values());
		boolean contain=map.containsKey(2);
		System.out.println(contain);
		boolean con=map.containsValue(2);
		System.out.println(con);
		System.out.println();
//		map.clear();
		// key的迭代
		Collection keys=map.keySet();//Collection能用Set替换
		Iterator it=keys.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println();
		// value的迭代
		Collection co=map.values();//Collection不能用Set替换
		Iterator cit=co.iterator();
		while(cit.hasNext()){
			System.out.println(cit.next());
		}
		System.out.println();
		// key-value的迭代
		Set kvs=map.entrySet();
		Iterator kvit=kvs.iterator();
		while(kvit.hasNext()){
			Map.Entry entry=(Map.Entry)kvit.next();
			System.out.println(entry.getKey()+"..."+entry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
