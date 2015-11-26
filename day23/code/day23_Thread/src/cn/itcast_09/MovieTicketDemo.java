package cn.itcast_09;

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
 * 		我们把有多条语句操作共享数据的地方给包围起来。然后这就是一个整体了。
 * 		然后把这个整体给锁起来，就可以解决这个问题了。
 * 
 * 关键是如何锁起来呢?
 * 		这个时候，java就提供了一个技术：同步代码块。
 * 
 * 		格式：
 * 			synchronized(对象){
 * 				需要同步的代码;
 * 			}
 * 
 * 		对象到底是什么东西呢?
 * 			就是锁。
 * 			多个线程的锁对象必须一致。
 * 
 * 		同步代码块的对象可以是哪些呢?
 * 			可以是任意的对象
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
