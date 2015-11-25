/*
	接口的成员特点：
		A:成员变量
			是常量，并且是静态的修饰的。
			默认的修饰符：public static final
		B:构造方法
			没有构造方法
		C:成员方法
			只能是抽象方法。
			默认的修饰符：public abstract

		建议：
			自己写接口的内容的时候，把这些默认修饰符加上。
*/
interface Animal {
	//int num = 10;
	//final int num2 = 20;
	public static final int num = 10;

	//public Animal() {}

	public abstract void show();

	//public void method() {}

	//void method();
}

class Dog implements Animal {
	/*
	public void show() {
		//num = 100;
		System.out.println(num);
		//num2 = 200;
		System.out.println(num2);
		System.out.println(Animal.num);
		System.out.println(Animal.num2);

	}
	*/

	public void show() {}
}

class InterfaceDemo2 {
	public static void main(String[] args) {
		Dog d = new Dog();
		//d.show();
	}
}
