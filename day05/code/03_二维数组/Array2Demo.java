/*
	二维数组：元素为一维数组的数组。

	定义格式1：
		数据类型[][] 变量名 = new 数据类型[m][n];
		
		m:m表示这个二维数组有多少个一维数组
		n:n表示每一个一维数组的元素个数

		变形：
			数据类型 变量名[][] = new 数据类型[m][n];
			数据类型[] 变量名[] = new 数据类型[m][n];

			int[] x,y[];
*/
class Array2Demo {
	public static void main(String[] args) {
		//定义一个二维数组
		int[][] arr = new int[3][2];
		//表示arr这个二维数组有三个元素
		//每个元素是一个一维数组
		//每一个一维数组有2个元素

		System.out.println(arr); //[[I@778b3fee
		System.out.println(arr[0]); //[I@57125f92
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		//如何输出元素呢?
		System.out.println(arr[0][1]);
		System.out.println(arr[2][2]);
	}
}