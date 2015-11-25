package cn.itcast_02;

import java.util.ArrayList;
import java.util.List;

/*
 * List集合的特有遍历：普通for循环
 * size()方法和get()方法结合使用
 */
public class ListDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 测试功能
		list.add("hello");
		list.add("world");
		list.add("java");

		// get(int index)
		// System.out.println(list.get(0));
		// System.out.println(list.get(1));
		// System.out.println(list.get(2));
		// System.out.println(list.get(3)); // IndexOutOfBoundsException

		for (int x = 0; x < list.size(); x++) {
			// System.out.println(list.get(x));
			String s = (String) list.get(x);
			System.out.println(s);
		}
	}
}
