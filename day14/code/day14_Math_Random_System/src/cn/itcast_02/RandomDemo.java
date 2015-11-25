package cn.itcast_02;

import java.util.Random;

/*
 * Random:产生随机数的类
 * 
 * 构造方法：
 * 		public Random()：有默认种子，并且和返回最准确的可用系统计时器的当前值，以毫微秒为单位做了异或。
 *		public Random(long seed)：指定种子
 *
 * 成员方法：
 * 		public int nextInt()：int范围内的数据
 *		public int nextInt(int n)：[0,n)的数据
 *
 * 面试题：
 * 		构造方法给不给种子的区别?
 * 			如果种子不同，随机数不同。
 * 			如果种子相同，随机数相同。
 */
public class RandomDemo {
	public static void main(String[] args) {
		// 创建对象
		// Random r = new Random();
		Random r = new Random(17);

		for (int x = 0; x < 10; x++) {
			// System.out.println(r.nextInt());
			System.out.println(r.nextInt(100));
		}
	}
}
