package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 去除集合中自定义对象的重复值(对象的成员变量值都相同)
 * Student:name,age
 * 通过简单的分析，我们知道，应该是在判断哪里出现了问题。
 * 所以，我们应该来看看是如何进行判断的。
 * 要想知道是如何判断的，就必须看判断的方法的源码
 * 通过查看源码，我们知道集合的contains()方法底层源码依赖的是元素对象的equals()方法
 * 而默认情况下，元素所属的类继承了Object类的equals()方法，比较的是地址值。
 * 所以，我们想要比较对象的成员变量值相同，就必须重写equals()方法。
 */
public class ArrayListTest3 {
	public static void main(String[] args) {
		// 创建集合对象
		ArrayList array = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("林青霞", 28);
		Student s2 = new Student("王祖贤", 27);
		Student s3 = new Student("杨幂", 27);
		Student s4 = new Student("李若彤", 25);
		Student s5 = new Student("张惠妹", 40);
		Student s6 = new Student("赵雅芝", 60);
		Student s7 = new Student("林青霞", 20);
		Student s8 = new Student("林青霞", 28);

		// 把学生对象添加到集合中
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		array.add(s6);
		array.add(s7);
		array.add(s8);

		// 创建新集合
		ArrayList newArrayList = new ArrayList();

		// 遍历旧集合，获取到旧集合中的每一个元素
		for (int x = 0; x < array.size(); x++) {
			Student s = (Student) array.get(x);
			// 那旧集合的每一个元素到新集合中去找，看有没有
			if (!newArrayList.contains(s)) {
				// 木有：就添加
				newArrayList.add(s);
			}
		}

		// 遍历新集合
		Iterator it = newArrayList.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
