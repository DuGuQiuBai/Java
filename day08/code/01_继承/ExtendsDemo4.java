/*
	继承中的构造方法关系：
		子类中所有的构造方法默认都会访问父类中空参数的构造方法

		为什么呢?
			因为子类会继承父类中的数据，可能还会使用父类的数据。
			所以，子类初始化之前，一定要先完成父类数据的初始化。


	那么，我可不可以访问父亲的带参构造方法呢?
		可以。通过super(...)

	注意事项：
		A:每一个构造方法的第一条语句默认都是：super()
		B:super(...)这样的形式在构造方法中只能出现一次。
		C:如果父类没有无参构造方法，那么，我们只能
			a:通过super去访问父类的带参构造方法。
			b:通过this去访问本类的其他构造方法。
*/
class Fu {
	/*
	public Fu() {
		System.out.println("Fu()");
	}
	*/

	public Fu(String name) {
		System.out.println("hello");
	}
}

class Zi extends Fu {
	public Zi() {
		//super();
		//super("aaa");
		//this("aaa");
		System.out.println("zi()");
	}

	public Zi(String name) {
		//super();
		//super(name);
		//this();
		System.out.println("world");
	}
}

class ExtendsDemo4 {
	public static void main(String[] args) {
		//创建子类对象
		Zi z = new Zi();
		System.out.println("-------------");
		Zi z2 = new Zi("java");
	}
}
