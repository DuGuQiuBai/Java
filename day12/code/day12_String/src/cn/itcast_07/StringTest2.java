package cn.itcast_07;

import java.util.Scanner;

/*
 * 字符串反转
 * 举例：键盘录入”abc”		输出结果：”cba”
 */
public class StringTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();

		String result = reverse(s);
		System.out.println(result);
	}

	// 写功能实现
	public static String reverse(String s) {
		String result = "";

		char[] chs = s.toCharArray();
		for (int x = chs.length - 1; x >= 0; x--) {
			result += chs[x];
		}

		return result;
	}
}
