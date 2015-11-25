package cn.itcast_02;

/*
 * public boolean equals(Object obj):比较对象是否相等
 * 
 * 我们发现这个结果和我们想的不太一样，那么，这是为什么呢?
 * 这个时候，我们要想知道为什么，就必须去看源码。
 * Object类中的equals()方法的实现。
 * 看到源码是这个样子的：
 * 		 public boolean equals(Object obj) {
 *			return (this == obj);  //(s1 == s2);
 *		 }
 * 
 * 
 * 面试题：
 * 		==和equals()的区别?
 * 		==:
 * 			基本类型：比较的是基本类型的值是否相同
 * 			引用类型：比较的是引用类型的地址值是否相同
 *		equals():
 *			引用类型。默认情况下，比较的是引用类型的地址是否相同。
 *
 * 一般来说，比较地址的意义不大，所以我们会重写该方法。
 * 如果重写呢?
 * 		我们重写的基本思想就是让对象比较成员变量的值是否相同。
 * 		实际开发中，我们都是自动生成。
 * 
 * 字符串的比较：
 * 		字符串本身也是一个类，是引用类型。
 * 		他们的比较用的是equals()方法，字符串类重写了该方法，比较的是字符串的内容是否相同。
 * 
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student("林青霞", 28);
		Student s2 = new Student("林青霞", 28);
		Student s3 = new Student("林青霞", 29);

		// System.out.println(s1 == s1);
		// System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s1));
		
		Demo d =  new Demo();
		System.out.println(s1.equals(d)); //ClassCastException
	}
}

class Demo{}
