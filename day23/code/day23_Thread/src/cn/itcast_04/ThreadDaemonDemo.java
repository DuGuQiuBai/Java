package cn.itcast_04;

/*
 * public final void setDaemon(boolean on):当正在运行的线程都是守护线程时，Java 虚拟机退出。 
 * 
 * 举例：坦克大战
 */
public class ThreadDaemonDemo {
	public static void main(String[] args) {
		Thread.currentThread().setName("刘备");

		ThreadDaemon td1 = new ThreadDaemon();
		ThreadDaemon td2 = new ThreadDaemon();

		td1.setName("关羽");
		td2.setName("张飞");

		// 设置守护线程
		td1.setDaemon(true);
		td2.setDaemon(true);

		td1.start();
		td2.start();

		for (int x = 0; x < 5; x++) {
			System.out.println(Thread.currentThread().getName() + ":" + x);
		}

	}
}
