/*
	static:静态关键字。

	作用：
		可以修饰成员变量和成员方法

	特点：
		A:随着类的加载而加载	
		B:优先于对象存在
		C:被类的所有对象共享
			这也是我们判断是否使用静态关键字的条件

			饮水机：可以被静态修饰
			水杯：不可以被静态修饰
		D:可以通过类名调用
			我们的调用既可以是对象，还可以是类名
*/
class Student {
	public void show() {
		System.out.println("show");
	}

	public static void show2() {
		System.out.println("show2");
	}
}

class StudentDemo2 {
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
		s.show2();

		Student.show2();
		//Student.show();
	}
}
