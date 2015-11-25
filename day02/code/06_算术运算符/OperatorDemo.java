/*
	运算：对常量和变量进行操作的过程称为运算。
	运算符：对常量和变量进行操作的符号称为运算符
	表达式：由运算符把常量和变量连接起来的式子
			a + b
			注意：表达式必须有结果

	常见的运算符：
		算术运算符
		赋值运算符
		比较运算符
		逻辑运算符
		位运算符
		三目运算符

	算术运算符：
		+，-，*，/，%，++，--
*/
class OperatorDemo {
	public static void main(String[] args) {
		System.out.println(10+20);
		System.out.println(10-20);
		System.out.println(10*20);
		//整数相除，只能得到整数
		System.out.println(10/20);
		//要想得到小数，可以乘以或者除以1.0
		System.out.println(10/1.0/20);

		//加法的用法:正号,加法,字符串连接符
		System.out.println(+5);
		System.out.println(1+2);
		System.out.println("1"+"2");
	}
}