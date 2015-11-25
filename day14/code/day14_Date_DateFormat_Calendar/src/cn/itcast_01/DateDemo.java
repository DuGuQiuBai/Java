package cn.itcast_01;

import java.util.Date;

/*
 * 类 Date 表示特定的瞬间，精确到毫秒。 
 * 
 * 构造方法：
 * 		public Date():默认就是当前时间
 *		public Date(long date):把给定的毫秒值赋值给日期对象
 *
 * 成员方法：
 * 		public long getTime()：获取毫秒值
 *		public void setTime(long time):把毫秒值作为参数传递
 */
public class DateDemo {
	public static void main(String[] args) {
		// 创建对象
		Date d = new Date();
		System.out.println("d:" + d);

		// try {
		// Thread.sleep(1000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }

		long time = System.currentTimeMillis(); // 获取当前时间的毫秒值
		Date d2 = new Date(time);// 把毫秒值转换为日期表示
		System.out.println("d2:" + d2);

		Date d3 = new Date(3600000);
		// 3600000/1000/60/60 = 1个小时
		System.out.println("d3:" + d3);
		System.out.println("--------------------");

		Date d4 = new Date();
		// long t = d4.getTime();
		// long t2 = System.currentTimeMillis();
		// System.out.println(t);
		// System.out.println(t2);

		d4.setTime(36000000);
		System.out.println("d4:" + d4);

	}
}
