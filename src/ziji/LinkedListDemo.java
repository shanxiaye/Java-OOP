package ziji;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args){
		LinkedList list=new LinkedList();
		list.add(123);
		list.add("244");
		list.add("799");
		list.add(2332);
		list.add(" ");
		int size=list.size();
		System.out.print("c"+" ");
		System.out.println(size);
		Iterator it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		list.get(2);
		System.out.print("a"+" ");
		System.out.println(list);
		list.addAll(list);
		list.addLast(123);
		list.addLast("232");
		System.out.print("b"+" ");
		System.out.println(list);
		list.addFirst("22");
		list.addFirst(34);
		System.out.print(1+" ");
		System.out.println(list);
		System.out.print(2+" ");
		System.out.println(list.get(2));
		System.out.print(3+" ");
		System.out.println(list.getFirst());
		System.out.print(4+" ");
		System.out.println(list.getLast());
		System.out.print(5+" ");
		System.out.println(list.indexOf(2332));
		System.out.print(6+" ");
		System.out.println(list.isEmpty());
		
	}

}
