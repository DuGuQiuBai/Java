package cn.itcast_08;

/*
 * 为了更符合现实情况，我们加一些延迟。
 * 当我们加入了一些延时之后，出现了两个问题：
 * A:相同的票出现了多次
 * 		CPU的一次操作必须是原子性的
 * B:还出现了负数票的情况
 * 		随机性和延迟导致的
 * 
 * 为什么会有这样的问题产生呢?什么情况下会产生线程安全问题呢?
 * A:多线程环境	
 * B:有共享数据
 * C:多条语句操作共享数据
 * 
 * 那么我们该如何解决呢?
 */
public class MovieTicketDemo {
	public static void main(String[] args) {
		// 创建一个票资源
		MovieTicket mt = new MovieTicket();

		// 创建三个线程
		Thread t1 = new Thread(mt, "窗口1");
		Thread t2 = new Thread(mt, "窗口2");
		Thread t3 = new Thread(mt, "窗口3");
		Thread t4 = new Thread(mt, "窗口4");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
