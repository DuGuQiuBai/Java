package cn.itcast_05;

import java.util.TreeSet;

/*
 * TreeSet是如何保证元素排序的呢?又是如何保证元素唯一的呢?
 * 
 * 需求：用TreeSet存储自定义对象，并按照要求排序和去掉重复值。
 * a:如果成员变量值都相同，我就认为是重复元素
 * b:请按照姓名的长度进行排序。
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		// 创建集合对象
		TreeSet<Person> ts = new TreeSet<Person>();

		// 创建人对象
		Person p1 = new Person("tangseng", 30);
		Person p2 = new Person("jiapingwa", 25);
		Person p3 = new Person("zhangyimou", 25);
		Person p4 = new Person("xijinping", 26);
		Person p5 = new Person("yanni", 27);
		Person p6 = new Person("wenzhang", 30);
		Person p7 = new Person("tianliang", 28);
		Person p8 = new Person("xijinping", 26);
		Person p9 = new Person("tianliang", 24);

		// 添加元素
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		ts.add(p5);
		ts.add(p6);
		ts.add(p7);
		ts.add(p8);
		ts.add(p9);

		// 遍历集合
		for (Person p : ts) {
			System.out.println(p.getName() + "---" + p.getAge());
		}

	}
}
