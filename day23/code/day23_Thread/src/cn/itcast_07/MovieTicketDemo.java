package cn.itcast_07;

/*
 * 实现Runnable接口
 */
public class MovieTicketDemo {
	public static void main(String[] args) {
		// 创建一个票资源
		MovieTicket mt = new MovieTicket();

		// 创建三个线程
		Thread t1 = new Thread(mt, "窗口1");
		Thread t2 = new Thread(mt, "窗口2");
		Thread t3 = new Thread(mt, "窗口3");

		t1.start();
		t2.start();
		t3.start();
	}
}
