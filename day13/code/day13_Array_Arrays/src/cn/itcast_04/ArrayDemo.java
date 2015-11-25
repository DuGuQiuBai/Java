package cn.itcast_04;

/*
 * 把字符串中的字符进行排序。
 *举例：”dacgebf”
 *结果：”abcdefg”
 */
public class ArrayDemo {
	public static void main(String[] args) {
		// 定义字符串
		String s = "dacgebf";

		// 把字符串转成字符数组
		char[] chs = s.toCharArray();

		// 对字符数组进行排序
		bubbleSort(chs);

		// 把排序后的字符数组转成字符串
		String result = String.valueOf(chs);

		System.out.println(result);
	}

	public static void bubbleSort(char[] chs) {
		for (int x = 0; x < chs.length - 1; x++) {
			for (int y = 0; y < chs.length - 1 - x; y++) {
				if (chs[y] > chs[y + 1]) {
					char temp = chs[y];
					chs[y] = chs[y + 1];
					chs[y + 1] = temp;
				}
			}
		}
	}
}
