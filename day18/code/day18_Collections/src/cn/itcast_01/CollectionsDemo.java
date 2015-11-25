package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Collections：是针对集合进行操作的工具类。里面包含了排序和查找等方法。
 * 面试题?
 * 		Collections和Collection的区别?
 * 		Collections:是针对集合进行操作的工具类，包含了排序和查找等功能。
 * 		Collection:是单列集合的顶层接口，定义了单列集合的共性功能。
 * 
 * 掌握的功能：
 * 		public static <T> void sort(List<T> list):排序
 *		public static <T> int binarySearch(List<?> list,T key):二分查找
 *		public static <T> T max(Collection<?> coll):最大值
 *		public static void reverse(List<?> list):反转
 *		public static void shuffle(List<?> list):随机置换
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		// 创建集合对象
		ArrayList<Integer> array = new ArrayList<Integer>();

		// 添加元素
		array.add(30);
		array.add(20);
		array.add(50);
		array.add(10);
		array.add(40);

		System.out.println("array:" + array);

		// public static <T> void sort(List<T> list):排序
		// Collections.sort(array);
		// System.out.println("array:" + array);
		// [10, 20, 30, 40, 50]

		// public static <T> int binarySearch(List<?> list,T key):二分查找
		// int index = Collections.binarySearch(array, 30);
		// System.out.println(index);

		// public static <T> T max(Collection<?> coll):最大值
		// Integer max = Collections.max(array);
		// System.out.println(max);

		// public static void reverse(List<?> list):反转
		// Collections.reverse(array);
		// System.out.println("array:" + array);

		// public static void shuffle(List<?> list):随机置换
		Collections.shuffle(array);
		System.out.println("array:" + array);
	}
}
