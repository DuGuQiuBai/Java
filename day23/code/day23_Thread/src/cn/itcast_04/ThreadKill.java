package cn.itcast_04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadKill extends Thread {
	@Override
	public void run() {
		System.out.println("开始执行："
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
						.format(new Date()));

		try {
			// 亲，不要打扰我，我要休息10秒
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// e.printStackTrace();
			System.out.println("我被杀死了");
		}

		System.out.println("结束执行："
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
						.format(new Date()));
	}
}
