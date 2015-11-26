package cn.itcast_06;

/*
 * 某电影院目前正在上映贺岁大片，共有100张票，而它有3个售票窗口售票，请设计一个程序模拟该电影院售票。
 * 通过我们的学习，我们大体的可以分析出应该有三个线程执行卖票的动作。
 * 
 * 实现方案：
 * 		A:继承Thread
 * 		B:实现Runnable接口
 * 
 * 继承Thread
 */
public class MovieTicketDemo {
	public static void main(String[] args) {
		// 创建三个线程对象
		MovieTicket mt1 = new MovieTicket();
		MovieTicket mt2 = new MovieTicket();
		MovieTicket mt3 = new MovieTicket();

		mt1.setName("窗口1");
		mt2.setName("窗口2");
		mt3.setName("窗口3");

		mt1.start();
		mt2.start();
		mt3.start();
	}
}
