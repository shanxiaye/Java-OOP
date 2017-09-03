package ziji;

public class ExceptionDemo {
	public static int divier(int a,int b){
		try {
			return a/b;
		}catch(Exception s){
			//throw抛出异常
			throw s;
		}
	}
//	public static int divier(int a,int b)throws ArithmeticException,Exception{
//		return a/b;
//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4,b=0,c=0,d=0;
		try {
			//把需要监控的代码放在try块中
			c=a/b;
			System.out.println("除法正常执行，a/b="+c);
		}catch(ArithmeticException e){
			//如果除法不能正常执行，则方法创建一个异常对象
			//程序会跳转到catch块中，
			//将异常信息打印到控制台
			e.printStackTrace();//e.printStackTrace
			System.out.println("除法没有正常执行，程序出异常了");
		}catch(RuntimeException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			//不管程序是否正常执行
			//finally块中的语句一定执行
			d = a+b;
			System.out.println("加法正常执行，a+b="+c);
		}
		System.out.println(Byte.compare((byte)3,(byte)0));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
