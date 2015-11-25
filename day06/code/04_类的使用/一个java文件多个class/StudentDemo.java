/*
	一个.java文件中可以有多个类吗?
		可以。
	
	如果类用public修饰后，它应该修饰哪个类呢?
		修饰带main方法的。并且一个类中只应该有一个类被public修饰
		目前不写public修饰的。
	
	如何在测试类中使用一个类呢?
		创建对象使用类的成员
	如何创建对象呢?
		格式：
			类名 对象名 = new 类名();
	如何使用类的成员呢?
		成员变量：对象.变量名;
		成员方法：对象.方法名(...);

	注意：
		引用类型的默认值是null。
*/
class Student {
	//学号
	String sid;
	//姓名
	String name;
	//年龄
	int age;

	//学习的方法
	//学习的方法
	public void study() {
		System.out.println("学生爱学习");
	}

	//吃饭的方法
	public void eat() {
		System.out.println("学生要吃饭");
	}

	//睡觉的方法
	public void sleep() {
		System.out.println("学生想睡觉");
	}
}

class StudentDemo {
	public static void main(String[] args) {
		//创建学生对象
		Student s = new Student();

		//输出对象名
		System.out.println(s); //Student@1afb7ac7

		//输出成员变量
		System.out.println("学号是："+s.sid); //null
		System.out.println("姓名是："+s.name);//null
		System.out.println("年龄是："+s.age); //0
		System.out.println("--------------");

		//给成员变量赋值
		s.sid = "itcast001";
		s.name = "林青霞";
		s.age = 28;

		//再次输出成员变量
		System.out.println("学号是："+s.sid); //itcast001
		System.out.println("姓名是："+s.name);//林青霞
		System.out.println("年龄是："+s.age); //28
		System.out.println("--------------");

		//使用成员方法
		s.study();
		s.eat();
		s.sleep();
	}
}