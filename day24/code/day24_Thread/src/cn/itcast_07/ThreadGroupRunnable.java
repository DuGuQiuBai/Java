package cn.itcast_07;

public class ThreadGroupRunnable implements Runnable {

	@Override
	public void run() {
		for (int x = 0; x < 100; x++) {
			System.out.println(Thread.currentThread().getName() + ":" + x);
		}
	}

}
