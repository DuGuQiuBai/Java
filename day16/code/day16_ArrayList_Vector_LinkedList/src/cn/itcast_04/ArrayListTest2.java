package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 去除集合中字符串的重复值(字符串的内容相同)
 * 举例：
 * 		hello,world,java,android,world,java,javaee,java,java,java,android
 * 结果：
 * 		hello,world,java,android,javaee
 * 
 * 和数组排序的选择排序思想一样。
 */
public class ArrayListTest2 {
	public static void main(String[] args) {
		// 定义集合，存储带重复的元素
		ArrayList array = new ArrayList();
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("android");
		array.add("world");
		array.add("java");
		array.add("javaee");
		array.add("java");
		array.add("java");
		array.add("java");
		array.add("android");

		for (int x = 0; x < array.size() - 1; x++) {
			for (int y = x + 1; y < array.size(); y++) {
				if (array.get(y).equals(array.get(x))) {
					array.remove(y);
					y--; // 把元素删除后，还要和当前位置的比较一次
				}
			}
		}

		// 遍历集合
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}
