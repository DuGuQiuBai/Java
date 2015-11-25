package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 模拟斗地主洗牌和发牌
 * 
 * 扑克牌：54
 * 小王
 * 大王
 * 黑桃A,黑桃2,黑桃3,黑桃4,黑桃...,黑桃10,黑桃J,黑桃Q,黑桃K
 * 红桃...
 * 梅花...
 * 方块...
 * 
 * 分析：
 * 		A:造一个牌盒(集合)
 * 		B:造每一张牌，然后存储到牌盒里面去
 * 		C:洗牌
 * 		D:发牌
 * 		E:看牌
 */
public class PokerDemo {
	public static void main(String[] args) {
		// 造一个牌盒(集合)
		ArrayList<String> array = new ArrayList<String>();

		// 造每一张牌，然后存储到牌盒里面去
		// 定义花色数组
		String[] colors = { "♠", "♥", "♣", "♦" };
		// 定义点数数组
		String[] numbers = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K" };
		for (String color : colors) {
			for (String number : numbers) {
				array.add(color.concat(number));
			}
		}
		array.add("小王");
		array.add("大王");

		// 看牌
		// System.out.println(array);

		// 洗牌
		Collections.shuffle(array);

		// 发牌
		// 三个选手
		ArrayList<String> linQingXia = new ArrayList<String>();
		ArrayList<String> fengQingYang = new ArrayList<String>();
		ArrayList<String> liuYi = new ArrayList<String>();
		// 底牌
		ArrayList<String> diPai = new ArrayList<String>();

		for (int x = 0; x < array.size(); x++) {
			if (x >= array.size() - 3) {
				diPai.add(array.get(x));
			} else if (x % 3 == 0) {
				linQingXia.add(array.get(x));
			} else if (x % 3 == 1) {
				fengQingYang.add(array.get(x));
			} else if (x % 3 == 2) {
				liuYi.add(array.get(x));
			}
		}

		// 看牌
		lookPoker("林青霞", linQingXia);
		lookPoker("风清扬", fengQingYang);
		lookPoker("刘意", liuYi);
		lookPoker("底牌", diPai);

	}

	// 写一个功能实现遍历
	public static void lookPoker(String name, ArrayList<String> array) {
		System.out.print(name + "的牌是：");
		for (String s : array) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
}
