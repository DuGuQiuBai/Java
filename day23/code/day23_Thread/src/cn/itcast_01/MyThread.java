package cn.itcast_01;

public class MyThread extends Thread {
	@Override
	public void run() {
		// System.out.println("hello");
		// 要被线程执行的代码，一般来说应该是比较耗时的
		for (int x = 0; x < 100; x++) {
			System.out.println("hello" + x);
		}
	}
}
