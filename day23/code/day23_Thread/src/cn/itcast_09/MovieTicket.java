package cn.itcast_09;

class Demo {
}

public class MovieTicket implements Runnable {
	// 定义100张票
	private int tickets = 100;

	// private Object obj = new Object();
	private Demo d = new Demo();

	@Override
	public void run() {
		while (true) {
			// t1,t2,t3
			// t1过来了，看到了同步代码块的锁标记，绿色标记(火车上厕所，过马路的红绿灯)
			// t2,t3都只能在这里傻傻的等待
			synchronized (this) {
				// t1就进来了，立马修改标记为红色标记
				if (tickets > 0) {
					// 更符合现实情况
					try {
						Thread.sleep(100); // t1休息会
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println(Thread.currentThread().getName()
							+ "正在出售第" + (tickets--) + "张票");
				}
			}
			// t1出来了，立马修改标记为绿色标记
		}
	}
}
