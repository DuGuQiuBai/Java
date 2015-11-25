package cn.itcast_01;

import java.math.BigInteger;

/*
 * BigInteger:可以实现大整数的计算
 * 构造方法：BigInteger(String val)
 */
public class BigIntegerDemo {
	public static void main(String[] args) {
		// System.out.println(Integer.MAX_VALUE); // 2147483647

		// Integer i = new Integer("2147483648"); // NumberFormatException
		// System.out.println(i);

		BigInteger bi = new BigInteger("2147483648");
		System.out.println(bi);
	}
}
