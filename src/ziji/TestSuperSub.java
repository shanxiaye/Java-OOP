package ziji;
abstract class SuperClass {
	  private int n;
	  SuperClass(){
	    System.out.println("SuperClass()");
	  }
	  SuperClass(int n) {
	    System.out.println("SuperClass(int n)");
	    this.n = n;
	  }
	  static void bt(int s){
		  System.out.println(s);
	  }
	}
	class SubClass extends SuperClass{
	  private int n;
	  
	  SubClass(){
	    super(300);
	    System.out.println("SubClass");
	  }  
	  
	  public SubClass(int n){
	    System.out.println("SubClass(int n):"+n);
	    this.n = n;
	  }

	  void bg(int s){
		  System.out.println(s+5);
	  }
	}
	public class TestSuperSub{
	  public static void main (String args[]){
	    SubClass sc = new SubClass();
	    SubClass sc2 = new SubClass(200); 
	    SuperClass su= new SubClass(3);
	    su.bt(3);
	    sc2.bt(4);
	  }
	}
