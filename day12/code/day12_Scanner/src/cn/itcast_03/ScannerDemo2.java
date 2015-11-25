package cn.itcast_03;

import java.util.Scanner;

/*
 * 问题：
 * 		int--int
 * 		String--String
 * 		String--int
 * 
 * 		int--String有问题，会把回车换行给了String。
 * 
 * 如何解决呢?
 * 		A:重新创建一个新的键盘录入对象。
 * 		B:把键盘所有录入数据全部当作String类型接受。
 * 		      需要什么类型，就把String转换为该类型。
 * 		      至于怎么转，明天讲。
 */
public class ScannerDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// int x = sc.nextInt();
		// int y = sc.nextInt();
		// System.out.println(x);
		// System.out.println(y);

		// String x = sc.nextLine();
		// String y = sc.nextLine();
		// System.out.println(x);
		// System.out.println(y);

		// String x = sc.nextLine();
		// int y = sc.nextInt();
		// System.out.println(x);
		// System.out.println(y);

		int x = sc.nextInt();
		
		sc = new Scanner(System.in);
		
		String y = sc.nextLine(); // 把回车换行给了这里
		System.out.println(x);
		System.out.println(y);
	}
}
