package cn.itcast_08;

public class MovieTicket implements Runnable {
	// 定义100张票
	private int tickets = 100;

	// @Override
	// public void run() {
	// while (true) {
	// // 假设tickets = 50; t1,t2,t3分别来到了这里
	// if (tickets > 0) {
	// // 更符合现实情况
	// try {
	// Thread.sleep(100); // t1睡下了,t2睡下了
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	//
	// System.out.println(Thread.currentThread().getName() + "正在出售第"
	// + (tickets--) + "张票");
	// // 理想情况
	// // 窗口1正在出售第50张票，tickets=49
	// // 窗口2正在出售第49张票，tickets=48
	// // 一个CPU的时间点能够执行的东西必须是一个原子性的东西。
	// // System.out.println(a+b*c);
	// // Thread.currentThread().getName() + "正在出售第"+ (tickets--) +
	// // "张票"
	// // 这里其实有很多个操作在执行。
	// // 假设当输出语句刚刚输出 窗口1正在出售第50张票,在这个时候，t1没有了执行权，t2抢到了，继续输出
	// // 窗口2正在出售第50张票
	//
	// }
	// }
	// }

	@Override
	public void run() {
		while (true) {
			// 假设tickets = 1; t1,t2,t3分别来到了这里
			if (tickets > 0) {
				// 更符合现实情况
				try {
					Thread.sleep(100);// t1进来了,t2进来了,t3进来了
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				// 依次醒过来
				System.out.println(Thread.currentThread().getName() + "正在出售第"
						+ (tickets--) + "张票");
				// 窗口1正在出售第1张票，tickets=0
				// 窗口2正在出售第0张票，tickets=-1
				// 窗口3正在出售第-1张票，tickets=-2
			}
		}
	}
}
