package cn.itcast_08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 线程池：线程池里的每一个线程代码结束后，并不会死亡，而是再次回到线程池中成为空闲状态，等待下一个对象来使用。
 * 
 * 步骤：
 * 		A:定义类MyRunnable实现Runnable接口
 * 		B:创建MyRunnable对象
 * 		C:创建线程池对象
 * 		D:提交
 * 		E:释放
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		// 创建实现了Runnable接口的对象
		MyRunnable my = new MyRunnable();

		// 创建线程池对象
		// public static ExecutorService newFixedThreadPool(int nThreads)
		ExecutorService pool = Executors.newFixedThreadPool(5);

		// 提交代码
		// Future<?> submit(Runnable task)
		pool.submit(my);
		pool.submit(my);
		pool.submit(my);
		pool.submit(my);
		pool.submit(my);

		// 释放
		pool.shutdown();
	}
}
