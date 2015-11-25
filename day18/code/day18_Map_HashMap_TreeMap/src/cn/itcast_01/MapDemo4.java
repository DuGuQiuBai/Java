package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map集合的遍历：(把Map集合习惯看成夫妻对)
 * 		既然是夫妻对，那么就应该有结婚证。
 * 		而结婚证证上应该有丈夫和妻子的名字。
 * 		所以，我们可以把结婚证做成这样的一个类，结婚证类，这个类有两个成员变量，一个是丈夫，一个是妻子。
 * 		class 结婚证 <丈夫,妻子>{
 * 			private 丈夫 zf;
 * 			private 妻子 qz;
 * 
 * 			//构造方法和setXxx()...省略了
 * 
 * 			public 丈夫 getZf() {
 * 				return zf;
 * 			}
 * 
 * 			public 妻子 getQz() {
 * 				return qz;
 * 			}
 * 		}
 * 
 * 		思路：
 * 			A:获取所有的结婚证对象的Set集合。
 * 			B:遍历结婚证对象的Set集合，得到每一个结婚证对象。
 * 			C:对着结婚证，念丈夫和妻子的名字。
 * 
 * 		对应的描述：
 * 			A:获取所有的键值对对象的Set集合。	Set<键值对对象>	--Set<结婚证 <丈夫,妻子>>--Set<Map.Entry<K,V>> entrySet()
 * 			B:遍历键值对对象的Set集合，得到每一个键值对对象。Map.Entry<K,V>
 * 			C:根据键值对对象去获取键和值。getKey(),getValue()
 */
public class MapDemo4 {
	public static void main(String[] args) {
		// 创建集合对象
		Map<String, String> map = new HashMap<String, String>();

		// 创建并添加元素
		map.put("文章", "马伊俐");
		map.put("谢霆锋", "张柏芝");
		map.put("田亮", "叶一茜");
		map.put("汪峰", "章子怡");

		// 遍历
		// 获取所有的键值对对象的Set集合。
		Set<Map.Entry<String, String>> set = map.entrySet();
		// 遍历键值对对象的Set集合，得到每一个键值对对象。
		for (Map.Entry<String, String> me : set) {
			// 根据键值对对象去获取键和值。getKey(),getValue()
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key + "---" + value);
		}
	}
}
