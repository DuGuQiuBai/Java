package cn.itcast_10;

/*
 * 如果一个方法一进去就加锁，我们其实还有一种同步的方案，叫同步方法。
 * 格式：就是把同步关键字加到方法上
 * 
 * 同步方法的锁对象是什么呢?
 * 		同步方法的锁对象是this
 * 
 * 静态同步方法的锁对象是什么呢?
 * 		当前类的字节码文件对象。
 * 			Class c = MovieTicket.class;
 * 			Class c = obj.getClass();
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
