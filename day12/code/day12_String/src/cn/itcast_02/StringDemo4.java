package cn.itcast_02;

/*
 * 看程序写结果
 * 字符串变量相加：先开空间，再加内容
 * 字符串常量相加：先加，再找，没有再开空间
 */
public class StringDemo4 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		String s4 = s1 + s2;
		String s5 = "hello"+"world";
		System.out.println(s4);
		System.out.println(s5);
//		System.out.println(s3 == s1 + s2);// false
//		System.out.println(s3.equals(s1 + s2));// true
//		System.out.println(s3 == "hello" + "world");// true
	}
}
