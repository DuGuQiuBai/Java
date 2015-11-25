package cn.itcast_04;

import java.util.Arrays;

/*
 * 它可以自己把两个字节拼成一个汉字
 * 第一个字节肯定是负数。第二个可能是正数，大部分是负数。
 */
public class StringDemo {
	public static void main(String[] args) {
		// hello你好
		// String s = "hello";
		// byte[] bys = s.getBytes();
		// // [104, 101, 108, 108, 111]
		// System.out.println(Arrays.toString(bys));

		String ss = "我爱你林青霞";
		byte[] bys = ss.getBytes();
		// [-50, -46, -80, -82, -60, -29, -63, -42, -57, -32, -49, -68]
		System.out.println(Arrays.toString(bys));
	}
}