package cn.itcast_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * HashMap<String,String>
 * 键：学生姓名
 * 值：地址
 * 存储三个元素，然后遍历。
 */
public class HashMapDemo {
	public static void main(String[] args) {
		// 创建集合对象
		HashMap<String, String> hm = new HashMap<String, String>();

		// 创建并添加元素
		hm.put("赵薇", "安徽");
		hm.put("李冰冰", "黑龙江");
		hm.put("范冰冰", "山东");

		// 遍历
		// 方式1
		Set<String> keySet = hm.keySet();
		for (String key : keySet) {
			String value = hm.get(key);
			System.out.println(key + "---" + value);
		}
		System.out.println("---------------------");

		// 方式2
		// Set<Map.Entry<String, String>> entrySet = hm.entrySet();
		// for (Map.Entry<String, String> me : entrySet) {
		// String key = me.getKey();
		// String value = me.getValue();
		// System.out.println(key + "---" + value);
		// }

//		Set<Entry<String, String>> entrySet = hm.entrySet();
//		for (Entry<String, String> me : entrySet) {
//			String key = me.getKey();
//			String value = me.getValue();
//			System.out.println(key + "---" + value);
//		}
	}
}
