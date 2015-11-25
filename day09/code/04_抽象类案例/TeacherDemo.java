/*
	老师案例
		具体事物：基础班老师，就业班老师
		共性：姓名，年龄，讲课。
*/
abstract class Teacher {
	private String name;
	private int age;

	public Teacher(){}

	public Teacher(String name,int age) {
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

	//抽象方法
	public abstract void teach();
}

class BasicTeacher extends Teacher {
	public BasicTeacher(){}

	public BasicTeacher(String name,int age) {
		super(name,age);
	}

	public void teach() {
		System.out.println("基础班老师讲解JavaSE");
	}
}

//练习1：就业班老师的代码

class TeacherDemo {
	public static void main(String[] args) {
		//测试基础班老师
		BasicTeacher bt = new BasicTeacher();
		bt.setName("林青霞");
		bt.setAge(28);
		System.out.println(bt.getName()+"---"+bt.getAge());
		bt.teach();
		System.out.println("----------------------------");

		BasicTeacher bt2 = new BasicTeacher("林青霞",28);
		System.out.println(bt2.getName()+"---"+bt2.getAge());
		bt2.teach();
		System.out.println("----------------------------");

		//多态测试
		Teacher t = new BasicTeacher();
		t.setName("林青霞");
		t.setAge(28);
		System.out.println(t.getName()+"---"+t.getAge());
		t.teach();
		System.out.println("----------------------------");

		Teacher t2 = new BasicTeacher("林青霞",28);
		System.out.println(t2.getName()+"---"+t2.getAge());
		t2.teach();
		System.out.println("----------------------------");

		//练习2：就业班老师测试，多态测试
	}
}

//练习3：学生案例
//具体事务：基础班学员，就业班学员
//共性：姓名，年龄，班级，学习，吃饭
//自己分析，自己写代码，自己测试