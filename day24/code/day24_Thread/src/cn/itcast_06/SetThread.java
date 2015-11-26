package cn.itcast_06;

public class SetThread implements Runnable {

	private Student s;
	private int x = 0;

	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				s.set("¡÷«‡œº", 28);
			} else {
				s.set("¡ı“‚", 31);
			}
			x++;
		}
	}

}
