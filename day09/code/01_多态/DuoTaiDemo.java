/*
	多态的好处：
		A:提高了程序的维护性(由继承保证)
		B:提高了程序的扩展性(由多态保证)

	多态的弊端：
		不能访问子类特有的功能。
*/
class Animal {
	public void eat(){}
	public void sport(){}

	/*
	public void sleep() {
		System.out.println("爱睡觉");
	}
	*/
}

class Dog extends Animal {
	public void eat(){
		System.out.println("狗吃肉");
	}

	public void sport(){
		System.out.println("狗跑步");
	}

	public void lookDoor() {
		System.out.println("看门");
	}
}

class Cat extends Animal {
	public void eat(){
		System.out.println("猫吃鱼");
	}

	public void sport(){
		System.out.println("猫和老鼠捉迷藏");
	}
}

class Pig extends Animal {
	public void eat(){
		System.out.println("猪吃饲料");
	}

	public void sport(){
		System.out.println("猪爱睡觉");
	}
}

class DuoTaiDemo {
	public static void main(String[] args) {
		/*
		//我喜欢狗，养了一只狗
		Dog d = new Dog();
		d.eat();
		d.sport();

		//我很喜欢狗，又养了一只狗
		Dog d2 = new Dog();
		d2.eat();
		d2.sport();

		//我特别喜欢狗，又养了一只狗
		Dog d3 = new Dog();
		d3.eat();
		d3.sport();
		*/

		//我...
		//我要养很多只狗，而且，每个狗对象都要调用一些方法，或者还要做一些操作。
		//并且这些操作是一样的。仅仅是狗对象不一样。
		//如果一直写下去，代码会变得非常麻烦
		//所以，我们要考虑对这个代码进行优化
		//如何优化呢?因为发现操作是一样的，就是对象不一样
		//所以，我们就准备使用方法改进，把对象作为参数传递过来即可。
		//有了方法后，我们就可以如下调用
		Dog d = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();

		//printDog(d);
		//printDog(d2);
		//printDog(d3);
		printAnimal(d);
		printAnimal(d2);
		printAnimal(d3);
		System.out.println("-----------");

		//我喜欢猫，很喜欢猫，特别喜欢猫
		//...
		//写一个方法实现吧
		//调用
		Cat c = new Cat();
		Cat c2 = new Cat();
		Cat c3 = new Cat();

		//printCat(c);
		//printCat(c2);
		//printCat(c3);
		printAnimal(c);
		printAnimal(c2);
		printAnimal(c3);
		System.out.println("-----------");

		//我后来养了一只猪，请问我要写成一样的代码，该如何实现呢?
		//A:先创建猪类继承自动物类
		//B:在测试类里面写方法实现
		//C:在测试类中创建对象，调用方法即可
		Pig p = new Pig();
		Pig p2 = new Pig();
		Pig p3 = new Pig();

		//printPig(p);
		//printPig(p2);
		//printPig(p3);
		printAnimal(p);
		printAnimal(p2);
		printAnimal(p3);

		//我还喜欢狼，要养狼
		//步骤会跟刚才一样,我们自己也是可以完成的
		//我还喜欢猴子，...
		//我们来分析一下：
		//我们重新定义一个新的类是没有任何问题的，我们继续在测试类中的main方法中调用也是没有问题的
		//我们不应该去在测试类中添加新的功能
		//以后，我们再写一个程序的时候，有一个基本的设计原则：对扩展开放，对修改关闭。
		//但是，我们现在如果要完成这个程序，还就得去修改测试类
		//为了不去修改测试类中除了main方法以外的内容
		//我们需要对下面的几个方法进行一个分析：
	}

	/*
	public static void printDog(Dog d) {
		d.eat();
		//...
		d.sport();
	}

	public static void printCat(Cat c) {
		c.eat();
		//...
		c.sport();
	}

	public static void printPig(Pig p) {
		p.eat();
		//...
		p.sport();
	}
	*/

	public static void printAnimal(Animal a) {  //Animal a = new Dog(); a = new Cat(); a = new Pig();
		a.eat();
		//...
		//a.lookDoor();
		a.sport();
	}
}