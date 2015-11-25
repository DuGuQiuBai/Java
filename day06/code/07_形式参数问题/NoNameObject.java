/*
	匿名对象：没有名字的对象。

	使用场景：
		A:调用方法,该方法仅仅被使用一次的时候适用。
		B:作为实际参数传递
*/

//定义学生类，写一个love方法
class Student  {
	public void love() {
		System.out.println("学生喜欢放假");
	}
}

class StudentDemo {
	public void test(Student s) {
		s.love();
	}
}

//测试类
class NoNameObject {
	public static void main(String[] args) {
		/*
		//创建对象
		Student s = new Student();
		s.love();
		s.love();

		//匿名对象
		new Student().love();
		new Student().love();
		*/

		//有名字的情况
		//StudentDemo sd = new StudentDemo();
		//Student s = new Student();
		//sd.test(s);

		//没有名字的情况
		//StudentDemo sd = new StudentDemo();
		//sd.test(new Student());

		//不妨在来一步
		new StudentDemo().test(new Student());
	}
}