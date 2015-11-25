/*
	继承间的成员方法关系：
		不同名称：非常简单，一看就知道调用谁
		相同名称：
			先在子类找
			再在父类找
			...
			找不到就报错。
*/
class Fu {
	public void show() {
		System.out.println("show fu");
	}
}

class Zi extends Fu{
	public void method() {
		System.out.println("method zi");
	}

	public void show() {
		System.out.println("show zi");
	}
}

class ExtendsDemo6 {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();
		z.method();
		//z.haha();
	}
}
