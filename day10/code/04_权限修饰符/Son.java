package cn.itcast;

class Son extends Father  {
	public static void main(String[] args) {
		Father f = new Father();
		//f.show();
		f.show2();
		f.show3();
		f.show4();

		Son s = new Son();
		//s.show();
		s.show2();
		s.show3();
		s.show4();
	}
}
