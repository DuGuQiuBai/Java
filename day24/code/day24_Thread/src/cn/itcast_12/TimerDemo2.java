package cn.itcast_12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * 炸弹要连续炸
 */
public class TimerDemo2 {
	public static void main(String[] args) throws ParseException {
		// 创建定义器
		Timer t = new Timer();

		// 启动任务
		// t.schedule(new TimerTask() {
		// @Override
		// public void run() {
		// System.out.println("要炸了，快跑");
		// }
		// }, 2000);

		// public void schedule(TimerTask task,long delay,long
		// period):第一次是delay后启动，以后每次是period启动
		// t.schedule(new TimerTask() {
		// @Override
		// public void run() {
		// System.out.println("炸死你");
		// }
		// }, 3000, 1000);

		// public void schedule(TimerTask task,Date time)
		String s = "2015-04-12 15:48:20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(s);

		t.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("炸死你");
			}
		}, d, 3000);
	}
}
