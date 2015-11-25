package cn.itcast_04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * ListIterator listIterator()
 * 通过查看API，我们知道列表迭代器继承自迭代器，所以，它就具有hasNext()方法和next()方法
 */
public class ListIteratorDemo {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 测试功能
		list.add("hello");
		list.add("world");
		list.add("java");

		// 使用方法
		// ListIterator listIterator()
		ListIterator lit = list.listIterator(); // 多态
		while (lit.hasNext()) {
			String s = (String) lit.next();
			System.out.println(s);
		}
	}
}
