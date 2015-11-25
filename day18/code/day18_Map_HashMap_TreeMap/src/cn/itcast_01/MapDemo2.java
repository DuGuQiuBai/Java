package cn.itcast_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * V get(Object key)
 * Set<K> keySet()
 * Collection<V> values()
 */
public class MapDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		Map<String, String> map = new HashMap<String, String>();

		// 创建并添加元素
		map.put("文章", "马伊俐");
		map.put("谢霆锋", "张柏芝");
		map.put("田亮", "叶一茜");
		map.put("汪峰", "章子怡");

		// V get(Object key)
		System.out.println("get:" + map.get("文章"));
		System.out.println("get:" + map.get("田亮"));
		System.out.println("---------------------");

		// Set<K> keySet()
		Set<String> set = map.keySet();
		for (String key : set) {
			System.out.println(key);
		}
		System.out.println("---------------------");

		// Collection<V> values()
		Collection<String> cons = map.values();
		for (String value : cons) {
			System.out.println(value);
		}
	}
}
