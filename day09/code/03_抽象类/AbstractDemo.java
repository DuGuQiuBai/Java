/*
	抽象类概述：动物不是一个具体的事物，只有猫，狗才是具体的个体。
				并且，在动物中我们针对吃的功能，也不应该给出具体的体现，
				因为不同的动物吃的内容是不一样的，我们应该让具体的动物自己去实现自己吃的功能。
				而一个功能如果没有具体的体现，就是一个抽象的内容。如何表示呢?

				格式：
					修饰符 返回值类型 方法名(参数列表...);

				为了表示这是一个抽象的东西，java提供了一个标识的关键字：abstract
				格式：
					修饰符 abstract 返回值类型 方法名(参数列表...);
				而一个类中的方法如果是抽象的类，那么，该类就必须定义为抽象类。
	抽象类的特点：
		A:抽象类和抽象方法必须用abstract关键字修饰
		B:抽象类的子类
			a:要么是抽象类
			b:要么重写抽象类中的所有抽象方法
		C:抽象类不一定有抽象方法，有抽象方法的类一定是抽象类
		D:抽象类不能实例化
			那么如何使用抽象类的功能呢?
			按照多态的方式使用。抽象类多态。

	回顾：
		多态前提为什么要有方法重写呢?
			因为父类的方法可能是抽象的。
*/
abstract class Animal {
	//这个方法是有方法体的，只不过内容为空
	//public void eat() {}

	//抽象方法
	public abstract void eat();
}

abstract class Dog extends Animal {
}

class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}
}

class AbstractDemo {
	public static void main(String[] args) {
		//Animal a = new Animal(); //无法实例化

		//Dog d = new Dog();  //无法实例化

		//Cat c = new Cat();

		//多态
		Animal a = new Cat();
		a.eat();
	}
}