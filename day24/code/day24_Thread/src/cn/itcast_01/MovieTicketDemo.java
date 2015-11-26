package cn.itcast_01;

/*
 * 为了更清楚的让我们知道是如何加锁和释放锁的，JDK5以后就提供了一个接口：Lock锁。
 * Lock
 * 		public void lock():加锁
 * 		public void unlock():释放锁
 * 实现类对象
 * 		public ReentrantLock()
 */
public class MovieTicketDemo {
	public static void main(String[] args) {
		MovieTicket mt = new MovieTicket();

		Thread t1 = new Thread(mt, "窗口1");
		Thread t2 = new Thread(mt, "窗口2");
		Thread t3 = new Thread(mt, "窗口3");

		t1.start();
		t2.start();
		t3.start();
	}
}
