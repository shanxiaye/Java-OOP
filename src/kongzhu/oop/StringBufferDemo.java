package kongzhu.oop;

public class StringBufferDemo {
	public static void main(String[] args){
	StringBuffer sb=new StringBuffer("0123456789");

	//���ݵ���Сֵ
	System.out.println(Integer.MIN_VALUE);
	//���ݵ����ֵ
	System.out.println(Integer.MAX_VALUE);
	//size��ʾ����ռ�õ��ڴ��ֽڣ�bit��
	System.out.println(Integer.SIZE);
	//type��ʾ��������
	System.out.println(Integer.TYPE);
	
	System.out.println(sb);
	//��def׷�ӵ�abc�Ľ�β
	System.out.println(sb.append("def"));
	System.out.println(sb);
	//ɾ�������ַ�
	System.out.println(sb.deleteCharAt(3));
	System.out.println(sb);
	//ɾ���Ӵ���������ߣ��������ұߣ�
	System.out.println(sb.delete(3, 4));
	System.out.println(sb);
	System.out.println(sb.replace(2, 3, "dg"));
	System.out.println(sb);
	//�����ȡ
	System.out.println(sb.substring(2));
	System.out.println(sb);
	System.out.println(sb.substring(3, 5));
	System.out.println(sb);
	//���ַ�����ָ��λ��ǰ��
	System.out.println(sb.insert(2, 'd'));
	System.out.println(sb);
	System.out.println(sb.toString());
	System.out.println(sb.insert(2, 'd'));
	System.out.println(sb);
	StringBuffer buffer=new StringBuffer("0123456789");
	System.out.println(buffer.reverse());
	System.out.println(buffer.indexOf("0"));
	System.out.println("%");
	System.out.println(sb.charAt(6));






	
	
	}
}