package ziji;

public class ExceptionDemo {
	public static int divier(int a,int b){
		try {
			return a/b;
		}catch(Exception s){
			//throw�׳��쳣
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
			//����Ҫ��صĴ������try����
			c=a/b;
			System.out.println("��������ִ�У�a/b="+c);
		}catch(ArithmeticException e){
			//���������������ִ�У��򷽷�����һ���쳣����
			//�������ת��catch���У�
			//���쳣��Ϣ��ӡ������̨
			e.printStackTrace();//e.printStackTrace
			System.out.println("����û������ִ�У�������쳣��");
		}catch(RuntimeException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			//���ܳ����Ƿ�����ִ��
			//finally���е����һ��ִ��
			d = a+b;
			System.out.println("�ӷ�����ִ�У�a+b="+c);
		}
		System.out.println(Byte.compare((byte)3,(byte)0));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
