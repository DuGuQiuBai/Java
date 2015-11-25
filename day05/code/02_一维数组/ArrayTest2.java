/*
	数组获取最值(获取数组中的最大值最小值)

	自学：最小值。
*/
class ArrayTest2 {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {12,86,79,43,50};

		//如何找呢?
		/*
		int max = arr[0];

		for(int x=1; x<arr.length; x++) {
			if(arr[x] > max) {
				max = arr[x];
			}
		}

		System.out.println(max);
		*/

		//为了将来调用方便，我们写一个功能实现获取最值
		int max = getMax(arr);
		System.out.println("最大值是："+max);
	}

	/*
		返回值类型：int
		参数列表：int[] arr
	*/
	public static int getMax(int[] arr) {
		//定义参照物
		int max = arr[0];

		//循环遍历从1开始元素
		for(int x=1; x<arr.length; x++) {
			//比较，把大的留下来
			if(arr[x] > max) {
				max = arr[x];
			}
		}

		//返回最大值
		return max;
	}
}
