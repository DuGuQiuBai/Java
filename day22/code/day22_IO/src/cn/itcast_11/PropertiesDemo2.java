package cn.itcast_11;

import java.util.Properties;
import java.util.Set;

/*
 * Properties的特有功能：
 * A:添加功能
 * 		public Object setProperty(String key,String value)
 * B:获取功能
 * 		public String getProperty(String key)
 * 		public String getProperty(String key,String defaultValue)
 * 		public Set<String> stringPropertyNames()
 */
public class PropertiesDemo2 {
	public static void main(String[] args) {
		// 创建集合
		Properties prop = new Properties();

		// 添加数据
		prop.setProperty("it001", "javase");
		prop.setProperty("it003", "android");
		prop.setProperty("it002", "javaee");

		// 获取数据
		// // public String getProperty(String key)
		// System.out.println(prop.getProperty("it001"));
		// System.out.println(prop.getProperty("it007"));
		// // public String getProperty(String key,String defaultValue)
		// System.out.println(prop.getProperty("it007", "周星驰"));

		// public Set<String> stringPropertyNames()
		Set<String> set = prop.stringPropertyNames();
		for (String key : set) {
			String value = prop.getProperty(key);
			System.out.println(key + "---" + value);
		}
	}
}

/*
 * class Properties extends Hashtable<K,V> { private Hashtable<K,V> ht;
 * 
 * public Properties() { ht = new Hashtable<K,V>(); }
 * 
 * public Object setProperty(String key,String value) { return
 * ht.put(key,value); } }
 */