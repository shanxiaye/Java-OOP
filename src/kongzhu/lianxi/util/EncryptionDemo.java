package kongzhu.lianxi.util;

public class EncryptionDemo {

	public static void main(String[] args) {
		try {
			String str = "Java语言";
			System.out.println("原文：" + str);
			
			String encryption = encrypt(str);
			System.out.println("密文：" + encryption);
			
			String decryption = decrypt(encryption);
			System.out.println("明文：" + decryption);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main()执行结束");
	}
	
	/**
	 * 加密
	 * @param str
	 * @return
	 * @throws Exception 
	 */
	public static String encrypt(String str) throws Exception {
		return encryptOrdecrypt(str, "+");
	}
	
	/**
	 * 解密
	 * @param str
	 * @return
	 * @throws Exception 
	 */
	public static String decrypt(String str) throws Exception {
		return encryptOrdecrypt(str, "-");
	}
	
	public static String encryptOrdecrypt(String str, String jiaOrJian)
			throws Exception {
		// 将字符串转成字符数组
		char[] arr = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			if (jiaOrJian == "+") {
				sb.append((char) (arr[i] + 5));
			} else if (jiaOrJian == "-") {
				sb.append((char) (arr[i] - 5));
			} else {
				// 告诉调用者参数传递错误
				throw new Exception("参数传递错误");
			}
		}
		return sb.toString();
	}

}
