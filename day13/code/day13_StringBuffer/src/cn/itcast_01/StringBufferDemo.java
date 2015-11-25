package cn.itcast_01;

/*
 * StringBuffer:线程安全的可变字符串。
 * 通过查看API，我们知道了，它是可以改变内容和长度的。
 * 
 * StringBuffer和String的区别?
 * A:StringBuffer的长度可变
 * B:String的长度固定
 * 
 * 构造方法：
 * 		StringBuffer()： 构造一个其中不带字符的字符串缓冲区，其初始容量为 16 个字符。
 * 		StringBuffer(int capacity)：构造一个不带字符，但具有指定初始容量的字符串缓冲区。
 * 		StringBuffer(String str):构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容。
 * 
 * 成员方法：
 * 		public int length():返回长度（字符数）实际值
 * 		public int capacity():返回当前容量	理论值
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		// StringBuffer()： 构造一个其中不带字符的字符串缓冲区，其初始容量为 16 个字符。
		StringBuffer sb = new StringBuffer();
		System.out.println("sb:" + sb);
		System.out.println("sb.length():" + sb.length());
		System.out.println("sb.capacity():" + sb.capacity());
		System.out.println("----------------------------");

		// StringBuffer(int capacity)：构造一个不带字符，但具有指定初始容量的字符串缓冲区。
		StringBuffer sb2 = new StringBuffer(20);
		System.out.println("sb2:" + sb2);
		System.out.println("sb2.length():" + sb2.length());
		System.out.println("sb2.capacity():" + sb2.capacity());
		System.out.println("----------------------------");

		// StringBuffer(String str):构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容。
		StringBuffer sb3 = new StringBuffer("helloworld");
		System.out.println("sb3:" + sb3);
		System.out.println("sb3.length():" + sb3.length());
		System.out.println("sb3.capacity():" + sb3.capacity());
	}
}
