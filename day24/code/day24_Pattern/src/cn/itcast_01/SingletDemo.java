package cn.itcast_01;

/*
 * 设计模式：经验的总结。是一套模型。
 * 
 * 分类：
 *		创建型模式
 *		行为型模式
 *		结构型模式
 *
 * 单例模式：保证类在内存中只有一个对象。
 * 举例：
 * 		windows打印机，网站计数器
 * 
 * 如何能够保证类在内存中只有一个对象呢?
 * 		A:让外界不能创建对象
 * 			构造私有
 * 		B:本身提供一个对象
 * 			在成员位置创建对象
 * 		C:对外提供公共的访问方式
 * 			写一个公共方法即可
 */
public class SingletDemo {
	public static void main(String[] args) {
		// Student s1 = new Student();
		// Student s2 = new Student();
		// System.out.println(s1 == s2);

		// Student.s = null;

		Student s1 = Student.getStudent();
		Student s2 = Student.getStudent();
		System.out.println(s1 == s2);
	}
}
