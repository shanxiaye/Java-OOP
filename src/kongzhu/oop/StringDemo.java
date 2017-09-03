package kongzhu.oop;

public class StringDemo {
	public static void main(String[] args){
		
        
		String a;
		String b="a";
		String e=new String("java����");
		String c=new String("abc");
		String d=new String("abcabc");
		String x,y,z;
		
		char[] arr = {'1','2','3','4','5','6','7','8','9','0'};
		String f = new String(arr);
		System.out.println(f);
		

		System.out.println(c==d);
		System.out.println(c.equals(d));
		
		
		//�ַ�������
		System.out.println(c.length());
		System.out.println(e.length());
		
		//�ж��ַ����Ƿ�Ϊ�մ�
		System.out.println(e.isEmpty());
		
		
		//�ַ�b���Ӵ�bc���ַ�����һ�γ��ֵ�λ�ã�λ�ô�0��ʼ��
		System.out.println(c.indexOf("b"));
		//��2��ʼ
		System.out.println(d.indexOf("b",2));
		System.out.println(d.indexOf("bc"));
		//����λ�����Ӵ���λ�ô�0��ʼ��
		System.out.println(c.charAt(1));
		//�ַ�b���Ӵ�bc���ַ������һ�γ��ֵ�λ�ã�λ�ô�0��ʼ��
		System.out.println(d.lastIndexOf("b"));
		System.out.println(d.lastIndexOf("bc"));
		
		//�ж��ַ����Ƿ��Թ̶��ַ���̶��ַ�����ʼ�����
		System.out.println(e.startsWith("java"));
		System.out.println(e.endsWith("��"));
		
		//��ȡ�Ӵ�
		System.out.println(e.substring(4));//��4��ʼ
		System.out.println(e.substring(4,5));//����4��������5
		//ƴ���ַ���
		System.out.println(e.concat(c));
		
		String[] ds = "boo:and:foo".split("o");//?
		for (int i=0;i<ds.length;i++){
			if(ds[i].isEmpty()){
				ds[i] = "a";
			}
			System.out.print(ds[i] + " ");
		}
		System.out.println();
		//�����о��ַ��������ַ�
		System.out.println(d.replace("c", "d"));
		System.out.println(d.replaceFirst("c", "d"));
		System.out.println(d.replaceAll("c", "d"));

		
		//��Сдת��
		System.out.println(c.toUpperCase());
		System.out.println(e.toLowerCase());
		//ȥ���ַ�����β�ո�
		System.out.println("  12  33   ".trim());
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
