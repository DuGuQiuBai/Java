package cn.itcast_04;


/*
 * LinkedList
 *		请用LinkedList模拟栈数据结构的集合，并测试
 *		题目的意思是：你要自己做一个集合类，这个集合提供添加元素和获取元素的功能，然后测试你的集合类。提供了LinkedList供你使用。
 * 栈：先进后出
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		// 创建集合对象
		// LinkedList link = new LinkedList();
		//
		// // 添加元素
		// link.addFirst("hello");
		// link.addFirst("world");
		// link.addFirst("java");
		//
		// Iterator it = link.iterator();
		// while (it.hasNext()) {
		// String s = (String) it.next();
		// System.out.println(s);
		// }
		
		//创建集合
		MyStack my = new MyStack();
		
		//添加元素
		my.add("hello");
		my.add("world");
		my.add("java");
		
		//获取
		// System.out.println(my.get());
		// System.out.println(my.get());
		// System.out.println(my.get());
		// System.out.println(my.get());
		
		while(!my.isEmpty()){
			System.out.println(my.get());
		}
	}
}
