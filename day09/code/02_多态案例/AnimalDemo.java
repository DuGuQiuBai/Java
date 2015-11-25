//猫狗案例
class Animal {
	private String name;
	private int age;

	public Animal() {}

	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void show() {
		System.out.println("name:"+name+",age:"+age);
	}

	public void sleep() {
		System.out.println("sleep");
	}

	public void eat() {
		System.out.println("eat");
	}
}

class Dog extends Animal {
	public Dog() {}

	public Dog(String name,int age) {
		super(name,age);
	}

	public void eat() {
		System.out.println("dog eat");
	}

	public void sleep() {
		System.out.println("dog sleep");
	}
}

class Cat extends Animal {
	public Cat() {}

	public Cat(String name,int age) {
		super(name,age);
	}

	public void eat() {
		System.out.println("cat eat");
	}

	public void sleep() {
		System.out.println("cat sleep");
	}
}

class AnimalDemo {
	public static void main(String[] args) {
		//测试Animal
		Animal a = new Animal();
		a.setName("动物");
		a.setAge(10);
		a.eat();
		a.sleep();
		a.show();
		System.out.println("------------");

		Animal a2 = new Animal("动物",10);
		a2.eat();
		a2.sleep();
		a2.show();
		System.out.println("------------");

		//测试Dog
		Dog d = new Dog();
		d.setName("大黄");
		d.setAge(5);
		d.eat();
		d.sleep();
		d.show();
		System.out.println("------------");

		Dog d2 = new Dog("大黄",5);
		d2.eat();
		d2.sleep();
		d2.show();
		System.out.println("------------");

		//练习1：测试Cat你们自己练习
		Cat c = new Cat();
		c.setName("大花猫");
		c.setAge(2);
		c.eat();
		c.sleep();
		c.show();
		System.out.println("------------");

		Cat c2 = new Cat("大花猫",2);
		c2.eat();
		c2.sleep();
		c2.show();
		System.out.println("------------");

		//通过Dog测试多态
		Animal aa = new Dog();
		aa.setName("小黄");
		aa.setAge(3);
		aa.eat();
		aa.sleep();
		aa.show();
		System.out.println("------------");

		Animal aa2 = new Dog("小黄",3);
		aa2.eat();
		aa2.sleep();
		aa2.show();
		System.out.println("------------");

		//练习2：通过Cat测试多态你们自己练习
		Animal aa3 = new Cat("小花猫",1);
		aa3.eat();
		aa3.sleep();
		aa3.show();
		System.out.println("------------");

		Animal aa4 = new Cat();
		aa4.setName("小花猫");
		aa4.setAge(1);
		aa4.eat();
		aa4.sleep();
		aa4.show();
	}
}