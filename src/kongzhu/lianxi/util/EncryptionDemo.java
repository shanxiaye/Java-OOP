package kongzhu.lianxi.util;

public class EncryptionDemo {

	public static void main(String[] args) {
		try {
			String str = "Java����";
			System.out.println("ԭ�ģ�" + str);
			
			String encryption = encrypt(str);
			System.out.println("���ģ�" + encryption);
			
			String decryption = decrypt(encryption);
			System.out.println("���ģ�" + decryption);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main()ִ�н���");
	}
	
	/**
	 * ����
	 * @param str
	 * @return
	 * @throws Exception 
	 */
	public static String encrypt(String str) throws Exception {
		return encryptOrdecrypt(str, "+");
	}
	
	/**
	 * ����
	 * @param str
	 * @return
	 * @throws Exception 
	 */
	public static String decrypt(String str) throws Exception {
		return encryptOrdecrypt(str, "-");
	}
	
	public static String encryptOrdecrypt(String str, String jiaOrJian)
			throws Exception {
		// ���ַ���ת���ַ�����
		char[] arr = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			if (jiaOrJian == "+") {
				sb.append((char) (arr[i] + 5));
			} else if (jiaOrJian == "-") {
				sb.append((char) (arr[i] - 5));
			} else {
				// ���ߵ����߲������ݴ���
				throw new Exception("�������ݴ���");
			}
		}
		return sb.toString();
	}

}
