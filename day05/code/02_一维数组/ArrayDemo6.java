/*
	数组操作常见的两个小问题:
		A:数组索引越界
			ArrayIndexOutOfBoundsException
			因为我们访问了不存在的索引。
		B:空指针异常
			NullPointerException
			因为数组已经不再指向堆内存，所以就不能再去访问堆内存的元素了。
*/
class ArrayDemo6 {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {1,2,3};

		//System.out.println(arr[3]);

		arr = null; //把arr指向堆内存给去掉了，arr没有指向了。
		System.out.println(arr[0]);
	}
}