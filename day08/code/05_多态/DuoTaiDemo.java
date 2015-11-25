/*
	多态：同一个对象在不同时刻表现出现的不同状态。

	举例：
		A:水(水，冰，水蒸气)

		B:猫和动物。
			把右边的值赋值给左边，如果能读通过，就说明可以。
			动物 d = new 动物();
			动物 dd = new 猫();
			猫 m = new 猫();
			猫 mm = new 动物();  错误

			动物 dd = new 猫();

	代码如何体现呢?
		A:有继承关系	
		B:有方法重写	
		C:有父类引用指向子类对象
*/
class Animal {
	public void eat() {
		System.out.println("动物吃饭");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("狗吃肉");
	}
}

class DuoTaiDemo {
	public static void main(String[] args) {
		//Animal a = new Animal();
		//Dog d = new Dog();

		//多态
		Animal a = new Dog();
	}
}