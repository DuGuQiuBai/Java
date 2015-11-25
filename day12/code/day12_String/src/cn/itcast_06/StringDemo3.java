package cn.itcast_06;

/*
 * 按字典顺序比较两个字符串  a-z
 * int compareTo(String str)
 * int compareToIgnoreCase(String str) 
 */
public class StringDemo3 {
	public static void main(String[] args) {
		String s = "hello";

		System.out.println(s.compareTo("hello")); // 0
		System.out.println(s.compareTo("Hello")); // 32
		System.out.println(s.compareTo("mello")); // -5
		System.out.println(s.compareTo("hgllo"));//第一个不同字母之差
	}
}
