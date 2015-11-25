package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * List:
 * 		ArrayList:
 * 			底层数据结构是数组，查询快，增删慢
 * 			线程不安全，效率高
 * 		Vector:
 * 			底层数据结构是数组，查询快，增删慢
 * 			线程安全，效率低
 * 		LinkedList:
 * 			底层数据结构是链表，查询慢，增删快
 * 			线程不安全，效率高
 * 
 * 面试题：ArrayList，Vector和LinkedList的各自特点?
 * 
 * 思考题：ArrayList，Vector和LinkedList我们到底使用谁呢?
 * 			看情况
 * 			
 * 			要安全吗?
 * 				要：Vector(这个现在也不常用，在Collections里面有新的方式)
 * 				不要：ArrayList和LinkedList
 * 					查询多：ArrayList
 * 					增删多：LinkedList
 * 
 * 		不知道用哪个，就用ArrayList。
 * 
 * 需求：用ArrayList存储字符串并遍历
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList array = new ArrayList();

		array.add("hello");
		array.add("world");
		array.add("java");

		// 迭代器
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		System.out.println("--------------");

		// 普通for
		for (int x = 0; x < array.size(); x++) {
			String s = (String) array.get(x);
			System.out.println(s);
		}

	}
}
