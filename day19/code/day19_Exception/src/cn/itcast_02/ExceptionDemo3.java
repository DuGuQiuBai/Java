package cn.itcast_02;

/*
 * throws：它就是在方法上声明异常，告诉你，我这个方法有问题。你使用的时候要注意了。
 */
public class ExceptionDemo3 {
	public static void main(String[] args) {
		// try {
		// method();
		// } catch (ArithmeticException e) {
		// System.out.println("除数不能为0");
		// }
		method();

		System.out.println("haha");
	}

	public static void method() throws ArithmeticException {
		System.out.println("hello");

		int a = 10;
		int b = 0;
		System.out.println(a / b);

		System.out.println("world");
	}

}
