/*
	猫狗案例
		具体事物：猫，狗
		共性：姓名，年龄，吃饭
*/
abstract class Animal {
	private String name;
	private int age;

	public Animal(){}

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
		
	//抽象方法
	public abstract void eat();
}

//狗的实现
class Dog extends Animal {
	public Dog(){}

	public Dog(String name,int age) {
		super(name,age);
	}

	public void eat() {
		System.out.println("狗吃肉");
	}
}

//练习1：猫的实现：自己练习

class AnimalDemo {
	public static void main(String[] args) {
		//测试狗
		Dog d = new Dog();
		d.setName("大黄");
		d.setAge(3);
		System.out.println(d.getName()+"---"+d.getAge());
		d.eat();
		System.out.println("--------------------------");

		Dog d2 = new Dog("大黄",3);
		System.out.println(d2.getName()+"---"+d2.getAge());
		d2.eat();
		System.out.println("--------------------------");

		//多态测试
		Animal a = new Dog();
		a.setName("大黄");
		a.setAge(3);
		System.out.println(a.getName()+"---"+a.getAge());
		a.eat();
		System.out.println("--------------------------");

		Animal a2 = new Dog("大黄",3);
		System.out.println(a2.getName()+"---"+a2.getAge());
		a2.eat();
		System.out.println("--------------------------");

		//练习2：猫的测试，多态的测试
	}
}