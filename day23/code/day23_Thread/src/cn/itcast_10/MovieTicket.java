package cn.itcast_10;

class Demo {
}

public class MovieTicket implements Runnable {
	// 定义100张票
	private static int tickets = 100;
	private Object obj = new Object();
	private int x = 0;

	// 改进为if...else的实现
	// @Override
	// public void run() {
	// while (true) {
	// if (x % 2 == 0) {
	// synchronized (obj) {
	// if (tickets > 0) {
	// try {
	// Thread.sleep(100);
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	//
	// System.out.println(Thread.currentThread().getName()
	// + "正在出售第" + (tickets--) + "张票");
	// }
	// }
	// } else {
	// synchronized (obj) {
	// if (tickets > 0) {
	// try {
	// Thread.sleep(100);
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	//
	// System.out.println(Thread.currentThread().getName()
	// + "正在出售第" + (tickets--) + "张票");
	// }
	// }
	// }
	// x++;
	// }
	// }

	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				synchronized (MovieTicket.class) {
					if (tickets > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

						System.out.println(Thread.currentThread().getName()
								+ "正在出售第" + (tickets--) + "张票");
					}
				}
			} else {
				sellTicket();
			}
			x++;
		}
	}

	// 改进为一个方法实现。
	// private void sellTicket() {
	// synchronized (obj) {
	// if (tickets > 0) {
	// try {
	// Thread.sleep(100);
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	//
	// System.out.println(Thread.currentThread().getName() + "正在出售第"
	// + (tickets--) + "张票");
	// }
	// }
	// }

	// private synchronized void sellTicket() {
	// if (tickets > 0) {
	// try {
	// Thread.sleep(100);
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	//
	// System.out.println(Thread.currentThread().getName() + "正在出售第"
	// + (tickets--) + "张票");
	// }
	// }

	private static synchronized void sellTicket() {
		if (tickets > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + "正在出售第"
					+ (tickets--) + "张票");
		}
	}
}
