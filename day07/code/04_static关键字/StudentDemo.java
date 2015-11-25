/*
	班级编号应该是被班级每个人都共享的，所以定义一个就应该可以了。
	而姓名和年龄，每个人应该是不一样的，所以，每个对象，都应该定义自己的。

	在java中，用什么来表示成员变量是被共享的呢? static
*/
class Student {
	//姓名
	String name;
	//年龄
	int age;
	//班级编号
	//String classNumber;
	static String classNumber;

	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public Student(String name,int age,String classNumber) {
		this.name = name;
		this.age = age;
		this.classNumber = classNumber;
	}

	public void show() {
		System.out.println(name+"---"+age+"---"+classNumber);
	}
}

class StudentDemo {
	public static void main(String[] args) {
		//创建学生对象
		Student s1 = new Student("林青霞",28,"20150306");
		s1.show();

		/*
		Student s2 = new Student("马云",35,"20150306");
		s2.show();

		Student s3 = new Student("马化腾",33,"20150306");
		s3.show();
		*/
		Student s2 = new Student("马云",35);
		s2.show();

		Student s3 = new Student("马化腾",33);
		s3.show();
	}
}