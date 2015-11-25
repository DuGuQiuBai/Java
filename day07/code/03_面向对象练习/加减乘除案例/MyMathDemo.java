/*
	定义一个类MyMath,提供基本的加减乘除功能，然后进行测试。
*/
class MyMath {
	public int add(int a,int b) {
		return a + b;
	}

	public int subtract(int a,int b) {
		return a - b;
	}

	public int multiply(int a,int b) {
		return a * b;
	}

	public int divide(int a,int b) {
		return a / b;
	}
}
class MyMathDemo {
	public static void main(String[] args) {
		//创建对象
		MyMath my = new MyMath();

		System.out.println("加法："+my.add(23,34));
		System.out.println("减法："+my.subtract(23,34));
		System.out.println("乘法："+my.multiply(2,4));
		System.out.println("除法："+my.divide(10,4));
	}
}