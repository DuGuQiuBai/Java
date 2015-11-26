package cn.itcast_05;

/*
 * 实现Runnable接口的步骤：
 * A:定义类MyRunnable实现接口Runnable
 * B:重写run()方法
 * C:创建MyRunnable的对象
 * D:创建Thread类的对象，并把C步骤的对象作为构造参数传递
 * E:启动线程
 * 
 * 有了继承Thread类的方式，为什么还要有实现Runnable接口的方式?
 * 原因是因为类是单继承。
 */
public class MyRunnableDemo {
	public static void main(String[] args) {
		// 创建MyRunnable的对象
		MyRunnable my = new MyRunnable();

		// 创建Thread类的对象，并把C步骤的对象作为构造参数传递
		// Thread(Runnable target)
		// Thread(Runnable target, String name)
		Thread t1 = new Thread(my, "孟非");
		Thread t2 = new Thread(my, "乐嘉");

		// 启动线程
		t1.start();
		t2.start();
	}
}
