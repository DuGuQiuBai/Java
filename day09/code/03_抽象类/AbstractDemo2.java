/*
	抽象类的成员特点：
		A:成员变量
			可以是变量，也可以是常量
		B:构造方法
			有构造方法。但是不能实例化。
			问题：构造方法有什么用呢?
				用于子类访问父类数据的初始化
		C:成员方法
			可是有抽象方法，也可以有非抽象方法。
			抽象方法：强制要求子类做某些事情。
			非抽象方法：用于给子类直接使用，提高了代码的复用性。
*/
abstract class Animal {
	int num = 10;
	final int num2 = 20;

	public Animal() {}

	public void method() {
		System.out.println("method");
	}

	public abstract void function();
}

class Dog extends Animal  {
	public void show() {
		num = 100;
		System.out.println(num);
		//num2 = 200;
		System.out.println(num2);
	}

	public void function() {}
}

class AbstractDemo2 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.show();
	}
}
