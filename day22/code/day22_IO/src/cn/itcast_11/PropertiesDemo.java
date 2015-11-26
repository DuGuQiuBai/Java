package cn.itcast_11;

import java.util.Properties;
import java.util.Set;

/*
 * Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。 
 * 
 * Properties作为Map集合的使用
 */
public class PropertiesDemo {
	public static void main(String[] args) {
		// 创建集合对象
		Properties prop = new Properties();

		// 添加数据
		prop.put(1, "java");
		prop.put(2, "c#");
		prop.put(3, "php");

		// 遍历集合
		Set<Object> set = prop.keySet();
		for (Object key : set) {
			Object value = prop.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
