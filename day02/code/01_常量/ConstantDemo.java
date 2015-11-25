/*
	常量：在程序执行的过程中其值不可以发生改变
			举例：π

	分类：
		A:字面值常量
			1，12.5
		B:自定义常量(面向对象部分讲解)

	字面值常量分类：
		A:字符串常量 用""括起来的内容
		B:整数常量 所有的整数数据
		C:小数常量 所有的带小数的数据
		D:字符常量 用单引号括起来的内容
		E:布尔常量 只有两个值：true和false
		F:空常量 null(数组部分去讲解)
*/
class ConstantDemo {
	public static void main(String[] args) {
		//字符串常量
		System.out.println("HelloWorld");

		//整数常量
		System.out.println(100);

		//小数常量
		System.out.println(12.345);

		//字符常量
		System.out.println('A');
		//下面的是错误的
		//System.out.println('BC');
		System.out.println('1');
		
		//布尔常量
		System.out.println(true);
		System.out.println(false);
	}
}