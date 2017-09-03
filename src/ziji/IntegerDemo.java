package ziji;

public class IntegerDemo {
	public static void main(String[] args){
		
		
		Integer a=1;
		Integer b=2;
		Integer e=2;
		Integer f=2;
		Integer c=new Integer(123);
		Integer d=new Integer("123");
		Integer x,y,z;
		
		
		
		

		//���ݵ���Сֵ
		System.out.println(Integer.MIN_VALUE);
		//���ݵ����ֵ
		System.out.println(Integer.MAX_VALUE);
		//size��ʾ����ռ�õ��ڴ��ֽڣ�bit��
		System.out.println(Integer.SIZE);
		//type��ʾ��������
		System.out.println(Integer.TYPE);
		
        //����ת��  
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toOctalString(20));
		System.out.println(Integer.toHexString(20));
		
        //Integer���ͱȴ�С����1˵������Ҵ󣬵���-1��˵���ұ���
		System.out.println(b.compareTo(c));
		System.out.println(Integer.compare((byte)1,(byte)11));
		//Byte���ͱȴ�С������߼��ұ�
		System.out.println(Byte.compare((byte)1,(byte)11));

		System.out.println(c==d);
		System.out.println(c.equals(d));
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(e==f);
		System.out.println(e.equals(f));
		
		
		//��������
		System.out.println(Integer.min(2, 3));
		System.out.println(Integer.max(3, 4));
		System.out.println(Integer.sum(3, 4));
		
		
	}

}
