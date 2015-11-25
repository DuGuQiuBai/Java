package cn.itcast_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 需求：
 假设HashMap集合的元素值是ArrayList。有3个。
 每一个ArrayList集合的值是字符串。

 元素我已经完成，请遍历。
 结果：
 三国演义
 吕布
 周瑜
 笑傲江湖
 令狐冲
 林平之
 神雕侠侣
 郭靖
 杨过  
 */
public class HashMapAndArrayListTest {
	public static void main(String[] args) {
		// 创建集合对象
		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

		// 创建元素
		ArrayList<String> sgyy = new ArrayList<String>();
		sgyy.add("吕布");
		sgyy.add("周瑜");

		// 创建元素
		ArrayList<String> xajh = new ArrayList<String>();
		xajh.add("令狐冲");
		xajh.add("林平之");

		// 创建元素
		ArrayList<String> sdxl = new ArrayList<String>();
		sdxl.add("郭靖");
		sdxl.add("杨过");

		// 添加元素
		hm.put("三国演义", sgyy);
		hm.put("笑傲江湖", xajh);
		hm.put("神雕侠侣", sdxl);

		// 遍历集合
		Set<String> hmSet = hm.keySet();
		for (String key : hmSet) {
			System.out.println(key);
			ArrayList<String> value = hm.get(key);
			for (String s : value) {
				System.out.println("\t" + s);
			}
		}
	}
}
