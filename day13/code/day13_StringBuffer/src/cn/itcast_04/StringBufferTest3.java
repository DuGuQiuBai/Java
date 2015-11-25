package cn.itcast_04;

/*
 * 判断一个字符串是否是对称字符串
 * 例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
 */
public class StringBufferTest3 {
	public static void main(String[] args) {
		String s = "mnanm";
		// String s = "abcde";

		// 方式1测试
		// boolean b = isDuiCheng(s);
		// System.out.println(b);

		// 方式2测试
		boolean b2 = isDuiCheng(s);
		System.out.println(b2);

	}

	// 方式1
	// public static boolean isDuiCheng(String s) {
	// // 把字符串转成数组
	// char[] chs = s.toCharArray();
	// // 把数组的元素反转
	// for (int start = 0, end = chs.length - 1; start <= end; start++, end--) {
	// if (chs[start] != chs[end]) {
	// return false;
	// }
	// }
	// return true;
	// }

	// public static boolean isDuiCheng(String s) {
	// boolean flag = true;
	// // 把字符串转成数组
	// char[] chs = s.toCharArray();
	// // 把数组的元素反转
	// for (int start = 0, end = chs.length - 1; start <= end; start++, end--) {
	// if (chs[start] != chs[end]) {
	// flag = false;
	// break;
	// }
	// }
	// return flag;
	// }

	// 方式2
	public static boolean isDuiCheng(String s) {
		// 反转
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		String ss = new String(sb);
		// if (ss.equals(s)) {
		// return true;
		// } else {
		// return false;
		// }
		return ss.equals(s);

		// 一句话搞定
		// return new String(new StringBuffer(s).reverse()).equals(s);
	}
}
