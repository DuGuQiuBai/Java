package cn.itcast_01;

/*
 * 字符串：由多个字符组成的一串数据。
 * 
 * 构造方法：
 * 		public String():创建String对象
 *		public String(byte[] bytes):把字节数组转成字符串。
 *		public String(byte[] bytes,int index,int length):把字节数组中的一部分转成字符串
 *		public String(char[] value):把字符数组转成字符串
 *		public String(char[] value,int index,int count):把字符数组的一部分转成字符串
 * 		public String(String original):把字符串转成字符串
 * 
 * 问题：
 * 		1:输出语句输出任何对象名称的时候，默认调用的是该对象的toString()方法。
 * 		  而toString()方法默认输出的是包名...类名@哈希值的十六进制。
 * 		 如果，你用输出语句输出一个对象名称的时候，发现不是这个格式，说明了该类重写了toString()方法。
 * 		2:返回此字符串的长度
 * 		public int length()
 * 	
 * 面试题：
 * 		数组有length()吗?String有length()吗？
 * 		没有。
 * 		有。
 */
public class StringDemo {
	public static void main(String[] args) {
		// public String():创建String对象
		String s1 = new String();
		System.out.println("s1:" + s1);
		System.out.println("s1.length():" + s1.length());
		System.out.println("--------------------------");

		// public String(byte[] bytes):把字节数组转成字符串。
		byte[] bytes = { 97, 98, 99, 100, 101 };
		String s2 = new String(bytes); // 把数值转成对应的字符值
		System.out.println("s2:" + s2);
		System.out.println("s2.length():" + s2.length());
		System.out.println("--------------------------");

		// public String(byte[] bytes,int index,int length):把字节数组中的一部分转成字符串
		// String s3 = new String(bytes, 1, 2);
		String s3 = new String(bytes, 0, bytes.length);
		System.out.println("s3:" + s3);
		System.out.println("s3.length():" + s3.length());
		System.out.println("--------------------------");

		// public String(char[] value):把字符数组转成字符串
		char[] chs = { 'a', 'b', 'c', 'd', 'e', '林', '青', '霞' };
		String s4 = new String(chs);
		System.out.println("s4:" + s4);
		System.out.println("s4.length():" + s4.length());
		System.out.println("--------------------------");

		// public String(char[] value,int index,int count):把字符数组的一部分转成字符串
		// 需求：我要输出的字符串是:de林青
		String s5 = new String(chs, 3, 4);
		System.out.println("s5:" + s5);
		System.out.println("s5.length():" + s5.length());
		System.out.println("--------------------------");

		// public String(String original):把字符串转成字符串
		String s6 = new String("helloworld");
		System.out.println("s6:" + s6);
		System.out.println("s6.length():" + s6.length());
		System.out.println("--------------------------");

		// Java 程序中的所有字符串字面值（如 "abc" ）都作为此类的实例实现。
		String s7 = "helloworld";
		System.out.println("s7:" + s7);
		System.out.println("s7.length():" + s7.length());
	}
}
