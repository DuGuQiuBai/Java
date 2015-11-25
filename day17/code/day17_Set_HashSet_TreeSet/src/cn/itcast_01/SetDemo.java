package cn.itcast_01;

import java.util.HashSet;
import java.util.Set;

/*
 * Collection:
 * 		List:元素有序(存储和取出顺序一致)，可重复
 * 		Set:元素无序,唯一
 */
public class SetDemo {
	public static void main(String[] args) {
		// 创建集合对象
		Set<String> set = new HashSet<String>();

		set.add("hello");
		set.add("aaaa");
		set.add("java");
		set.add("world");
		set.add("bbbb");
		set.add("aaaa");

		for (String s : set) {
			System.out.println(s);
		}
	}
}
