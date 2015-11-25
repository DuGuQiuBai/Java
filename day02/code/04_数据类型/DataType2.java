/*
	使用变量的注意事项：
		A:作用域	
			变量定义在哪一级大括号中，哪个大括号的范围就是这个变量的作用域。
			相同的作用域中不能定义两个同名变量。

		B:初始化值
			没有初始化值不能直接使用

		C:定义变量的问题
			在一行上建议只定义一个变量
			可以定义多个，但是不建议
*/
class DataType2 {
	//int i = 100;

	public static void main(String[] args) {
		int i = 200;

		//int j;
		//System.out.println(j);

		//int a = 10;int b = 20;

		//int a = 10;
		//int b = 20;

		//int a,b;

		//int x=10,y=20;
		//int x = 10;
		//int y = 20;

		//定义变量
		//数据类型 变量名 = 初始化值;
		//其实我们还可以改变一下，只要在使用该变量前赋值即可。
		int j;
		//........
		j = 200;
		System.out.println(j);
	}
}
