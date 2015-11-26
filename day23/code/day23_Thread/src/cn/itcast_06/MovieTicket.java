package cn.itcast_06;

public class MovieTicket extends Thread {
	// 定义成员变量
	private static int tickets = 100;

	@Override
	public void run() {
		// 定义100张票
		// int tickets = 100;

		while (true) {
			if (tickets > 0) {
				System.out.println(getName() + "正在出售第" + (tickets--) + "张票");
			}
		}
	}
}
