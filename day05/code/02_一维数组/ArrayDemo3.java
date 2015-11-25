/*
	定义两个数组，分别输出数组名及元素。然后分别给数组中的元素赋值，分别再次输出数组名及元素。
*/
class ArrayDemo3 {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr = new int[3];

		//输出数组名称及元素
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		//赋值并输出
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		//再定义一个新的数组
		int[] arr2 = new int[2];
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);

		//赋值并输出
		arr2[0] = 100;
		arr2[1] = 200;
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
	}
}
