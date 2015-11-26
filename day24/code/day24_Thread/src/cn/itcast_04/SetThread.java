package cn.itcast_04;

public class SetThread implements Runnable {

	private Student s;
	private int x = 0;

	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		// ..........
		while (true) {
			synchronized (s) {
				if (x % 2 == 0) {
					s.name = "林青霞"; // 没有执行权了。
					s.age = 28;
				} else {
					s.name = "刘意";
					s.age = 31;
				}
				x++;
			}

		}
		// ...........
	}

}
