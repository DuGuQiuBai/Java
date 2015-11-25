package cn.itcast_02;

import java.util.ArrayList;
import java.util.List;

/*
 * List集合的特有功能：
 * 		void add(int index,Object obj):在指定索引位置添加元素
 *		Object remove(int index):删除指定索引位置的元素，并把删除掉的元素值返回
 *		Object get(int index):根据给定索引，返回元素
 *		Object set(int index,E element):修改指定索引处的元素为给定的元素，并返回被修改的值
 */
public class ListDemo {
	public static void main(String[] args) {
		// 创建集合
		// Collection c = new ArrayList();
		List list = new ArrayList();

		// 测试功能
		list.add("hello");
		list.add("world");
		list.add("java");

		// void add(int index,Object obj):在指定索引位置添加元素
		// list.add(1, "android");
		// list.add(3, "android");
		// list.add(4, "android"); //有问题

		// Object remove(int index):删除指定索引位置的元素，并把删除掉的元素值返回
		// System.out.println("remove:" + list.remove(1));

		// Object get(int index):根据给定索引，返回元素
		// System.out.println("get:" + list.get(1));

		// Object set(int index,E element):修改指定索引处的元素为给定的元素，并返回被修改的值
		System.out.println("set:" + list.set(1, "android"));

		System.out.println("list:" + list);
	}
}
