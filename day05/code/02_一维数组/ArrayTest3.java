/*
	数组元素反转 (就是把元素对调)

	分析：
		如何做反转呢?
			把第一个和最后一个交换
			把第二个和倒数第二个交换
			...
*/
class ArrayTest3 {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {12,86,79,43,50};

		/*
		for(int x=0; x<arr.length; x++) {
			System.out.println(arr[x]);
		}
		*/

		//写一个功能遍历数组
		printArray(arr);

		//结果：{50,43,79,86,12}
		//功能写好了，如何调用呢?
		reverse(arr);
		printArray(arr);
	}

	/*
		返回值类型：void
		参数列表：int[] arr
	*/
	/*
	public static void printArray(int[] arr) {
		for(int x=0; x<arr.length; x++) {
			System.out.println(arr[x]);
		}
	}
	*/

	//效果不好看
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0; x<arr.length; x++) {
			if(x == arr.length - 1) {
				System.out.print(arr[x]);
			} else {
				System.out.print(arr[x]+", ");
			}
		}
		System.out.println("]");
	}

	/*
		写功能实现：
			返回值类型：void
			参数列表：int[]
	*/
	public static void reverse(int[] arr) {
		for(int start=0,end=arr.length-1; start<=end; start++,end--) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
}
