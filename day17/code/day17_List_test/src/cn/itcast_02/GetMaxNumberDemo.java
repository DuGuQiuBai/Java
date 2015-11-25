package cn.itcast_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
 * 
 * 分析：
 * 		A:定义集合，用于存储多个数据
 * 		B:循环键盘录入数据，用while(true){}
 * 		C:判断键盘录入的数据是否是0
 * 			是：break
 * 			否：添加到集合
 * 		D:把集合转成数组
 * 		E:对数组进行排序(升序)
 * 		F:获取数组中的最后一个元素即可
 * 		
 */
public class GetMaxNumberDemo {
	public static void main(String[] args) {
		// 定义集合，用于存储多个数据
		ArrayList<Integer> array = new ArrayList<Integer>();

		// 循环键盘录入数据，用while(true){}
		Scanner sc = new Scanner(System.in);
		while (true) {
			int number = sc.nextInt();

			// 判断键盘录入的数据是否是0
			if (number == 0) {
				break;
			} else {
				array.add(number);
			}
		}

		// 把集合转成数组
		// <T> T[] toArray(T[] a)
		Integer[] i = new Integer[array.size()];
		Integer[] iArray = array.toArray(i);

		// 对数组进行排序(升序)
		Arrays.sort(iArray);

		// 获取数组中的最后一个元素即可
		System.out.println("最大值是：" + iArray[iArray.length - 1]);
	}
}
