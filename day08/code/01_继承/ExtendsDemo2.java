/*
	java中的继承注意事项：
		A:子类只能继承父类所有非私有的成员(成员方法和成员变量)
		B:子类不能继承父类的构造方法，但是可以通过super(后面讲)关键字去访问父类构造方法。
		C:不要为了部分功能而去继承
			class A {
				public void show(){}
				public void show2(){}
			}

			class B extends A {
				//public void show(){}
				public void show3(){}
			}

	那么，我们什么时候考虑使用继承呢?
		继承中类之间体现的是：”is a”的关系。
		如果两个类满足这个关系：xxx is a yyy，那么他们就可以使用继承。
		举例：类A和类B，如果类A is a 类B或者类B is a 类A 能念通过，就可以考虑使用继承。
		      否则不可以。

		Student,Person
		Dog,Animal
		Dog,Pig
*/
class Fu {
	private int num = 100;
	public int num2 = 200;

	private void show() {
		System.out.println("show");
	}

	public void show2() {
		System.out.println("show2");
	}
}

class Zi extends Fu {
}

class ExtendsDemo2 {
	public static void main(String[] args) {
		//创建子类对象
		Zi z = new Zi();
		//System.out.println(z.num);
		System.out.println(z.num2);
		//z.show();
		z.show2();

		//看Fu行不行
		//Fu f = new Fu();
		//System.out.println(f.num);
		//System.out.println(f.num2);
	}
}