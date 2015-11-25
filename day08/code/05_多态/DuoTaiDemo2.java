/*
	多态的成员访问特点：
		A:成员变量
			编译看左边，运行看左边。
		B:成员方法
			编译看左边，运行看右边。

			为什么呢?
				因为成员方法有重写，而变量没有。
		C:静态方法
			编译看左边，运行看左边。

			静态方法其实没有重写这一说。因为它是跟类相关。
*/
class Animal {
	public int age = 40;

	
	public void show() {
		System.out.println("show animal");
	}
	
	public static void method() {
		System.out.println("method animal");
	}
}

class Dog extends Animal {
	public int age = 20;

	public void show() {
		System.out.println("show dog");
	}

	public static void method() {
		System.out.println("method dog");
	}
}

class DuoTaiDemo2 {
	public static void main(String[] args) {
		//多态
		Animal a = new Dog();
		System.out.println(a.age);
		//System.out.println(a.num);
		a.show();

		a.method();
	}
}
