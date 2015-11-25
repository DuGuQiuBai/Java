package cn.itcast_02;

/*
 * String s = new String(“hello”)和String s = “hello”;的区别
 * 
 * ==:比较引用类型，比较的是地址值
 * equal():默认比较的是地址值。String类重写了equals()方法，该方法的作用是比较字符串的内容是否相同
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";

		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true
	}
}
