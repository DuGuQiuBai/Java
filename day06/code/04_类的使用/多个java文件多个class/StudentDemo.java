//测试类
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