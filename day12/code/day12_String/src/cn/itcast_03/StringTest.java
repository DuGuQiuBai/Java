package cn.itcast_03;

import java.util.Scanner;

/*
 * 模拟登录,给三次机会,并提示还有几次。
 * 
 * 分析：
 * 		A:给出固定的用户名和密码
 * 		B:键盘录入用户名和密码
 * 		C:比较用户名和密码
 * 		D:给出三次机会
 */
public class StringTest {
	public static void main(String[] args) {
		// 给出固定的用户名和密码
		// String username = "admin";
		// String password = "admin";

		for (int x = 0; x < 3; x++) {
			// x=0,1,2

			// 键盘录入用户名和密码
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入用户名：");
			String name = sc.nextLine();
			System.out.println("请输入密码：");
			String pwd = sc.nextLine();

			// 比较用户名和密码
			if ("admin".equals(name) && "admin".equals(pwd)) {
				System.out.println("登录成功");
				break;
			} else {
				if (2 - x == 0) {
					System.out.println("帐号被锁定，请与班长联系");
				} else {
					// 2,1,0
					System.out.println("登录失败，你还有" + (2 - x) + "次机会");
				}
			}
		}
	}
}