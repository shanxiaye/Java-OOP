package kongzhu.oop.reflect;
interface A{
	public void run();
}
class B implements A{
	public void run(){
		System.out.println("gg");
	}
	B(){}
	B(int a){
		a=1;
		System.out.println(a);
	}
	public void sf(){
		System.out.println("huu");
	}
}
public class intepace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B(1);
		a.run();

	}

}
