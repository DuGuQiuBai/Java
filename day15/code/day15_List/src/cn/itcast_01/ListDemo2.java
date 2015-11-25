package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 练习：用List集合存储自定义并遍历。
 * Student:name,age
 */
public class ListDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("潘金莲", 18);
		Student s2 = new Student("孙二娘", 19);
		Student s3 = new Student("扈三娘", 20);
		Student s4 = new Student("李师师", 21);

		// 把元素添加到集合
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		// 遍历集合
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
