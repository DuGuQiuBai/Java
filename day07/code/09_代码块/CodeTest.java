/*
	执行过程：静态代码库 --> 构造代码块 --> 构造方法 --> 局部代码块

	静态代码块：只执行一次。
	构造代码库：每次创建对象都执行。
*/
class Student {
	static {
		System.out.println("AAAAA");
	}

	{
		System.out.println("BBBBB");
	}

	public Student() {
		{
			System.out.println("CCCCC");
		}
	}

	static {
		System.out.println("DDDDD");
	}

	{
		System.out.println("EEEEE");
	}
}
class CodeTest {
	public static void main(String[] args) {
		Student s = new Student();
		Student ss = new Student();
	}
}