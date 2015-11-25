/*
	位^运算符号：针对同一个数据异或两次，其值不变

	 面试题：
		请把两个数据进行交换。
		说明：如果我没有指定数据的类型，默认是int类型。适用于我讲课。
*/
class OperatorTest {
	public static void main(String[] args) {
		/*
		System.out.println(1 ^ 2 ^ 2);//1
		System.out.println(1 ^ 1 ^ 2);//2
		System.out.println(15 ^ 3 ^ 7 ^ 7 ^ 3);//15
		*/

		//定义两个变量
		int a = 10;
		int b = 20;

		//System.out.println(a+"---"+b);
		System.out.println("a="+a+",b="+b);

		//怎么做呢?
		//方式1：使用第三方变量。开发中常用此方案。
		/*
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a="+a+",b="+b);
		*/

		//方式2：不好，可能a+b已经超出范围了。
		/*
		a = a + b; //a=30
		b = a - b; //b=10
		a = a - b; //a=20
		System.out.println("a="+a+",b="+b);
		*/

		//方式3：不好，可能a+b已经超出范围了。
		//a = (a+b) - (b=a); //一句话搞定
		//System.out.println("a="+a+",b="+b);

		//方式4：面试
		a = a ^ b;
		b = a ^ b; //b = a ^ b = a ^ b ^ b = a;
		a = a ^ b; //a = a ^ b = a ^ b ^ a = b;
		System.out.println("a="+a+",b="+b);
		//记忆：左边，a,b,a。右边a^b
	}
}
