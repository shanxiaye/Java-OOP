package ziji;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Map;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,Object> tree=new TreeMap<>();
		tree.put(1, 3);
		tree.put(4, 5);
		tree.put(2, 23);
		tree.put(-2, "bkjdk");
		tree.put(2, "sdkls");
		tree.put(3, 888);
		
		int size=tree.size();
		System.out.println(size);
		System.out.println();
		boolean  empty=tree.isEmpty();
		System.out.println(empty);
		System.out.println();
		System.out.println(tree.equals(324));
		System.out.println();
		Set<Integer> se=tree.keySet();
		Iterator<Integer> ter=se.iterator();
		while(ter.hasNext()){
			System.out.println(ter.next());
		}
		System.out.println();
		Collection<Object> co=tree.values();
		Iterator<Object> co1=co.iterator();
		while(co1.hasNext()){
			System.out.println(co1.next());
		}
		System.out.println();
		Collection<?> con=tree.entrySet();
		Iterator<?> co2=con.iterator();
		while(co2.hasNext()){
			@SuppressWarnings("rawtypes")
			Map.Entry entry=(Map.Entry)co2.next();
			System.out.println(entry.getKey()+"----"+entry.getValue());
		}
		
		
		

	}

}
