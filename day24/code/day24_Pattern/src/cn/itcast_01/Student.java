package cn.itcast_01;

public class Student {
	// 构造私有
	private Student() {
	}

	// 本身创建
	// 静态只能访问静态,加static
	// 为了不让外加访问，加private
	private static Student s = new Student();

	// 提供公共访问
	// 为了让外界可以直接访问，加static
	public static Student getStudent() {
		return s;
	}
}
