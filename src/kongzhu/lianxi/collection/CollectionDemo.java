package kongzhu.lianxi.collection;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedList lis=new LinkedList<>();
//		lis.contains(3);
		LinkedList<String> list=new LinkedList<String>();
		list.add("语文");
		list.add("数学");
		list.add("英语");
		list.add("Java");
		list.add("MySQL");
		list.add("HTML");
		list.add("CSS");
		list.remove(0);
//		list.add(122.0f);
//		list.add('s');
		System.out.println(list.indexOf("MySQL"));
		System.out.println(list.contains("HTML"));
		System.out.println();
		for(String s:list){
			System.out.println(s);
		}
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		list.remove("语文");
		System.out.println(list); 
		list.remove("数学");
		System.out.println(list);
		list.remove("英语");
		System.out.println(list);
		list.add("JavaScript");
		list.toArray();
		Object[] array=list.toArray();
		for ( int i=0;i<array.length;i++) {
			String s1=array[i].toString();
		    for(int j=i+1;j<array.length;j++){
			String s2=array[j].toString();
			   if(s1.compareTo(s2)>0){
				String temp=s1;
				array[i]=array[j];
				array[j]=temp; 
				s1=array[i].toString();
			   }
		    }
	    }
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}

		System.out.println(list);

	}

}
