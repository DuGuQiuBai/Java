package cn.itcast_03;

import java.util.LinkedList;

/*
 * LinkedList的特有功能：
 * 		A:添加功能
 * 			void addFirst()
 * 			void addLast()
 * 		B:移除功能
 * 			Object removeFirst()
 * 			Object removeLast()
 * 		C:获取功能
 * 			Object getFirst()
 * 			Object getLast()
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		// 创建集合对象
		LinkedList link = new LinkedList();

		// 添加元素
		link.add("hello");
		link.add("world");
		link.add("java");

		// void addFirst()
		// void addLast()
		// link.addFirst("android");
		// link.addLast("javaee");

		// Object removeFirst()
		// Object removeLast()
		// System.out.println("removeFirst:" + link.removeFirst());
		// System.out.println("removeLast:" + link.removeLast());

		// Object getFirst()
		// Object getLast()
		System.out.println("getFirst:" + link.getFirst());
		System.out.println("getLast:" + link.getLast());

		System.out.println("link:" + link);
	}
}
