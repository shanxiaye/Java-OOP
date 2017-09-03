package ziji;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

class Fad {
	double pal;
	Fad(){}
	Fad(double pal){
		this.pal=pal;
	}
	void kag(int a){
		if(a==1){
			System.out.println("发动发动机");
		}else{
			System.out.println("关闭发动机");
		}
	}
}
class Chel extends Fad{
	String pingp;
	Chel(){}
	Chel(String pingp){
		this.pingp=pingp;
	}
	void coq(){
		System.out.println("车轮充气");
	}
}
class Faxp extends Chel{
	String caiz;
	static void xz(){
		System.out.println("控制方向盘");
	}
}  
public class Qiche extends Faxp{
	/**
	 * 
	 */
	String pp="东风";
	Qiche(){} 
	Qiche(double pal,String pingp,String caiz){
		this.pal=pal;this.pingp=pingp;this.caiz=caiz;
		System.out.println(pp+"车子，"+pal+"排量,"+pingp+"轮胎，"+caiz+"材质方向盘");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Qiche qiche=new Qiche(2333, "长虹", "木头");
		xz();
		String s1=new String("abcd");
		String s2=new String("abcd");
		StringBuffer sb1=new StringBuffer("abcd");
		StringBuffer sb2=new StringBuffer("abcd");
		System.out.println(s1.equals(s2)+"......"+sb2);

	}

}
