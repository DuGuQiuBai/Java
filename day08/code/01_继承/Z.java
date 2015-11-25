/*
	基础知识：
		A:引用类型作为成员变量
			class Demo {
				int x = 10; //基本类型成员变量
				Student s = new Student(); //引用类型成员变量
			}
		B:一个类的初始化过程
			成员变量
				默认
				显示
				构造
		C:如果有继承关系，类的初始化过程执行的是分层初始化。
			先初始化父，再初始化子。

			super仅仅表示父先初始化，在初始化的时候，按照分层初始化执行。

	问题：
		super不会多次执行。
*/
class X {
	Y b = new Y();
	X() {
		System.out.print("X");
	}
}

class Y {
	Y() {
		System.out.print("Y");
	}
}

public class Z extends X {
	Y y = new Y();
	Z() {
		//super();//默认，供系统底层检查调用，而不具体执行class Z的构造方法
		System.out.print("Z");
	}

	public static void main(String[] args) {
		new Z(); 
	}
}