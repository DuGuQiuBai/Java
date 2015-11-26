package cn.itcast_09;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {

	@Override
	public Object call() throws Exception {
		for (int x = 0; x < 100; x++) {
			System.out.println(Thread.currentThread().getName() + ":" + x);
		}
		return null;
	}

}
