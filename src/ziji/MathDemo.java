package ziji;
public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //����ȡ��
        System.out.println(Math.ceil(123.123));
        //����ȡ��
        System.out.println(Math.floor(123.123));
        //��������
        System.out.println(Math.round(123.823));
        System.out.println(Math.round(124.123));
        //�����
        System.out.println(Math.random());
        System.out.println(Math.random()*10);
        //����ֵ
        System.out.println(Math.abs(-10));
        //�ӷ����㣨����ͳ���int��Χ���򷽷��쳣��
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Math.addExact(2000000, 10));
        //�������㣨����ͳ���int��Χ���򷽷��쳣��
        System.out.println(Math.subtractExact(-20, 10));//subtractExact
        //�˷�����
        System.out.println(Math.multiplyExact(20, 10));//mutiplyExact
        //�������㣨���С��������ȡ����
        System.out.println(Math.floorDiv(-3, 10));
        
        
        
        //��
        System.out.println(Math.floorDiv(10, 4));//floorDiv
        System.out.println(Math.ceil(1.2));//ceil
        System.out.println(Math.floor(1.5));//floor
        System.out.println(Math.round(14.22));//round

	}

}
