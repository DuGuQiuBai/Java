package cn.itcast_04;

/*
 * 字符串的遍历:遍历获取字符串中的每一个字符
 */
public class StringTest {
	public static void main(String[] args) {
		String s = "java";

		// 通过charAt()方法依次获取字符
		// System.out.println(s.charAt(0));
		// System.out.println(s.charAt(1));
		// System.out.println(s.charAt(2));
		// System.out.println(s.charAt(3));

		// 但是，如果字符串的个数比较多，代码就会很麻烦，而且重复度很高
		// for (int x = 0; x < 4; x++) {
		// System.out.println(s.charAt(x));
		// }

		// 如果字符数据较多，不可能数，所以，我们要用一个获取字符个数的方法
		// length();
		for (int x = 0; x < s.length(); x++) {
			// System.out.println(s.charAt(x));
			
			char ch = s.charAt(x);
			System.out.println(ch);
		}
	}
}
