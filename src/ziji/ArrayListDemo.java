package ziji;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args){
		ArrayList list=new ArrayList();
		int size=list.size();
		System.out.println(size);
		list.add(123);
		list.add(4565);
		list.add("789");
		size=list.size();
		System.out.println(size);
		list.add(0,234);
		size=list.size();
		
		System.out.println(size);
		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
		//±éÀú
		for(int i=0;i<size;i++){
			System.out.println(list.get(i));
		}
		list.contains("789");
		System.out.println(list.contains("789"));
		list.remove(3);
		System.out.println(list);
		list.remove("789");
		System.out.println(list);
		size=list.size();
		System.out.println(size);
		System.out.println(list);
		list.add("ÏÉ½£");
		System.out.println(list);
		//µü´úÆ÷±éÀú
		Iterator it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		ListIterator listIT= list.listIterator(); 
		while(listIT.hasNext()){
			System.out.println(listIT.next());
		}
		while(listIT.hasPrevious()){
			System.out.println(listIT.previous());
		}
	}

}
