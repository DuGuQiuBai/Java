/*
	接口概述：现在在动物园里面，有些猫可以钻火圈，狗跳高，做计算等东西。
			  而这些动作，并不是动物天生就就具备的，所以，不适合定义在动物类中。
			  并且，也不是所有的猫，或者狗具备这些功能，所以直接定义在猫或者狗类中也不合适。
			  针对这样的一种扩展功能，java就提供了接口来体现。

	接口的特点：
		A:接口用关键字interface表示
			格式：interface 接口名 {}
		B:类实现接口用implements表示
			格式：class 类名 implements 接口名 {}
		C:接口不能实例化
			接口多态。
		D:接口的子类
			a:要么是抽象类
			b:要么重写接口中的所有的抽象方法
*/
interface Animal {
	public abstract void show();
}

abstract class Dog implements Animal {
}

class Cat implements Animal {
	public void show() {}
}

class InterfaceDemo {
	public static void main(String[] args) {
	
	}
}