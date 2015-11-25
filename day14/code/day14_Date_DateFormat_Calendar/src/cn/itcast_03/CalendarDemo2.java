package cn.itcast_03;

import java.util.Calendar;

/*
 * public void add(int field,int amount):根据给定的日历自动和值，改变时间
 * public final void set(int year,int month,int date):设置年月日
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
		// 获取日历类对象
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR) + "---"
				+ (c.get(Calendar.MONTH) + 1) + "---" + c.get(Calendar.DATE));
		c.add(Calendar.YEAR, -3);
		c.add(Calendar.MONTH, 2);
		c.add(Calendar.DATE, -12);
		System.out.println(c.get(Calendar.YEAR) + "---"
				+ (c.get(Calendar.MONTH) + 1) + "---" + c.get(Calendar.DATE));

		// 重写给c对象赋值
		c.set(2012, 3, 4);
		System.out.println(c.get(Calendar.YEAR) + "---"
				+ (c.get(Calendar.MONTH) + 1) + "---" + c.get(Calendar.DATE));
	}
}
