package cn.itcast_03;

import java.util.Arrays;

/*
 * 我有如下一个字符串:”91 27 46 38 50”
 * 请写代码实现最终输出结果是：”27 38 46 50 91”
 * 
 * 分析：
 * 		A:定义一个字符串
 * 		B:按照空格进行分割字符串，得到一个字符串数组
 * 		C:把字符串数组转换为整数数组
 * 		D:对整数数组进行排序
 * 		E:把排序后的整数数组转换成字符串
 */
public class RegexTest {
	public static void main(String[] args) {
		// 定义一个字符串
		String s = "91 27 46 38 50";

		// 按照空格进行分割字符串，得到一个字符串数组
		String[] strArray = s.split(" ");

		// 把字符串数组转换为整数数组
		int[] arr = new int[strArray.length];
		for (int x = 0; x < arr.length; x++) {
			arr[x] = Integer.parseInt(strArray[x]);
		}

		// 对整数数组进行排序
		Arrays.sort(arr);

		// 把排序后的整数数组转换成字符串
		StringBuilder sb = new StringBuilder();
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				sb.append(arr[x]);
			} else {
				sb.append(arr[x]).append(" ");
			}
		}
		String result = sb.toString();
		
		System.out.println(result);
	}
}
