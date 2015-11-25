package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 我们如何在定义集合的时候，去明确集合的元素类型呢?
 * 这个时候，从JDK5以后，就提供了一个新的技术：泛型
 * 泛型：把明确数据类型的工作推迟到了创建对象或者调用方法的时候去做的。
 * 格式：
 * 		<> 数据类型。
 * 我们在哪些地方使用泛型呢?
 * 		一般就是在集合中常见。查看API，如果类，抽象类，接口后面跟的有<?>就说明要用泛型。
 * 
 * 泛型的好处：
 * 		A:提高了程序的安全性
 * 		B:将运行期遇到的问题转移到了编译期
 * 		C:省去了类型强转的麻烦
 * 
 * 练习：
 * 		用ArrayList存储自定义对象，并遍历。加入泛型。
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		// 存储字符串并遍历
		ArrayList<String> array = new ArrayList<String>();

		// 添加集合
		array.add("hello");
		array.add("world");
		array.add("java");
		// array.add(100);

		// 遍历
		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			// String s = (String) it.next();
			String s = it.next();
			System.out.println(s);
		}
		System.out.println("-----------------");

		for (int x = 0; x < array.size(); x++) {
			String s = array.get(x);
			System.out.println(s);
		}
	}
}
