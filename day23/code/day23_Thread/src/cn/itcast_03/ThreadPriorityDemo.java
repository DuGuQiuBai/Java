package cn.itcast_03;

/*
 * 线程的调度：两种
 * 分时调度模型   平均分配
 * 抢占式调度模型   谁优先级高谁先执行
 * java采用的是抢占式调度模型。
 * 
 * java是如何获取和设置线程的优先级呢?
 * 我们现在并没有给出每个线程的优先级，但是，它一样可以跑。说明了，它应该是有默认优先级。
 * public final int getPriority():返回线程的优先级。 通过测试，我们知道线程的默认优先级是5
 * 
 * public final void setPriority(int newPriority):更改线程的优先级。 通过查看源码，我们知道线程的优先级范围是：1-10。默认是5
 * 
 * 线程的优先级高，不代表一定会先执行完毕。只有在次数特别多的情况下，才能体现出来。
 */
public class ThreadPriorityDemo {
	public static void main(String[] args) {
		// 创建三个线程对象
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();

		// 通过setName()方法
		tp1.setName("东方不败");
		tp2.setName("岳不群");
		tp3.setName("林平之");

		// 获取默认优先级
		// System.out.println(tp1.getPriority());
		// System.out.println(tp2.getPriority());
		// System.out.println(tp3.getPriority());

		// 设置线程优先级
		// IllegalArgumentException
		// tp1.setPriority(1000);

		tp1.setPriority(10);
		tp2.setPriority(1);

		// 启动线程
		tp1.start();
		tp2.start();
		tp3.start();
	}
}
