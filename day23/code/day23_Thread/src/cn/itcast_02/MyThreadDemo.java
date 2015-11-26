package cn.itcast_02;

/*
 * 如何获取和设置线程名称?
 * public final String getName()
 * 		如果你没有设置名称，会有一个默认名称。Thread-编号
 * public final void setName(String name)
 * 
 * 其实通过构造方法也可以给线程起名字?
 * 
 * 请问main方法在哪个线程中呢?
 * 		主线程
 * 		如何获取主线程的名称呢?
 * 		public static Thread currentThread():这样就可以获取任意方法所在的线程名称
 */
public class MyThreadDemo {
	public static void main(String[] args) {
		// 无参+setXxx()
		// MyThread mt1 = new MyThread();
		// MyThread mt2 = new MyThread();
		// mt1.setName("林青霞");
		// mt2.setName("刘意");

		// 带参
		MyThread mt1 = new MyThread("王祖贤");
		MyThread mt2 = new MyThread("杨岗");

		mt1.start();
		mt2.start();

		System.out
				.println(Thread.currentThread().getName() + "AAAAAAAAAAAAAAA");
	}
}
