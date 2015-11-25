package cn.itcast_08;

/*
 * 需求：请自己写一个功能，比较两个字符串是否相等。
 * 
 * 分析：
 * 		A:给出两个字符串
 * 		B:比较长度是否相同，如果不同，则返回false。
 * 		      如果相同，就继续
 * 		C:把每个字符串转换为字符数组。
 * 		D:遍历两个数组，拿每一个位置上的字符进行比较。
 * 		  一旦发现有不同的，就返回false。
 * 		E:返回true。
 */
public class StringTest {
	public static void main(String[] args) {
		System.out.println(compare("admin", "admin"));
		System.out.println(compare("admin", "Admin"));
		System.out.println(compare("admin", "hello"));

		System.out.println("admin".equals("admin"));
	}

	// 这是开发中的用法
	// public static boolean compare(String s1, String s2) {
	// return s1.equals(s2);
	// }

	// 这是面试想考你的
	public static boolean compare(String s1, String s2) {
		// 比较长度是否相同
		if (s1.length() != s2.length()) {
			return false;
		}

		char[] chs1 = s1.toCharArray();
		char[] chs2 = s2.toCharArray();

		for (int x = 0; x < chs1.length; x++) {
			if (chs1[x] != chs2[x]) {
				return false;
			}
		}

		return true;
	}
}
