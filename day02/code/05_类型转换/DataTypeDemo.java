/*
	+是一个运算符, 我们应该能够看懂，做数据的加法。

	参与运算的数据，要求类型一致。

	boolean类型不能转换为其他的数据类型。

	隐式转换：
		A:byte,short,char-->int-->long-->float-->double
		B:byte,short,char相互之间不转换，他们参与运算首先转换为int类型
*/
class DataTypeDemo {
	public static void main(String[] args) {
		//类型一样的数据
		int a = 10;
		int b = 20;
		System.out.println(a + b);
		int c = a + b;
		System.out.println(c);
		System.out.println("--------------");

		//定义变量
		byte by = 3;
		int i = 4;
		System.out.println(by + i);
		int j =	by + i;
		System.out.println(j);
	}
}