/*
	static的注意事项：
		A:在静态方法中是没有this关键字的
			因为静态是随着类的加载而加载，优先于对象而存在。而this是随着对象的创建而存在。
			先进内存的， 不能访问后进内存的；而后进内存的，可以访问先进内存的。
		B:静态只能访问静态。
			非静态的成员方法：
				可以访问静态成员变量，非静态成员变量，静态成员方法，非静态成员方法
			静态的成员方法：
				只能访问静态的成员变量，静态的成员方法
*/
/*
class Student {
	private String name;

	public static void setName(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println(name);
	}
}*/

class Demo {
	int x = 10;
	static int y = 20;

	public void show() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void show2() {
		//System.out.println(x);
		System.out.println(y);
	}

	public void show3() {
		show();
		show2();
	}

	public static void show4() {
		//show();
		show2();
	}
}

class StudentDemo3 {
	public static void main(String[] args) {
		//Student.setName("林青霞");
	}
}
