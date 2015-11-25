/*
	老师和学生案例,加入抽烟的额外功能

	Smoking:
		抽烟的功能

	老师：
		成员变量：姓名，年龄
		构造方法：无参，带参
		成员方法：getXxx()/setXxx(),学习，睡觉
	学生：
		成员变量：姓名，年龄
		构造方法：无参，带参
		成员方法：getXxx()/setXxx(),学习，睡觉

	通过老师和学生我们可以分析出人类：
		
	人：
		成员变量：姓名，年龄
		构造方法：无参，带参
		成员方法：getXxx()/setXxx(),学习()，睡觉(){}

	最终的分析：
	人：抽象类
		成员变量：姓名，年龄
		构造方法：无参，带参
		成员方法：getXxx()/setXxx(),学习()，睡觉(){}
			老师
				部分老师抽烟
			学生
				部分学生抽烟
	Smoking:接口
		抽烟的功能
*/
//抽烟接口
interface Smoking {
	public abstract void smoke();
}

//人抽象类
abstract class Person {
	private String name;
	private int age;

	public Person(){}

	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	//睡觉
	public void sleep() {
		System.out.println("睡觉");
	}

	//学习
	public abstract void study();
}

//老师
class Teacher extends Person {
	public Teacher(){}

	public Teacher(String name,int age) {
		super(name,age);
	}

	public void study() {
		System.out.println("老师要学习如何把知识讲明白");
	}
}

//部分抽烟老师
class SmokeTeacher extends Teacher implements Smoking {
	public SmokeTeacher(){}

	public SmokeTeacher(String name,int age) {
		super(name,age);
	}

	public void smoke() {
		System.out.println("爱抽烟的老师");
	}
}

//学生
class Student extends Person {
	public Student(){}

	public Student(String name,int age) {
		super(name,age);
	}

	public void study() {
		System.out.println("学生要好好学习，天天向上");
	}
}

//部分抽烟学生
class SmokeStudent extends Student implements Smoking {
	public SmokeStudent(){}

	public SmokeStudent(String name,int age) {
		super(name,age);
	}

	public void smoke() {
		System.out.println("爱抽烟的学生");
	}
}

//测试类
class PersonDemo {
	public static void main(String[] args) {
		//SmokeTeacher
		SmokeTeacher st = new SmokeTeacher();
		st.setName("毕姥爷");
		st.setAge(35);
		System.out.println(st.getName()+"---"+st.getAge());
		st.sleep();
		st.study();
		st.smoke();
		System.out.println("--------------------------");

		SmokeTeacher st2 = new SmokeTeacher("传智急先锋",30);
		System.out.println(st2.getName()+"---"+st2.getAge());
		st2.sleep();
		st2.study();
		st2.smoke();
	}
}