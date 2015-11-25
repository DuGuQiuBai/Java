package cn.itcast_04;

/*
 * 把字符串反转
 */
public class StringBufferTest2 {
	public static void main(String[] args) {
		String s = "霞青林爱我";

		// 测试方式1
		// String s2 = reverse(s);
		// System.out.println(s2);

		// 测试方式2
		// String s3 = reverse(s);
		// System.out.println(s3);

		// 测试方式3
		String s4 = reverse(s);
		System.out.println(s4);
	}

	// 方式1
	// public static String reverse(String str) {
	// String s = "";
	//
	// char[] chs = str.toCharArray();
	// for (int x = chs.length - 1; x >= 0; x--) {
	// s += chs[x];
	// }
	//
	// return s;
	// }

	// 方式2
	// public static String reverse(String str) {
	// // 把字符串转成数组
	// char[] chs = str.toCharArray();
	// // 把数组的元素反转
	// for (int start = 0, end = chs.length - 1; start <= end; start++, end--) {
	// char temp = chs[start];
	// chs[start] = chs[end];
	// chs[end] = temp;
	// }
	// // 把数组转成字符串返回
	// return String.valueOf(chs);
	// }

	// 方式3
	public static String reverse(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		return new String(sb);
		
		//return new String(new StringBuffer(str).reverse());
	}
}
