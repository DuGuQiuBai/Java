/*
	数组遍历:
		依次输出数组中的每一个元素

	分析：
		A:定义一个数组，并赋值。
		B:输出数组中的元素
*/
class ArrayTest {
	public static void main(String[] args) {
		//定义一个数组，并赋值
		int[] arr = {11,22,33,44,55};

		//方式1
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("---------------");

		//方式2
		//通过观察，我们可以通过for循环实现取出0~4就OK了
		for(int x=0; x<5; x++) {
			System.out.println(arr[x]);
		}
		System.out.println("---------------");

		//方式3
		//如果元素多，数起来太麻烦了。
		//所以呢，数组为了方便我们的操作，就自己提供了一个属性：长度属性 length
		//用来获取数组的长度。
		//格式是：数组名.length;
		//System.out.println(arr.length);
	
		for(int x=0; x<arr.length; x++) {
			System.out.println(arr[x]);
		}
	}
}