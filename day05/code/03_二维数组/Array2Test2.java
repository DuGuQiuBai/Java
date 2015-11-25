/*
	公司年销售额求和
		某公司按照季度和月份统计的数据如下：单位(万元)
		第一季度：22,66,44
		第二季度：77,33,88
		第三季度：25,45,65
		第四季度：11,66,99

	分析：
		A:通过观察，我们知道，这应该用一个二维数组来表示
		B:定义求和变量
		C:遍历二维数组，获取每一个元素，然后累加即可。
		D:输出结果。

*/
class Array2Test2 {
	public static void main(String[] args) {
		//定义数组
		int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};

		//定义求和变量
		int sum = 0;

		//遍历二维数组
		for(int x=0; x<arr.length; x++) {
			for(int y=0; y<arr[x].length; y++) {
				//sum = sum + arr[x][y];
				sum += arr[x][y];
			}
		}

		//输出结果
		System.out.println("sum:"+sum);
	}
}