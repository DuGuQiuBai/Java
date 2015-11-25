package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 问题：
 * 		1:有黄色警告线，太难看。
 * 		2:其实黄色警告线就是告诉你，该集合隐含了一个问题
 * 		3:如果你看到别人往集合中添加了基本类型的元素，其实这里隐含了自动装箱，添加的也是一个对象
 * 
 * 接下来，我们就要解决黄色警告线问题，其实就是解决集合的安全问题?
 * 如何解决呢?
 * 		我们可以参照数组来解决。
 * 		String[] strArray = new String[3];
 *		strArray[0] = "hello";
 *		strArray[1] = "world";
 * 		strArray[2] = 100;
 * 		在定义数组的时候，我就明确了数组中元素的类型，这样以后在添加的时候，就不会出现任何问题。
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		// 存储字符串并遍历
		ArrayList array = new ArrayList();

		array.add("hello");
		array.add("world");
		array.add("java");
		// array.add(new Integer(100));
		// array.add(100); // 自动装箱

		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
			// Object obj = it.next();
			// // if (obj instanceof String) {
			// // String s = (String) obj;
			// // System.out.println(s);
			// // } else if (obj instanceof Integer) {
			// // Integer i = (Integer) obj;
			// // System.out.println(i);
			// // }
			// System.out.println(obj);
		}

//		String[] strArray = new String[3];
//		strArray[0] = "hello";
//		strArray[1] = "world";
//		strArray[2] = 100;
	}
}
