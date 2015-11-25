package cn.itcast_02;

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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	// @Override
	// public boolean equals(Object obj) { // Object obj = s2;
	// // return true;
	// // obj -- s2
	// // this -- s1
	// // Student s = (Student) obj;
	// // if (this.name.equals(s.name) && this.age == s.age) {
	// // return true;
	// // } else {
	// // return false;
	// // }
	//
	// // 因为自己和自己比，是没有必要进行转换的，所以，为了提高程序的效率，我们加入一个判断
	// if (this == obj) {
	// return true;
	// }
	//
	// // 为了让程序更健壮一些，加入一个判断
	// // 这个判断其实是在判断某个对象是否是某个类的对象
	// // 用到了一个判断符号：instanceof
	// // 格式：对象名 instanceof 类名
	// if (!(obj instanceof Student)) {
	// return false;
	// }
	//
	// // if语句的第二种格式可以使用三元运算符替换
	// Student s = (Student) obj;
	// // System.out.println("AAAAAA");
	// return this.name.equals(s.name) && this.age == s.age;
	// }
	
	
}