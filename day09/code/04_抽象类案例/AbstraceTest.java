/*
两个小问题：
	1：一个类如果没有抽象方法，可不可以定义为抽象类?如果可以，有什么意义?
		可以。
		为了不让别人创建对象。
	2：abstract不能和哪些关键字共存
		final: final修饰的方法不能被重写，而abstract修饰的方法要求必须被重写。
		private：private修饰的方法不能被重写，而abstract修饰的方法要求必须被重写。
	
		static：static修饰的方法可以通过类名调用，而abstract修饰的方法是没有方法体的，
				调用一个没有方法体的方法是没有任何意义的，所以不能共存。
*/
abstract class Student {
	//public final abstract void show();
	//private abstract void show();
	//public static abstract void show();
}

class AbstractTest {
	public static void main(String[] args) {
	
	}
}