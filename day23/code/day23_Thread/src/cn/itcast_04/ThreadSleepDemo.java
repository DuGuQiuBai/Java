package cn.itcast_04;

/*
 * public static void sleep(long millis):设置线程休眠
 */
public class ThreadSleepDemo {
	public static void main(String[] args) {
		ThreadSleep ts1 = new ThreadSleep();
		ThreadSleep ts2 = new ThreadSleep();
		ThreadSleep ts3 = new ThreadSleep();

		ts1.setName("和珅");
		ts2.setName("秦桧");
		ts3.setName("高俅");

		ts1.start();
		ts2.start();
		ts3.start();
	}
}
