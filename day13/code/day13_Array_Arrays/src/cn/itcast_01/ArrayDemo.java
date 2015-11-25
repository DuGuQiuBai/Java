package cn.itcast_01;

/*
 * 冒泡排序：
 */
public class ArrayDemo {
	public static void main(String[] args) {
		// 定义数组
		int[] arr = { 24, 69, 80, 57, 13 };

		/*
		 * // 第一次比较 // 减1是为了防止越界 for (int x = 0; x < arr.length - 1 - 0; x++) {
		 * if (arr[x] > arr[x + 1]) { int temp = arr[x]; arr[x] = arr[x + 1];
		 * arr[x + 1] = temp; } } // 遍历数组 System.out.println("第一次排序后：");
		 * printArray(arr);
		 * 
		 * // 第二次比较 // 减1是为了防止越界 for (int x = 0; x < arr.length - 1 - 1; x++) {
		 * if (arr[x] > arr[x + 1]) { int temp = arr[x]; arr[x] = arr[x + 1];
		 * arr[x + 1] = temp; } } // 遍历数组 System.out.println("第二次排序后：");
		 * printArray(arr);
		 * 
		 * // 第三次比较 // 减1是为了防止越界 for (int x = 0; x < arr.length - 1 - 2; x++) {
		 * if (arr[x] > arr[x + 1]) { int temp = arr[x]; arr[x] = arr[x + 1];
		 * arr[x + 1] = temp; } } // 遍历数组 System.out.println("第三次排序后：");
		 * printArray(arr);
		 * 
		 * // 第四次比较 // 减1是为了防止越界 for (int x = 0; x < arr.length - 1 - 3; x++) {
		 * if (arr[x] > arr[x + 1]) { int temp = arr[x]; arr[x] = arr[x + 1];
		 * arr[x + 1] = temp; } } // 遍历数组 System.out.println("第四次排序后：");
		 * printArray(arr);
		 */

		// for (int y = 0; y < arr.length - 1; y++) {
		// // ? 0,1,2,3
		// for (int x = 0; x < arr.length - 1 - y; x++) {
		// if (arr[x] > arr[x + 1]) {
		// int temp = arr[x];
		// arr[x] = arr[x + 1];
		// arr[x + 1] = temp;
		// }
		// }
		// }

		// 冒泡排序
		bubbleSort(arr);
		// 遍历数组
		printArray(arr);
	}

	// 遍历数组
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				System.out.print(arr[x]);
			} else {
				System.out.print(arr[x] + ", ");
			}
		}
		System.out.println("]");
	}

	// 排序
	public static void bubbleSort(int[] arr) {
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = 0; y < arr.length - 1 - x; y++) {
				if (arr[y] > arr[y + 1]) {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				}
			}
		}
	}
}
