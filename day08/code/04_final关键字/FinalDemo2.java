/*
	final修饰局部变量
		基本类型：基本类型的值不能变量
		引用类型：引用类型的地址值不能改变
*/
class Person {
	public void show() {
		//局部变量
		int num  = 10;
		System.out.println(num);
		num = 100;
		System.out.println(num);

		//final修饰局部变量
		final int num2 = 20;
		System.out.println(num2);
		//num2 = 200;
		System.out.println(num2);
	}

	public void method() {
		//局部变量
		Student s1 = new Student();
		System.out.println(s1.age);
		s1.age = 100;
		System.out.println(s1.age);

		//s1 = new Student();

		//final修饰局部变量
		final Student s2 = new Student();
		System.out.println(s2.age);
		s2.age = 100;
		System.out.println(s2.age);

		//s2 = new Student();
	}
}

class Student {
	int age = 10;
}

class FinalDemo2 {
	public static void main(String[] args) {
		Person p = new Person();
		//p.show();
		p.method();
	}
}
