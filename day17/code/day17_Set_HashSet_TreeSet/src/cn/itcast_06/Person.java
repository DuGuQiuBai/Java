package cn.itcast_06;

public class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
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
	public int compareTo(Person p) {
		// 主要条件
		// 姓名的长度进行排序
		int num = this.name.length() - p.name.length();
		// 次要条件
		// 长度一样，不代表内容一样，所以，还要继续比内容
		int num2 = num == 0 ? this.name.compareTo(p.name) : num;
		// 长度一样，内容一样，还应该比较年龄
		int num3 = num2 == 0 ? this.age - p.age : num2;
		return num3;
	}
}
