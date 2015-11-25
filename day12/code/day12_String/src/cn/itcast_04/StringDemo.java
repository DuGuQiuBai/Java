package cn.itcast_04;

/*
 * String类的获取功能：
 * int length():返回字符串的长度。字符的个数。
 * char charAt(int index):返回字符串中指定位置的字符。
 * int indexOf(int ch):返回指定字符在字符串中第一次出现的位置
 * 		97,'a'
 * int indexOf(String str):返回指定字符串在字符串中第一次出现的位置
 * int indexOf(int ch,int fromIndex):返回指定字符从指定位置开始在字符串中第一次出现的位置
 * int indexOf(String str,int fromIndex):返回指定字符串从指定位置开始在字符串中第一次出现的位置
 * String substring(int start):返回从指定位置开始到末尾的子串
 * String substring(int start,int end):返回从指定位置开始到指定位置结束的子串----注意左包右不包
 */
public class StringDemo {
	public static void main(String[] args) {
		String s = "helloworld";

		// int length():返回字符串的长度。字符的个数。
		System.out.println("length():" + s.length());
		System.out.println("----------------------");

		// char charAt(int index):返回字符串中指定位置的字符。
		System.out.println("charAt():" + s.charAt(0));
		System.out.println("charAt():" + s.charAt(3));
		// System.out.println("charAt():" + s.charAt(13)); //
		// StringIndexOutOfBoundsException
		System.out.println("----------------------");

		// int indexOf(int ch):返回指定字符在字符串中第一次出现的位置
		System.out.println("indexOf():" + s.indexOf('l'));
		// int indexOf(int ch,int fromIndex):返回指定字符从指定位置开始在字符串中第一次出现的位置
		System.out.println("indexOf():" + s.indexOf('l', 4));

		// 自己学习
		// int indexOf(String str):返回指定字符串在字符串中第一次出现的位置
		// int indexOf(String str,int fromIndex):返回指定字符串从指定位置开始在字符串中第一次出现的位置
		System.out.println("----------------------");

		// String substring(int start):返回从指定位置开始到末尾的子串
		System.out.println("substring():" + s.substring(0));
		System.out.println("substring():" + s.substring(5));
		// String substring(int start,int end):返回从指定位置开始到指定位置结束的子串
		// 需求：我要得到owo。你写
		System.out.println("substring():" + s.substring(4, 7)); // 包括左边，不包括右边
	}
}
