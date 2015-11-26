package cn.itcast_12;

import java.util.Timer;
import java.util.TimerTask;

/*
 * 定义任务由两个类来一起完成：
 * Timer,TimerTask
 * 
 * Timer:
 * 		public Timer()创建一个新计时器。
 */
public class TimerDemo {
	public static void main(String[] args) {
		// 创建定义器
		final Timer t = new Timer();

		// public void schedule(TimerTask task,long delay):在delay毫秒后完成task的任务
		// t.schedule(new MyTask(t), 3000);

		// 匿名内部类实现
		t.schedule(new TimerTask() {

			@Override
			public void run() {
				System.out.println("炸弹爆炸了,duang duang duang");
				t.cancel();
			}

		}, 3000);
	}
}

class MyTask extends TimerTask {
	private Timer t;

	public MyTask(Timer t) {
		this.t = t;
	}

	@Override
	public void run() {
		System.out.println("炸弹爆炸了,duang duang duang");
		t.cancel();
	}
}