package cn.itcast_02;

/*
 * 选择排序：
 */
public class ArrayDemo {
	public static void main(String[] args) {
		// 定义数组
		int[] arr = { 24, 69, 80, 57, 13 };

		/*
		 * // 第一次 int x = 0; for (int y = x + 1; y < arr.length; y++) { if
		 * (arr[y] < arr[x]) { int temp = arr[x]; arr[x] = arr[y]; arr[y] =
		 * temp; } } System.out.println("第一次比较："); // 遍历数组 printArray(arr);
		 * 
		 * // 第二次 x = 1; for (int y = x + 1; y < arr.length; y++) { if (arr[y] <
		 * arr[x]) { int temp = arr[x]; arr[x] = arr[y]; arr[y] = temp; } }
		 * System.out.println("第二次比较："); // 遍历数组 printArray(arr);
		 * 
		 * // 第三次 x = 2; for (int y = x + 1; y < arr.length; y++) { if (arr[y] <
		 * arr[x]) { int temp = arr[x]; arr[x] = arr[y]; arr[y] = temp; } }
		 * System.out.println("第三次比较："); // 遍历数组 printArray(arr);
		 * 
		 * // 第四次 x = 3; for (int y = x + 1; y < arr.length; y++) { if (arr[y] <
		 * arr[x]) { int temp = arr[x]; arr[x] = arr[y]; arr[y] = temp; } }
		 * System.out.println("第四次比较："); // 遍历数组 printArray(arr);
		 */

		// for (int x = 0; x < arr.length - 1; x++) {
		// for (int y = x + 1; y < arr.length; y++) {
		// if (arr[y] < arr[x]) {
		// int temp = arr[x];
		// arr[x] = arr[y];
		// arr[y] = temp;
		// }
		// }
		// }

		// 选择排序
		selectSort(arr);
		// 遍历数组
		printArray(arr);
	}

	// 选择排序
	public static void selectSort(int[] arr) {
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = x + 1; y < arr.length; y++) {
				if (arr[y] < arr[x]) {
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
		}
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
}
