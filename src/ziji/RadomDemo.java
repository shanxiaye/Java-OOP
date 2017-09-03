package ziji;
import java.util.Random;
public class RadomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		random.setSeed(5);
		//相同的种子会产生相同的随机数
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
//string数组类型转换为int数组.
//方法一：ConvertAll的用法
//1 public static int StrToInt(string str)
//2 {
//3 return int.Parse(str);
//4 }
//5 
//6 string[] arrs = new string[] { "100", "300", "200" };
//7 int[] arri = Array.ConvertAll(arrs, new Converter<string, int>(StrToInt));
//方法二：使用数组循环分别转换。
//1 string[] str1 = new string[] {"100","300","200"};
//2 
//3 int[] intTemp = new int[str1.Length];
//4 for (int i = 0; i <str1.Length; i++)
//5 {
//6 int.TryParse(str1[i]，out intTemp[i]);//int.TryParse函数返回Bool型。不会抛出异常
//7 }
//方法三：
//1 string[] str1 = new string[] {"100","300","200"};
//2 
//3 int[] intTemp = new int[str1.Length];
//4 for (int i = 0; i <str1.Length; i++)
//5 {
//6 intTemp[i] = int.Parse(str1[i]);
//7 }