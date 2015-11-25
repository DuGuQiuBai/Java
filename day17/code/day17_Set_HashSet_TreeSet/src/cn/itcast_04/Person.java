package cn.itcast_04;

/*
 * 如果我们想对象进行自然排序，我们就应该让对象所属的类实现自然排序接口Comparable
 */
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
		// 做这种题目的难点是自己要明确比较的次要条件
		// 主要条件：按照年龄比较
		// 次要条件：当年龄相同，比较姓名，这是要自己能够分析出来的

		// this
		// p
		// 升序
		int num = this.age - p.age;
		// 倒序
		// int num = p.age - this.age;

		int num2 = (num == 0) ? (this.name.compareTo(p.name)) : num;

		return num2;
	}
}
