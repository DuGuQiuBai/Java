/*
	猫：
		成员变量：姓名，年龄
		构造方法：无参，带参
		成员方法：getXxx()/setXxx()，show()，catchMouse()
	狗：
		成员变量：姓名，年龄
		构造方法：无参，带参
		成员方法：getXxx()/setXxx()，show()，lookDoor()
	测试类：
		main(String[] args):
*/
//猫类
class Cat {
	private String name;
	private int age;

	public Cat() {}

	public Cat(String name,int age) {
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
		System.out.println(name+"---"+age);
	}

	public void catchMouse() {
		System.out.println("猫捉老鼠");
	}
}
//狗类
class Dog {
	private String name;
	private int age;

	public Dog() {}

	public Dog(String name,int age) {
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
		System.out.println(name+"---"+age);
	}

	public void lookDoor() {
		System.out.println("狗可以看门");
	}
}
//测试类
class Test {
	public static void main(String[] args) {
		//猫类测试
		Cat c = new Cat();
		c.setName("加菲猫");
		c.setAge(3);
		c.show();
		c.catchMouse();
		System.out.println("------------");
		Cat cc = new Cat("tom猫",6);
		cc.show();
		cc.catchMouse();
		System.out.println("------------");

		//练习1：自己写出狗的测试
		Dog d = new Dog();
		d.setName("啸天");
		d.setAge(5);
		d.show();
		d.lookDoor();
		System.out.println("------------");

		Dog dd = new Dog("旺财",8);
		dd.show();
		dd.lookDoor();
	}
}

//练习2：请把猫狗案例改为继承的版本，自己分析，自己测试。等会讲