//人类
class Person {
	private String name;
	private int age;

	public Person() {}

	public Person(String name,int age) { //"王宝强",18
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
//学生类
class Student extends Person  {
	public Student() {}

	public Student(String name,int age) {	//"王宝强",18
		super(name,age); //"王宝强",18
	}
}

//老师类
class Teacher extends Person {
}

class ExtendsDemo5 {
	public static void main(String[] args) {
		//学生类
		Student s = new Student();
		s.setName("王祖贤");
		s.setAge(27);
		System.out.println(s.getName()+"---"+s.getAge());
		s.eat();
		s.sleep();
		System.out.println("--------------------------");

		Student s2 = new Student("王宝强",18);
		System.out.println(s2.getName()+"---"+s2.getAge());
		s2.eat();
		s2.sleep();
		System.out.println("--------------------------");


		//老师类
		Teacher t = new Teacher();
		t.setName("王祖蓝");
		t.setAge(25);
		System.out.println(t.getName()+"---"+t.getAge());
		t.eat();
		t.sleep();
	}
}
