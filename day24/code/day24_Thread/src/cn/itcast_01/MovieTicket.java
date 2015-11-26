package cn.itcast_01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MovieTicket implements Runnable {

	private int tickets = 100;
	private Object obj = new Object();

	// 造锁
	// private ReentrantLock lock = new ReentrantLock();
	private Lock lock = new ReentrantLock();

	// @Override
	// public void run() {
	// while (true) {
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
	// }

	@Override
	public void run() {
		while (true) {
			try {
				// 加锁
				lock.lock();

				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println(Thread.currentThread().getName()
							+ "正在出售第" + (tickets--) + "张票");
				}
			} finally {
				// 释放锁
				lock.unlock();
			}
		}
	}
}
