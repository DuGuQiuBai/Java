/*
	学生案例
		具体事务：基础班学员，就业班学员
		共性：姓名，年龄，班级，学习，吃饭
*/
abstract class Student {
	private String name;
	private int age;
	private String classId;

	public Student() {}

	public Student(String name,int age,String classId) {
		this.name = name;
		this.age = age;
		this.classId = classId;
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

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getClassId() {
		return classId;
	}

	//吃饭
	public void eat() {
		System.out.println("学生都要吃饭");
	}

	//学习
	public abstract void study();
}

class BasicStudent extends Student { 
	public BasicStudent() {}

	public BasicStudent(String name,int age,String classId) {
		super(name,age,classId);
	}

	public void study() {
		System.out.println("基础班学生学习JavaSE");
	}
}

class JobStudent extends Student { 
	public JobStudent() {}

	public JobStudent(String name,int age,String classId) {
		super(name,age,classId);
	}

	public void study() {
		System.out.println("就业班学生学习JavaEE+Android");
	}
}

class StudentDemo {
	public static void main(String[] args) {
		//基础班
		BasicStudent bs = new BasicStudent();
		bs.setName("彪哥");
		bs.setAge(22);
		bs.setClassId("itcast007");
		System.out.println(bs.getName()+"---"+bs.getAge()+"---"+bs.getClassId());
		bs.eat();
		bs.study();
		System.out.println("--------------------------------------------------");

		BasicStudent bs2 = new BasicStudent("大个子",28,"itcast250");
		System.out.println(bs2.getName()+"---"+bs2.getAge()+"---"+bs2.getClassId());
		bs2.eat();
		bs2.study();
		System.out.println("--------------------------------------------------");

		//多态使用
		Student s = new BasicStudent();
		s.setName("张方");
		s.setAge(23);
		s.setClassId("itcast123");
		System.out.println(s.getName()+"---"+s.getAge()+"---"+s.getClassId());
		s.eat();
		s.study();
		System.out.println("--------------------------------------------------");

		Student s2 = new BasicStudent("xiao冬",23,"itcast008");
		System.out.println(s2.getName()+"---"+s2.getAge()+"---"+s2.getClassId());
		s2.eat();
		s2.study();
	}
}