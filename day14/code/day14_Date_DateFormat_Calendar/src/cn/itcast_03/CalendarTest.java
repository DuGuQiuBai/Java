package cn.itcast_03;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
	public static void main(String[] args) {
		// 获取任意一年的二月有多少天?
		Calendar c = Calendar.getInstance();

		// 设置年月日
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要获取哪一年的2月份：");
		int year = sc.nextInt();

		c.set(year, 2, 1); // 任意一年的3月1日
		c.add(Calendar.DATE, -1); // 任意一年的2月最后一天

		System.out.println(c.get(Calendar.DATE));
	}
}
