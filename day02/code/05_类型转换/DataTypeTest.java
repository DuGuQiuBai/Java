/*
	byte b1=3,b2=4,b;
	b=b1+b2;
	b=3+4;
	哪句是编译失败的呢？为什么呢？
		b=b1+b2;

	原因：
		变量相加，它首先提示类型，再做操作。
		常量相加，它先做操作，然后判断结果是否在左边的范围内容，如果在就不报错。如果不在，报错。
*/
class DataTypeTest {
	public static void main(String[] args) {
		byte b1=3,b2=4,b;
		//b = b1+b2; //右边类型自动提升
		b = 3+4;
	}
}
