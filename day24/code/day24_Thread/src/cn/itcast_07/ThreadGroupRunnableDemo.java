package cn.itcast_07;

/*
 * 线程组：Java中使用ThreadGroup来表示线程组，它可以对一批线程进行分类管理，Java允许程序直接对线程组进行控制。
 * 
 * 默认情况下，所有的线程都属于主线程组。
 * public final ThreadGroup getThreadGroup()：返回该线程所属的线程组。 
 * 
 * public final String getName():返回此线程组的名称。 
 * 
 * Thread(ThreadGroup group, Runnable target, String name):设置线程组名称
 * 
 * public final int getMaxPriority():返回此线程组最高优先级
 */
public class ThreadGroupRunnableDemo {
	public static void main(String[] args) {
		// method1();

		method2();
	}

	// 设置线程所属的线程组
	private static void method2() {
		// public ThreadGroup(String name)
		ThreadGroup tg = new ThreadGroup("王子二人组");
		// tg.setDaemon(true);

		ThreadGroupRunnable tgr = new ThreadGroupRunnable();
		Thread t1 = new Thread(tg, tgr, "王亚聪");
		Thread t2 = new Thread(tg, tgr, "王思聪");

		// System.out.println(t1.getThreadGroup().getName()); // 王子二人组
		// System.out.println(t2.getThreadGroup().getName()); // 王子二人组
		// System.out.println(Thread.currentThread().getThreadGroup().getName());
		// // main

		// 设置t1,t2为守护线程
		// t1.setDaemon(true);
		// t2.setDaemon(true);

		// tg.stop();

		// System.out.println(tg.isDaemon());

		// t1.start();
		// t2.start();

		// for (int x = 0; x < 5; x++) {
		// System.out.println("王健林" + x);
		// }

		// System.out.println(tg.getMaxPriority());

		// System.out.println(tg.toString());

		tg.setMaxPriority(8);
		// System.out.println(tg.getMaxPriority());

		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
	}

	// 获取线程所在的线程组名称
	private static void method1() {
		ThreadGroupRunnable tgr = new ThreadGroupRunnable();

		Thread t1 = new Thread(tgr, "王亚聪");
		Thread t2 = new Thread(tgr, "王思聪");

		// public final ThreadGroup getThreadGroup()
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();

		String t1Name = tg1.getName();
		String t2Name = tg2.getName();

		System.out.println(t1Name); // main
		System.out.println(t2Name); // main

		System.out.println(Thread.currentThread().getThreadGroup().getName()); // main

		// t1.start();
		// t2.start();
	}
}
