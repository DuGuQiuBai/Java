package cn.itcast_04;

import java.util.Scanner;

/*
 * 统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
 * 举例：Hello123World
 * 结果：
 * 		大写：2
 * 		小写：8
 * 		数字：3
 * 
 * 分析：
 * 		A:键盘录入一个字符串
 * 		B:定义三个统计变量
 * 			int bigCount = 0;
 * 			int smallCount = 0;
 * 			int numberCount = 0;
 * 		C:遍历字符串，得到每一个字符
 * 		D:如何判断字符是大写，小写还是数字呢?
 * 			char ch = ???;
 * 
 * 			ASCII码表：
 * 				a	97	z=122
 * 				A	65  Z=90
 * 				0	48	9=57
 * 
 * 				ch>=97 && ch<=122
 * 				...
 * 
 * 			ch>='a' && ch<='z'
 * 			ch>='A'	&& ch<='Z'
 * 			ch>='0'	&& ch<='9'
 * 		E:输出结果
 */
public class StringTest2 {
	public static void main(String[] args) {
		// 键盘录入一个字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();

		// 定义三个统计变量
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;

		// 遍历字符串，得到每一个字符
		for (int x = 0; x < s.length(); x++) {
			char ch = s.charAt(x);

			// 如何判断字符是大写，小写还是数字呢?
			if (ch >= 'A' && ch <= 'Z') {
				bigCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				smallCount++;
			} else if (ch >= '0' && ch <= '9') {
				numberCount++;
			}
		}

		// 输出结果
		System.out.println("大写：" + bigCount);
		System.out.println("小写：" + smallCount);
		System.out.println("数字：" + numberCount);
	}
}
