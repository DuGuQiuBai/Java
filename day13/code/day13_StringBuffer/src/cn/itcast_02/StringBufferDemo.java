package cn.itcast_02;

/*
 * 添加功能：
 * public StringBuffer append(String str)：追加数据，往已有数据的后面。
 * public StringBuffer insert(int offset,String str):插入数据，往指定位置添加数据。
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		// 创建字符串缓冲区对象
		StringBuffer sb = new StringBuffer();

		// 调用
		// public StringBuffer append(String str)：追加数据，往已有数据的后面。
		// StringBuffer sb2 = sb.append("hello");
		// System.out.println(sb == sb2); // true
		// System.out.println("sb:" + sb);
		// System.out.println("sb2:" + sb2);

		// sb.append("hello");
		// sb.append("world");
		// sb.append("java");

		// 链式编程
		sb.append("hello").append("world").append("java");

		// public StringBuffer insert(int offset,String str):插入数据，往指定位置添加数据。
		sb.insert(5, "ak47");

		System.out.println("sb:" + sb);
	}
}
