package cn.itcast_04;

import java.util.TreeSet;

/*
 * TreeSet:底层数据结构是二叉树。
 * 可以让元素排序，有两种方案，分别是：自然排序，以及Comparator(比较器)进行排序,具体使用哪种情况看你使用的构造方法。
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		// 20,18,23,22,17,24,19,18,24
		// 构造一个新的空 set，该 set 根据其元素的自然顺序进行排序。
		TreeSet<Integer> ts = new TreeSet<Integer>();

		// 存储元素
		ts.add(20);
		ts.add(18);
		ts.add(23);
		ts.add(22);
		ts.add(17);
		ts.add(24);
		ts.add(19);
		ts.add(18);
		ts.add(24);

		// 遍历集合
		for (Integer i : ts) {
			System.out.println(i);
		}
	}
}
