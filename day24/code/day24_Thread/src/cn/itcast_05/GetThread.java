package cn.itcast_05;

public class GetThread implements Runnable {

	private Student s;

	public GetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				if (!s.flag) {
					// 如果没有数据，就等待
					try {
						s.wait(); // t2就等待了,释放了锁对象,从哪里跌倒从哪里爬起。
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				System.out.println(s.name + "---" + s.age);
				// 林青霞---28
				// 刘意 ---31

				// 给出提示
				s.flag = false;
				s.notify();
			}

			// t1,t2抢
		}
	}

}
