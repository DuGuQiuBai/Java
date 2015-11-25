package cn.itcast_01;

//public class Student extends Object:这种继承是默认存在的
public class Student {
	private String name;
	private int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
//	@Override
//	public String toString() {
//		return name+"---"+age;
//	}
	
	

	// @Override
	// public int hashCode() {
	// return 1000;
	// }

}