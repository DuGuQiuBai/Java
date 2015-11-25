package cn.itcast_05;

/*
 * 1:String,StringBuffer,StringBuilder的区别?
 * A:String长度固定，StringBuffer和StringBuilder的长度可变。
 * B:StringBuffer线程安全，效率低。StringBuilder线程不安全，效率高。
 * 
 * 2:StringBuffer和数组的区别
 * A:StringBuffer的长度可变，可以存储任意数据类型，最终结果其实是一个字符串。
 * B:数组长度固定，存储同一种数据类型的元素。
 * 
 * 3:看程序写结果：
 * 		String作为参数传递，StringBuffer作为参数传递
 * 
 * 		String是一种特殊的引用类型，在作为参数传递的时候，可以当作基本类型来看。因为它传递的也是常量值。
 * 		
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		System.out.println(s1 + "---" + s2); // hello---world
		change(s1, s2);
		System.out.println(s1 + "---" + s2);// world---worldworld???

		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("world");
		System.out.println(sb1 + "---" + sb2);// hello---world
		change(sb1, sb2);
		System.out.println(sb1 + "---" + sb2); // world---worldworld???
	}

	public static void change(StringBuffer sb1, StringBuffer sb2) {
		System.out.println(sb1 + "---" + sb2);// hello---world
		sb1 = sb2;// sb1="world"
		sb2 = sb1.append(sb2); // sb2=worldworld
		System.out.println(sb1 + "---" + sb2);// world---worldworld ???
	}

	public static void change(String s1, String s2) {
		System.out.println(s1 + "---" + s2);// hello---world
		s1 = s2; // s1=world
		s2 = s1 + s2; // s2=worldworld
		System.out.println(s1 + "---" + s2); // world---worldworld
	}
}
