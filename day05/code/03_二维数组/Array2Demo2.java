/*
	定义格式2：
		数据类型[][] 变量名 = new 数据类型[m][];
		
		m:m表示这个二维数组有多少个一维数组
*/
class Array2Demo2 {
	public static void main(String[] args) {
		//定义一个数组
		int[][] arr = new int[3][];
		//这里我们仅仅知道这个二维数组有3个一维数组
		//但是，每个一维数组有几个元素，我们是不知道的

		System.out.println(arr); //[[I@7d3598c3
		System.out.println(arr[0]); //null
		System.out.println(arr[1]); //null
		System.out.println(arr[2]); //null


		arr[0] = new int[3];
		arr[1] = new int[1];
		arr[2] = new int[2];
		System.out.println(arr[0]); //
		System.out.println(arr[1]); //
		System.out.println(arr[2]); //


		arr[2][1] = 100;
		arr[1][3] = 200;
	}
}