package ziji;
import java.util.Random;
public class RadomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		random.setSeed(5);
		//��ͬ�����ӻ������ͬ�������
		Random r = new Random(10);
		System.out.println(r.nextInt());
		Random r2 = new Random(100);
		System.out.println(r2.nextInt());
		Random r3 = new Random(10);
		System.out.println(r3);

		Random rand = new Random();
		System.out.println(rand.nextInt());

//		Random r4 = new Random(10);
//		System.out.println(r4.toString());
//		String s=r4.toString();
//		 public static int StrToInt(String s)
//		 {
//		 return int.Parse(s);
//		 }
//		 
//		 String[] arrs = new String[] { "100", "300", "200" };
//		 int[] arri = Array.ConvertAll(arrs,
//				 new Converter<string, int>(StrToInt));
//		char[] charArr = s.toCharArray();
//		int[] a=new int[charArr.length]; 
//		for(int i=0;i<charArr.length;i++){
//			a[i]= int.Parse(char[i]);
		}
	}
//
//}
//string��������ת��Ϊint����.
//����һ��ConvertAll���÷�
//1 public static int StrToInt(string str)
//2 {
//3 return int.Parse(str);
//4 }
//5 
//6 string[] arrs = new string[] { "100", "300", "200" };
//7 int[] arri = Array.ConvertAll(arrs, new Converter<string, int>(StrToInt));
//��������ʹ������ѭ���ֱ�ת����
//1 string[] str1 = new string[] {"100","300","200"};
//2 
//3 int[] intTemp = new int[str1.Length];
//4 for (int i = 0; i <str1.Length; i++)
//5 {
//6 int.TryParse(str1[i]��out intTemp[i]);//int.TryParse��������Bool�͡������׳��쳣
//7 }
//��������
//1 string[] str1 = new string[] {"100","300","200"};
//2 
//3 int[] intTemp = new int[str1.Length];
//4 for (int i = 0; i <str1.Length; i++)
//5 {
//6 intTemp[i] = int.Parse(str1[i]);
//7 }