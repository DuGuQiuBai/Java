package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * 用ArrayList存储自定义对象，并按照年龄进行排序
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		// 创建集合对象
		ArrayList<Person> array = new ArrayList<Person>();

		// 创建元素对象(蒋干盗书)
		Person p1 = new Person("曹操", 35);// 后知后觉
		Person p2 = new Person("蒋干", 33);// 不知不觉
		Person p3 = new Person("诸葛亮", 34); // 先知先觉

		// 添加元素
		array.add(p1);
		array.add(p2);
		array.add(p3);

		// 排序
		// Collections.sort(array);
		Collections.sort(array, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p2.getAge() - p1.getAge();
			}

		});

		// 遍历集合
		for (Person p : array) {
			System.out.println(p.getName() + "---" + p.getAge());
		}
	}
}
