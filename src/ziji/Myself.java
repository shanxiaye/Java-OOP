package ziji;

public class Myself{
	public static  int a=8,b=20,c=3,d=4;
public static void main(String[] args){
//	 d+=a+=b+=c;
System.out.println(a%b);
	System.out.println("陈勇胜");
	System.out.println("23");
	/* int a=10,b=6; */
	System.out.println(b/a);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	double num,jib=2000.0,xs=10000.0,tc;
	tc=xs*0.03;
	num=jib+tc;
	System.out.println(num);
	double shu = 0;
	if(shu>0){
		System.out.println("shu为正数");
	}else{
		System.out.println("shu不为正数");
	}
	int sum=0;
	for(int i=3;i<1000;i++){
		for(int j=2;j<i&&i%j>0;j++){
				if(j==(i-1)){
					System.out.println("素数是"+i); 
					sum=sum+i;
					System.out.println(sum+2);
					
			}
		}
	}
}
}