package cn.itcast_02;

import java.util.HashSet;

/*
 * HashSet：不保证 set 的迭代顺序，特别是它不保证该顺序恒久不变。
 */
public class HashSetDemo {
	public static void main(String[] args) {
		// HashSet存储字符串元素
		HashSet<String> hs = new HashSet<String>();

		System.out.println(hs.add("hello"));
		System.out.println(hs.add("world"));
		System.out.println(hs.add("java"));
		System.out.println(hs.add("hello"));

		System.out.println("hs:" + hs);
	}
}
