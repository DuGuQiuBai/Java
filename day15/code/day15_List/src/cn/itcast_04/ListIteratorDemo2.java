package cn.itcast_04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * ListIterator listIterator()
 * 虽然有逆向遍历功能这样的特有功能，但是没什么意义，因为，它需要先正向遍历，才能逆向遍历。
 */
public class ListIteratorDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 测试功能
		list.add("hello");
		list.add("world");
		list.add("java");

		// 正向遍历
		ListIterator lit = list.listIterator();
		// while (lit.hasNext()) {
		// String s = (String) lit.next();
		// System.out.println(s);
		// }
		System.out.println("---------------");

		// 逆向遍历
		while (lit.hasPrevious()) {
			String s = (String) lit.previous();
			System.out.println(s);
		}
	}
}
