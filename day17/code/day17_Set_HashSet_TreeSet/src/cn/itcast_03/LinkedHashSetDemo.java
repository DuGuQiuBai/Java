package cn.itcast_03;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet：底层数据结构是哈希表和链表。
 * 哈希表：能够保证元素的唯一性
 * 链表：能够保证元素有序
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> link = new LinkedHashSet<String>();

		link.add("ccc");
		link.add("hello");
		link.add("bbb");
		link.add("world");
		link.add("aaa");
		link.add("java");
		link.add("aaa");
		link.add("java");

		System.out.println("link:" + link);
	}
}
