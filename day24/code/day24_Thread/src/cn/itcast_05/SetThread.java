package cn.itcast_05;

public class SetThread implements Runnable {

	private Student s;
	private int x = 0;

	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				if (s.flag) {
					// 这就表示有数据
					try {
						s.wait(); // t1就等待了
					} catch (InterruptedException e) {
						e.printStackTrace();
					}// 就在这里等待
				}

				if (x % 2 == 0) {
					s.name = "林青霞";
					s.age = 28;
				} else {
					s.name = "刘意";
					s.age = 31;
				}
				x++; // x=1,x=2

				// 给出提示
				s.flag = true;
				s.notify(); // 唤醒等待的线程，并不代表该线程能够立即获取CPU的执行权
			}
			// t1,t2抢
		}
	}

}
