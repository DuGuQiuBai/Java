package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;

public class IteratorDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();

		// 创建元素并添加元素
		c.add("hello");
		c.add("world");
		c.add("java");

		// 遍历
		// Iterator it = c.iterator();
		// while (it.hasNext()) {
		// String s = (String) it.next();
		// System.out.println(s);
		// }

		// for循环改进
		// for (Iterator it = c.iterator(); it.hasNext();) {
		// String s = (String) it.next();
		// System.out.println(s);
		// }
	}
}
