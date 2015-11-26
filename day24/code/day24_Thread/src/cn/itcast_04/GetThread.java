package cn.itcast_04;

public class GetThread implements Runnable {

	private Student s;

	public GetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				System.out.println(s.name + "---" + s.age);
			}
		}
	}

}
