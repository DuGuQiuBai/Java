package cn.itcast_05;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * "dabcdababcabcea",获取字符串中每一个字母出现的次数要求结果:a(5)b(4)c(3)d(2)e(1)
 * 
 * 作业：自己断点一次
 */
public class TreeMapTest {
	public static void main(String[] args) {
		// 键盘任意录入一个字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();

		// 定义一个Map集合，键是Character，值是Integer，并且是TreeMap
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

		// 把字符串转成字符数组
		char[] chs = s.toCharArray();

		// 遍历字符串，得到每一个字符
		for (char ch : chs) {
			// 拿这个字符作为键到map里面找值
			Integer i = tm.get(ch);
			// 返回null
			if (i == null) {
				// 存储
				tm.put(ch, 1);
			} else {
				// 把值++，重新存储
				i++;
				tm.put(ch, i);
			}
		}

		// 定义一个StringBuilder字符串
		StringBuilder sb = new StringBuilder();

		// 遍历TreeMap集合
		Set<Character> set = tm.keySet();
		for (Character key : set) {
			Integer value = tm.get(key);
			sb.append(key).append("(").append(value).append(")");
		}

		// 把StringBuilder转换为字符串
		String result = sb.toString();

		System.out.println(result);
	}
}
