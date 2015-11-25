/*
	定义学生类：姓名，年龄

	由于我们创建了对象，所以我们可以通过对象去使用类中的成员。
	而现在的情况是，我们不想对象直接去使用类的成员变量。
	肿么办呢?
	java针对这种情况，就提供了一个关键字：private。

	private:
		A:是一个权限修饰符。
		B:可以修饰成员(成员变量和成员方法)
		C:被private修饰的成员只在本类中才能访问。

*/
//定义学生类
class Student {
	String name;
	private int age;

	//因为年龄出现了负数，不符合现实情况
	//所以，我们要对年龄做出判断
	//而要做判断，就应该写判断语句
	//而写语句就应该在方法中
	public void checkAge(int a) {
		if(a<0 || a>100) {
			System.out.println("年龄有误");
		}else {
			age = a;
		}
	}

	public int getAge() {
		return age;
	}
}

//测试类
class StudentDemo {
	public static void main(String[] args) {
		//创建学生对象
		Student s = new Student();

		//给name和age赋值
		s.name = "林青霞";
		//s.age = 28;
		//s.age = -28;
		//通过方法赋值
		s.checkAge(-28);
		//s.age = -28;

		//输出
		//System.out.println(s.name+"***"+s.age);
		System.out.println(s.name);
		System.out.println(s.getAge());
	}
}