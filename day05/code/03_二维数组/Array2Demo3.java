/*
	定义格式2：
		数据类型[][] 变量名 = new 数据类型[][]{{元素…},{元素…},{元素…}};

		变形格式：
			数据类型[][] 变量名 = {{元素…},{元素…},{元素…}};
*/
class Array2Demo3 {
	public static void main(String[] args) {
		//定义数组
		//int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr = {{1,2,3},{4,5},{8}};

		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][1]);
		System.out.println(arr[2][1]);
	}
}
