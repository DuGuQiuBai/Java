package cn.itcast_03;

public class GetThread implements Runnable {

	private Student s;

	public GetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		// Student s = new Student();
		System.out.println(s.name + "---" + s.age);
	}

}
