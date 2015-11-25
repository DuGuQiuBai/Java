package cn.itcast_02;

/*
 * 字符串是常量,它的值在创建之后不能更改
 * 看内存图解
 */

public class StringDemo {
	public static void main(String[] args) {
		String s = "hello";
		s += "world";
		System.out.println(s);
	}
}
