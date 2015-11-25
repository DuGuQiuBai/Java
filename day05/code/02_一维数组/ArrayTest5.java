/*
	数组元素查找(查找指定元素第一次在数组中出现的索引)

	思路：
		从头开始遍历，依次比较元素，只要找到了，就返回该处的索引。
*/
class ArrayTest5 {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr = {12,86,79,43,50};

		//写功能实现
		int index = getIndex(arr,79);
		System.out.println("79在数组中的索引是："+index);
		int index2 = getIndex(arr,179);
		System.out.println("179在数组中的索引是："+index2);
	}

	/*
		返回值类型：int
		参数列表：int[] arr,int key
	*/

	/*
	public static int getIndex(int[] arr,int key) {
		for(int x=0; x<arr.length; x++) {
			if(arr[x] == key) {
				return x;
			}
		}

		//当元素不存在的时候的值
		return -1; //一般我们都写-1
	}
	*/

	//再换一种写法
	public static int getIndex(int[] arr,int key) {
		int index = -1;

		for(int x=0; x<arr.length; x++) {
			if(arr[x] == key) {
				index =  x;
				break;
			}
		}

		return index;
	}
}
