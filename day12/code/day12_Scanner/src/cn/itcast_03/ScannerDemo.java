package cn.itcast_03;

import java.util.Scanner;

/*
 * public int nextInt():获取一个int类型的数据
 * public String nextLine():获取一个字符串类型的数据
 */
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s);
	}
}
