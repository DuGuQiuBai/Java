package cn.itcast_02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 算一下你来到这个世界多少天?
 * 分析：
 * 		A:键盘录入你的出生年月日
 * 		B:把这个字符串转换为一个日期
 * 		C:通过日期获取到一个毫秒值
 * 		D:获取当前时间的毫秒值
 * 		E:用D-C得到一个毫秒值
 * 		F:把E得到的毫秒值计算成一个天即可
 */

public class MyDayDemo {
	public static void main(String[] args) throws ParseException {
		// 键盘录入你的出生年月日
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的出生日期：(yyyy-mm-dd)");
		String s = sc.nextLine();

		// 把这个字符串转换为一个日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Date d = sdf.parse(s);

		// 通过日期获取到一个毫秒值
		long myTime = d.getTime();

		// 获取当前时间的毫秒值
		long time = System.currentTimeMillis();

		// 用D-C得到一个毫秒值
		long dateTime = time - myTime;

		// 把得到的毫秒值计算成一个天即可
		System.out.println("你来到这个世界已经：" + (dateTime / 1000 / 60 / 60 / 24)
				+ "天了");
	}
}
