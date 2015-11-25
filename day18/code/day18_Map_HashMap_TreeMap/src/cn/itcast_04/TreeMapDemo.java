package cn.itcast_04;

import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap<String,String>
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		// 创建集合对象
		TreeMap<String, String> tm = new TreeMap<String, String>();

		// 添加元素
		tm.put("zhangsan", "北京");
		tm.put("lisi", "天津");
		tm.put("wangwu", "上海");
		tm.put("zhaoliu", "重庆");
		tm.put("tianqi", "西安");
		tm.put("lisi", "武汉");

		// 遍历
		Set<String> set = tm.keySet();
		for (String key : set) {
			String value = tm.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
