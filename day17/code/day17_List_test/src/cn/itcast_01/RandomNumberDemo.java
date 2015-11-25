package cn.itcast_01;

import java.util.ArrayList;

/*
 * 需求：获取10个1-20之间的随机数，要求不能重复
 * 
 * 分析：
 * 		A:定义一个集合，用于存储产生的随机数
 * 		B:定义一个统计变量，初始值是0
 * 		C:判断统计变量是否小于10
 * 			是：
 * 				产生一个随机，然后判断是在集合中
 * 					是：不添加
 * 					否：添加到集合
 * 			否：结束
 * 		D:遍历集合
 */
public class RandomNumberDemo {
	public static void main(String[] args) {
		// 定义一个集合，用于存储产生的随机数
		ArrayList<Integer> array = new ArrayList<Integer>();

		// 定义一个统计变量，初始值是0
		int count = 0;

		// 判断统计遍历是否小于10
		while (count < 10) {
			// 产生一个随机，然后判断是在集合中
			int randomNumber = (int) (Math.random() * 20) + 1;

			if (!array.contains(randomNumber)) {
				array.add(randomNumber);
				count++;
			}
		}

		// 遍历集合
		for (Integer i : array) {
			System.out.println(i);
		}
	}
}
