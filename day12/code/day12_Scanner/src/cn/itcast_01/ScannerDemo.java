package cn.itcast_01;

import java.io.InputStream;
import java.util.Scanner;

/*
 * Scanner:JDK5以后，用于帮助我们实现键盘录入数据的。
 * 
 * 构造方法：
 * 		public Scanner(InputStream source)
 */
public class ScannerDemo {
	public static void main(String[] args) {
		// 创建键盘录入对象
		// Scanner sc = new Scanner(System.in);

		// public Scanner(InputStream source)

		// System类下有这样的一个成员变量
		// public static final InputStream in;
		// InputStream is = System.in;

		// 假如Demo类下有一个变量
		// public static final int x;
		// public static final Student s;
		// int y = Demo.x;
		// Student student = Demo.s;

		// InputStream is = System.in; //子类对象
		// Scanner sc = new Scanner(is);

		Scanner sc = new Scanner(System.in);
	}
}
