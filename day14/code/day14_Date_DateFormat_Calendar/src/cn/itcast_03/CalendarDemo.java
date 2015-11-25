package cn.itcast_03;

import java.util.Calendar;

/*
 * Calendar:把时间分割成了一个个的年，月，日，时，分，秒等。如果我要得到一个完整的年月日时分秒，需要我们自己拼数据。
 * 
 * 日历对象	---		年，月，日，时，分，秒
 * 
 * public int get(int field):返回给定日历字段的值。
 */
public class CalendarDemo {
	public static void main(String[] args) {
		// 创建对象
		// 日历字段已由当前日期和时间初始化：
		Calendar rightNow = Calendar.getInstance(); // 多态

		// 获取年
		int year = rightNow.get(Calendar.YEAR);
		System.out.println(year);
		// 获取月
		int month = rightNow.get(Calendar.MONTH);
		System.out.println(month + 1);
		// 获取日
		int date = rightNow.get(Calendar.DATE);
		System.out.println(date);
		// 获取时
		int hour = rightNow.get(Calendar.HOUR);
		System.out.println(hour);
		// 获取分
		int minute = rightNow.get(Calendar.MINUTE);
		System.out.println(minute);
		// 获取秒
		int second = rightNow.get(Calendar.SECOND);
		System.out.println(second);
	}
}
