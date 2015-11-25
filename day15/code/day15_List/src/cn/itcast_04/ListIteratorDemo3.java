package cn.itcast_04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * 需求：我有一个集合，里面有三个元素"hello","world","java",请写程序实现如下操作
 * 	         判断这个集合中有没有元素为world的，如果有，就添加一个元素Android。
 * 
 * 分析：
 * 		A:创建一个集合，并添加多个元素
 * 		B:遍历集合，获取到每一个元素
 * 		C:判断元素有没有是"world"的，如果有，就往集合中添加一个新元素android
 * 		D:直接输出集合名称
 * 
 * ConcurrentModificationException:并发修改异常。
 * 
 * 原因：
 * 		迭代器是依赖于集合而存在的，我们用迭代器遍历集合的时候，如果有满足条件的，
 * 		我们就通过集合调用add()功能添加了一个元素，也就是说这个时候，集合发生了改变，
 * 		而迭代器并没有发生改变，这样就产生了这个问题。
 * 		这个问题的主要原因：通过迭代器去遍历集合的时候，不能在通过集合去操作。
 * 
 * 解决方案：
 * 		A:不是用迭代器遍历，用普通for循环遍历
 * 			元素添加到了集合的末尾。
 * 		B:使用列表迭代器，遍历使用迭代器，添加也使用迭代器
 * 			遍历到哪里，元素就添加到哪里
 */
public class ListIteratorDemo3 {
	public static void main(String[] args) {
		// 创建一个集合，并添加多个元素
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");

		// 遍历集合，获取到每一个元素
		// Iterator it = list.iterator();
		// while (it.hasNext()) {
		// String s = (String) it.next();
		// // 判断元素有没有是"world"的，如果有，就往集合中添加一个新元素android
		// if ("world".equals(s)) {
		// list.add("android");
		// // it = list.iterator();
		// }
		// }

		// 普通for
		// for (int x = 0; x < list.size(); x++) {
		// String s = (String) list.get(x);
		// if ("world".equals(s)) {
		// list.add("android");
		// }
		// }

		// 使用列表迭代器
		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {
			String s = (String) lit.next();
			if ("world".equals(s)) {
				lit.add("android");
			}
		}

		// 直接输出集合名称
		System.out.println("list:" + list);
	}
}
