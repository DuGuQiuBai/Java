package cn.itcast_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 需求：
 假设ArrayList集合的元素是HashMap。有3个。
 每一个HashMap集合的键和值都是字符串。

 元素我已经完成，请遍历。
 结果：
 周瑜---小乔
 吕布---貂蝉

 郭靖---黄蓉
 杨过---小龙女

 令狐冲---任盈盈
 林平之---岳灵珊
 */
public class ArrayListAndHashMapTest {
	public static void main(String[] args) {
		// 创建集合
		ArrayList<HashMap<String, String>> array = new ArrayList<HashMap<String, String>>();

		// 创建元素
		HashMap<String, String> sgyy = new HashMap<String, String>();
		sgyy.put("周瑜", "小乔");
		sgyy.put("吕布", "貂蝉");

		// 创建元素
		HashMap<String, String> sdxl = new HashMap<String, String>();
		sdxl.put("郭靖", "黄蓉");
		sdxl.put("杨过", "小龙女");

		// 创建元素
		HashMap<String, String> xajh = new HashMap<String, String>();
		xajh.put("令狐冲", "任盈盈");
		xajh.put("林平之", "岳灵珊");

		// 把元素添加到集合
		array.add(sgyy);
		array.add(sdxl);
		array.add(xajh);

		// 遍历集合
		for (HashMap<String, String> hm : array) {
			Set<String> set = hm.keySet();
			for (String key : set) {
				String value = hm.get(key);
				System.out.println(key + "---" + value);
			}
		}
	}
}
