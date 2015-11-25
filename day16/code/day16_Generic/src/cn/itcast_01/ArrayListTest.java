package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 用ArrayList存储自定义对象并遍历。要求加入泛型
 */
public class ArrayListTest {
	public static void main(String[] args) {
		// 创建集合对象
		ArrayList<Student> array = new ArrayList<Student>();
		// JDK7泛型新特性，菱形泛型，泛型推断
		// ArrayList<Student> array = new ArrayList<>();

		// 创建元素
		Student s1 = new Student("马苏", 18);
		Student s2 = new Student("佟丽娅", 20);
		Student s3 = new Student("王大锤", 19);
		Student s4 = new Student("罗三炮", 21);

		// 添加元素
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);

		// 遍历
		Iterator<Student> it = array.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
		System.out.println("------------------");

		for (int x = 0; x < array.size(); x++) {
			Student s = array.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
