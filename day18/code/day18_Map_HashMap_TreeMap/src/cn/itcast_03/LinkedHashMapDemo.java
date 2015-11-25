package cn.itcast_03;

import java.util.LinkedHashMap;
import java.util.Set;

/*
 * Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序。
 */
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		// 创建集合对象
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();

		// 添加元素
		map.put("文章", "马伊俐");
		map.put("谢霆锋", "张柏芝");
		map.put("田亮", "叶一茜");
		map.put("汪峰", "章子怡");

		// 遍历
		Set<String> set = map.keySet();
		for (String key : set) {
			String value = map.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
