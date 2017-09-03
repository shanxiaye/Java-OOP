package ziji;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet hset=new LinkedHashSet();
		hset.add(2);
		hset.add(32);
		hset.add("893");
		hset.add("dklk");
		hset.add("3");
		hset.add(48);
		
		int size=hset.size();
		System.out.println(size);
		boolean em=hset.isEmpty();
		System.out.println(em);
		Iterator it=hset.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		

	}

}
