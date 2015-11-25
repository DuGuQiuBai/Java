package cn.itcast_05;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap嵌套HashMap
 * 
 * 西安校区：
 * 	jc	基础班
 * 			风清扬	31
 * 			沙诗博	18
 * 	jy	就业班
 * 			急先锋	30
 * 			玉麒麟	29
 * 	dsj	大数据
 * 			焦宁波	30
 * 			张瑜		22
 */
public class HashMapTest {
	public static void main(String[] args) {
		// 创建集合对象
		HashMap<String, HashMap<String, Integer>> xaxq = new HashMap<String, HashMap<String, Integer>>();

		// 基础班数据
		HashMap<String, Integer> jc = new HashMap<String, Integer>();
		jc.put("风清扬", 31);
		jc.put("沙诗博", 18);
		// 把数据添加到集合
		xaxq.put("基础班", jc);

		// 就业班数据
		HashMap<String, Integer> jy = new HashMap<String, Integer>();
		jy.put("急先锋", 30);
		jy.put("玉麒麟", 29);
		// 把数据添加到集合
		xaxq.put("就业班", jy);

		// 大数据班
		HashMap<String, Integer> dsj = new HashMap<String, Integer>();
		dsj.put("焦宁波", 30);
		dsj.put("张瑜", 22);
		// 把数据添加到集合
		xaxq.put("大数据班", dsj);

		// 遍历xaxq
		Set<String> xaxqSet = xaxq.keySet();
		for (String xaxqKey : xaxqSet) {
			System.out.println(xaxqKey);
			HashMap<String, Integer> xaxqValue = xaxq.get(xaxqKey);
			Set<String> xaxqValueSet = xaxqValue.keySet();
			for (String xaxqValuekey : xaxqValueSet) {
				Integer xaxqValueValue = xaxqValue.get(xaxqValuekey);
				System.out
						.println("\t" + xaxqValuekey + "---" + xaxqValueValue);
			}
		}
	}
}
