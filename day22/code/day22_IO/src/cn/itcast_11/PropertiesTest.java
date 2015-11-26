package cn.itcast_11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 * 我有一个文本文件user.txt，我知道数据是键值对形式的，但是不知道内容是什么。
 * 请写一个程序判断是否有“lisi”这样的键存在，如果有就改变其值为100
 * 
 * 分析：
 * 		A:把文本文件的数据加载到集合中
 * 		B:遍历集合，获取到每一个键
 * 		C:判断键的值是否有为lisi的
 * 			是：就修改其值为100
 * 			否：不搭理它
 * 		D:把集合中的数据存储到文本文件
 */
public class PropertiesTest {
	public static void main(String[] args) throws IOException {
		// 把文本文件的数据加载到集合中
		Properties prop = new Properties();
		Reader r = new FileReader("user.txt");
		prop.load(r);
		r.close();

		// 遍历集合，获取到每一个键
		Set<String> set = prop.stringPropertyNames();
		for (String key : set) {
			// 判断键的值是否有为lisi的
			if ("lisi".equals(key)) {
				// 就修改其值为100
				prop.setProperty(key, "100");
				break;
			}
		}

		// 把集合中的数据存储到文本文件
		Writer w = new FileWriter("user.txt");
		prop.store(w, null);
		w.close();
	}
}
