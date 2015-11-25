package cn.itcast_02;

/*
 * Integer的构造方法：
 * Integer(int value)： 把int类型的值包装成Integer类型
 * Integer(String s): 把数字类型的字符串转换成Integer类型
 */
public class IntegerDemo {
	public static void main(String[] args) {
		// 方式1
		int number = 100;
		Integer i = new Integer(number);
		System.out.println("i:" + i);

		// 方式2
		String s = "100";
		// String s = "abc"; // NumberFormatException:因为你给定的数据不是数字形式的字符串数据
		Integer i2 = new Integer(s);
		System.out.println("i2:" + i2);
	}
}