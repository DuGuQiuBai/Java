package cn.itcast_02;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap<Integer,String>
 * 键：Integer	学号
 * 值：String		姓名
 */
public class HashMapDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// 创建并添加元素
		// Integer i1 = 1;
		// String s1 = "张三";
		// hm.put(i1, s1);

		hm.put(1, "张三");
		hm.put(2, "李四");
		hm.put(3, "王武");

		// 遍历
		Set<Integer> set = hm.keySet();
		for (Integer key : set) {
			String value = hm.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
