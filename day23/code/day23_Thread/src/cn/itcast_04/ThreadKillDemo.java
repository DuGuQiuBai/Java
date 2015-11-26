package cn.itcast_04;

/*
 * 中断线程
 *		public final void stop():直接死
 *		public void interrupt():死后还可以写遗嘱
 */
public class ThreadKillDemo {
	public static void main(String[] args) {
		ThreadKill tk = new ThreadKill();
		tk.start();

		// 假设我三秒就不让让你再执行了，必须让你死去
		try {
			Thread.sleep(3000);
			// tk.stop();
			tk.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
