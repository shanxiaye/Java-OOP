package ziji;

public class ByteDome {
	
	public static void main(String[] args){
		Byte a=1;
		Byte b=2;
//		Byte e,d,c;
		
		Byte c=new Byte((byte)123);
		Byte d=new Byte("123");
		
	//���ݵ���Сֵ
	System.out.println(Byte.MIN_VALUE);//Byte.MIN_VALUE
	//���ݵ����ֵ
	System.out.println(Byte.MAX_VALUE);//Byte.MAX_VALUE
	//size��ʾ����ռ�õ��ڴ��ֽڣ�bit��
	System.out.println(Byte.SIZE);//Byte.SIZE
	//type��ʾ��������
	System.out.println(Byte.TYPE);//Byet.TYPE
	
	
	
	//compareTo�Ƚ�����Byte��С
	//���Ϊ0����ʾb==c
	//�������0����ʾb>c
	//���С��0����ʾb<c
	//Byte.compareͬ��
	System.out.println((b.compareTo(c)+4));//B.compareTo(c)
	System.out.println(Short.compare((byte)1,(byte)10));//Byte��Integer.compare((byte)1,(byte)2)
	System.out.println(Byte.valueOf((byte)d));
	System.out.println(Byte.parseByte("oiew"));
	
	//Byte����д��Object��equals����
	//���ڱȽ���������ĵ�ֵַ�Ƿ�һ��
	//���ǱȽ���������ı����ֵ�Ƿ�һ��
	System.out.println(c==d);
	System.out.println(c.equals(d));
	

	
	}
	

}
