package cn.itcast_02;

import java.util.Enumeration;
import java.util.Vector;

/*
 * 特有功能：
 * 		A:添加元素
 * 			public void addElement(Object obj)		--		add(Object obj)
 * 		B:获取元素
 *			public Object elementAt(int index)		--		get(int index)
 *			public Enumeration elements()			--		Iterator iterator()
 *						hasMoreElements()							hasNext()
 *						nextElement()								next()
 *
 *		JDK版本升级：
 *			A:安全
 *			B:效率
 *			C:简化书写
 */
public class VectorDemo {
	public static void main(String[] args) {
		// 创建集合对象
		// Collection c = new Vector();
		// List list = new Vector();

		Vector v = new Vector();

		// public void addElement(Object obj)
		v.addElement("hello");
		v.addElement("world");
		v.addElement("java");

		// public Object elementAt(int index)
		// System.out.println(v.elementAt(0));
		// System.out.println(v.elementAt(1));
		// System.out.println(v.elementAt(2));
		// 普通for
		// for (int x = 0; x < v.size(); x++) {
		// String s = (String) v.elementAt(x);
		// System.out.println(s);
		// }

		// 类似迭代器的方式
		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
			String s = (String) en.nextElement();
			System.out.println(s);
		}

		System.out.println("v:" + v);
	}
}
