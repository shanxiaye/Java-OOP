package kongzhu.lianxi.collection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> hset=new LinkedList<String>();
		hset.add("2");
		hset.add("32");
		hset.add("893");
		hset.add("dklk");
		hset.add("3");
		hset.add("48");
		
		int size=hset.size();
		System.out.println(size);
		boolean em=hset.isEmpty();
		System.out.println(em);
		Collections.sort(hset);
		Iterator it=hset.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		Collections.reverse(hset);
		Iterator ite=hset.iterator();//Iterator it=list.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}

	}

}
