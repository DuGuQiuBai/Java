/*
	第一步：分析事物
		学生事物：
			属性：学号，姓名，年龄
			行为：学习，吃饭，睡觉

	第二步：把事物转换为类
		学生类：
			成员变量：学号，姓名，年龄
			成员方法：学习，吃饭，睡觉

	第三步：把类用英文体现
		Student:
			成员变量：sid，name，age
			成员方法：study()，eat()，sleep()

	第四步：写代码体现
		成员变量：其实就是一个变量，只不过定义在类中方法外，并且也可以不给初始化值。
		成员方法：其实就是一个方法，只不过不需要static了。

	练习：
		手机
*/
//这是我的学生类
class Student {
	//成员变量
	//学号
	String sid;
	//姓名
	String name;
	//年龄
	int age;

	//成员方法
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