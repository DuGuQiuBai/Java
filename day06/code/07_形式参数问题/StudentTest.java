//引用类型作为参数传递，需要传递是对象。(地址值)
//定义学生类，并定义学习功能
class Student {
	public void study() {
		System.out.println("学生爱学习");
	}
}

class StudentDemo {
	//Student是类，类是引用数据类型。
	public void test(Student s) {
		s.study();
	}
}

class StudentTest {
	public static void main(String[] args) {
		//如何调用呢?
		StudentDemo sd = new StudentDemo();
		Student s = new Student();
		sd.test(s);
	}
}