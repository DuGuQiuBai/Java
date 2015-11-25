package cn.itcast_03;

/*
 * 查找元素：
 * 		基本查找  数组元素无序
 *		二分查找  数组元素有序(折半查找)
 */
public class ArrayDemo {
	public static void main(String[] args) {
		// int[] arr = { 24, 69, 80, 57, 13 };
		// 需求：我要查找80在这个数组中的索引

		// 新的数组
		int[] arr = { 13, 24, 57, 69, 80 };
		// 需求：我要查找80在这个数组中的索引
		int index = getIndex(arr, 57);
		System.out.println(index);

		index = getIndex(arr, 88);
		System.out.println(index);

	}

	public static int getIndex(int[] arr, int value) {
		int minIndex = 0;
		int maxIndex = arr.length - 1;
		int middleIndex = (minIndex + maxIndex) / 2;

		while (value != arr[middleIndex]) {
			if (value > arr[middleIndex]) {
				minIndex = middleIndex + 1;
			} else if (value < arr[middleIndex]) {
				maxIndex = middleIndex - 1;
			}

			// 加一个判断
			if (maxIndex < minIndex) {
				return -1;
			}

			// 重写计算中间索引值
			middleIndex = (minIndex + maxIndex) / 2;
		}

		return middleIndex;
	}

	// 普通查找
	// public static int getIndex(int[] arr, int value) {
	// int index = -1;
	//
	// for (int x = 0; x < arr.length; x++) {
	// if (arr[x] == value) {
	// index = x;
	// break;
	// }
	// }
	//
	// return index;
	// }
}
