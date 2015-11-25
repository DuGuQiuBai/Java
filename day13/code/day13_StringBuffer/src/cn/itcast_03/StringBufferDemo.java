package cn.itcast_03;

/*
 * 反转是StringBuffer的特有功能，String没有。
 * 而String要做反转，稍微麻烦一点。如果能够使用StringBuffer的功能就好了。
 * 那么，我们到底能不能让一个类去使用另一个类的功能呢?可以。
 * 前提：这两个类之间可以实现相互转换。
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//String -- StringBuffer;
		//StringBuffer sb = "hello";
		//StringBuffer(String str) 
		String s = "hello";
		StringBuffer sb = new StringBuffer(s);
		
		//StringBuffer -- String
		//String(StringBuffer buffer) 
		String ss = new String(sb);
	}
}
