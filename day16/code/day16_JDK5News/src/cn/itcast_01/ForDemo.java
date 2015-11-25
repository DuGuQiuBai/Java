package cn.itcast_01;

import java.util.ArrayList;

/*
 * 增强for：是for循环的一种格式。
 * 格式：
 * 		for(元素数据类型 变量名 : 数组名或者Collection集合) {
 * 			直接使用变量名就可以了，这里的变量名其实就是数组或者集合中的元素。
 * 		}
 * 好处：
 * 		简化了数组和Collection集合的遍历。
 * 
 * 注意事项：增强for的目标要判断是否为null
 * 增强for遍历集合，其实是用来替代迭代器。
 * 
 * Collection：迭代器，增强for
 * List及其子类：迭代器，增强for，普通for
 */
public class ForDemo {
	public static void main(String[] args) {
		// int数组
		int[] arr = { 1, 2, 3, 4, 5 };
		// 增强for
		for (int x : arr) {
			System.out.println(x);
		}
		System.out.println("-----------------");

		String[] strArray = { "hello", "world", "java" };
		// 增强for
		for (String str : strArray) {
			System.out.println(str);
		}
		System.out.println("-----------------");

		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		// 增强for
		for (String s : array) {
			System.out.println(s);
		}
		
		//NullPointerException
		// array = null;
		// for (String s : array) {
		// System.out.println(s);
		// }
		
		
		// for (String s : array) {
		// //ConcurrentModificationException
		// array.add("hello");
		// }
	}
}
