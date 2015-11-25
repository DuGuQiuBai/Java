/*
	学生类和老师。定义两个功能(吃饭，睡觉)
*/
//学生类
class Student {
	private String name;
	private int age;

	public Student() {}

	public Student(String name,int age) {
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

	public void eat() {
		System.out.println("吃饭");
	}

	public void sleep() {
		System.out.println("睡觉");
	}
}
//老师类
class Teacher {
	private String name;
	private int age;

	public Teacher() {}

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

	public void eat() {
		System.out.println("吃饭");
	}

	public void sleep() {
		System.out.println("睡觉");
	}
}
//测试类
class Test {
	public static void main(String[] args) {
		//测试学生
		Student s = new Student();
		s.setName("林青霞");
		s.setAge(28);
		System.out.println(s.getName()+"---"+s.getAge());
		s.eat();
		s.sleep();
		System.out.println("-------------------------");

		Student s2 = new Student("张曼玉",18);
		System.out.println(s2.getName()+"---"+s2.getAge());
		s2.eat();
		s2.sleep();
		System.out.println("-------------------------");

		//测试老师
		Teacher t = new Teacher();
		t.setName("风清扬");
		t.setAge(31);
		System.out.println(t.getName()+"---"+t.getAge());
		t.eat();
		t.sleep();
		System.out.println("-------------------------");

		Teacher t2 = new Teacher("令狐冲",21);
		System.out.println(t2.getName()+"---"+t2.getAge());
		t2.eat();
		t2.sleep();
	}
}