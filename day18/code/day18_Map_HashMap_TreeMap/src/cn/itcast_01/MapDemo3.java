package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map集合的遍历：(把Map集合习惯看成夫妻对)
 * 		思路：
 * 			A:把丈夫集中起来。获取所有的键。keySet()
 * 			B:遍历丈夫，得到每一个丈夫。增强for
 * 			C:让丈夫去找自己的妻子。V get(key key)
 * 
 * 		对应的描述：
 * 			A:获取Map集合的所有的键的Set集合
 * 			B:遍历键的Set集合，获取到每一个键
 * 			C:根据键到Map集合中找对应的值
 */
public class MapDemo3 {
	public static void main(String[] args) {
		// 创建集合对象
		Map<String, String> map = new HashMap<String, String>();

		// 创建并添加元素
		map.put("文章", "马伊俐");
		map.put("谢霆锋", "张柏芝");
		map.put("田亮", "叶一茜");
		map.put("汪峰", "章子怡");

		// 遍历
		// 获取Map集合的所有的键的Set集合
		Set<String> set = map.keySet();
		// 遍历键的Set集合，获取到每一个键
		for (String key : set) {
			// 根据键到Map集合中找对应的值
			String value = map.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
