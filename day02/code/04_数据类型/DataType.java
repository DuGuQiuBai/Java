/*
	为了更好的表达现实世界的事物，Java针对不同的事物提供了不同的数据类型。

	数据类型：
		基本类型：4类8种
		引用类型：类，接口，数组。(后面讲)

	基本类型:
		整数：				占用的内存空间
			byte			1字节
								01111111
								10000000(1既表示符号位，又表示数值 -128)
			short			2字节
			int				4字节
			long			8字节
		浮点数：
			float			4字节
			double			8字节
		字符：
			char			2字节
		布尔：
			boolean			未知。1字节

	面试题：
		Java中字符可以存储一个汉字吗?
		可以。因为Java语言采用的是unicode编码，
		而unicode编码的每个字符是两个字节，
		所以，java中的字符可以存储一个汉字。


	注意：
		整数默认是int类型
		浮点数默认是double类型

		long类型的变量，要加l或者L。
		float类型的变量，要加f或者F。

		在同一对{}里面，是不能有同名的变量。
*/
class DataType {
	public static void main(String[] args) {
		//定义变量的格式：
		//数据类型 变量名 = 初始化值;

		//定义byte类型的变量
		byte b = 1;
		System.out.println(1);
		System.out.println(b);

		//定义short类型的变量
		short s = 100;
		System.out.println(s);

		//定义int类型的变量
		int i = 100000;
		System.out.println(i);

		//报错
		//int j = 2147483648;
		//System.out.println(j);

		//定义long类型的变量
		long l = 2147483648L;
		System.out.println(l);

		//定义float类型的变量
		float f = 12.34F;
		System.out.println(f);

		//定义double类型的变量
		double d = 23.56;
		System.out.println(d);

		//定义char类型的变量
		char ch = 'a';
		System.out.println(ch);

		//定义boolean类型的变量
		boolean flag = true;
		System.out.println(flag);
	}
}
