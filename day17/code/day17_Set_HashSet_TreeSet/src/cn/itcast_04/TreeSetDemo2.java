package cn.itcast_04;

import java.util.TreeSet;

/*
 * TreeSet是如何保证元素排序的呢?又是如何保证元素唯一的呢?
 * 
 * 需求：用TreeSet存储自定义对象，并按照要求排序和去掉重复值。
 * a:如果成员变量值都相同，我就认为是重复元素
 * b:请按照年龄的从小到大进行排序
 * 
 * 通过观察的现象，我们大体明白了这样的一个意思：
 * 从第二个元素开始，在添加的时候，会和前面的元素进行比较，走的是compareTo()方法
 * 		如果返回的是正数：大，往后放
 * 		如果返回的是负数：小，往前放
 * 		如果返回的是0：说明重复。不放。
 */
public class TreeSetDemo2 {
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

		// 添加元素
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		ts.add(p5);
		ts.add(p6);
		ts.add(p7);
		ts.add(p8);

		// 遍历集合
		for (Person p : ts) {
			System.out.println(p.getName() + "---" + p.getAge());
		}

	}
}
