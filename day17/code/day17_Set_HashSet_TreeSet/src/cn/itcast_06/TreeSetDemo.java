package cn.itcast_06;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * TreeSet是如何保证元素排序的呢?又是如何保证元素唯一的呢?
 * 
 * 需求：用TreeSet存储自定义对象，并按照要求排序和去掉重复值。
 * a:如果成员变量值都相同，我就认为是重复元素
 * b:请按照年龄的从小到大进行排序
 * 
 * 总结：TreeSet保证元素唯一和排序 
 * 唯一性：根据比较的返回值是否是0来判断元素是否是唯一的
 * 排序：两种方式
 * 		A:自然排序	(元素具备比较性)
 * 			让对象所属的类实现Comparable接口
 * 		B:比较器排序 (集合具备比较性)
 * 			创建集合对象的时候，接受Comparator接口的实现类对象。一般我们使用的是匿名内部类实现。
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		// 创建集合对象
		// TreeSet<Person> ts = new TreeSet<Person>();
		// TreeSet(Comparator comparator)
		// 构造一个新的空 TreeSet，它根据指定比较器进行排序。
		TreeSet<Person> ts = new TreeSet<Person>(new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				// this -- p1
				// p -- p2
				int num = p1.getAge() - p2.getAge();
				int num2 = num == 0 ? p1.getName().compareTo(p2.getName())
						: num;
				return num2;
			}
		});

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
