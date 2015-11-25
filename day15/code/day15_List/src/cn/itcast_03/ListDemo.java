package cn.itcast_03;

import java.util.ArrayList;
import java.util.List;

/*
 * 练习：用List集合存储自定义并遍历。
 * Student:name,age
 * 遍历使用普通for循环
 */
public class ListDemo {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("王昭君", 18);
		Student s2 = new Student("西施", 19);
		Student s3 = new Student("杨玉环", 20);
		Student s4 = new Student("貂蝉", 17);

		// 把元素添加到集合
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		// 遍历
		for (int x = 0; x < list.size(); x++) {
			Student s = (Student) list.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
