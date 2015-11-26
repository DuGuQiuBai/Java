package cn.itcast_02;

public class MyThread extends Thread {
	public MyThread() {
	}

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int x = 0; x < 100; x++) {
			System.out.println(getName() + "---hello" + x);
		}
	}
}
