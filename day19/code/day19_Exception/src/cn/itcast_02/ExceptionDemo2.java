package cn.itcast_02;

/*
 * 多个异常的情况：
 * A:针对每个异常，给出一个处理
 * B:try...catch...catch...catch...
 * 		注意：
 * 			a:一旦try里面的代码有问题，就不在执行try里面的内容，和catch里面的内容依次的匹配，一旦有一个匹配，其他的不执行。
 * 			b:如果异常是平级关系，谁先谁后无所谓。
 *            如果异常不是平级关系，子先父后。
 *            
 * JDK7的新特性：针对平级关系的
 * 		catch(异常1 | 异常2 | 异常3 ... e) {}
 */
public class ExceptionDemo2 {
	public static void main(String[] args) {
		// method1();

		// method2();

		method3();
	}

	public static void method3() {
		int a = 10;
		int b = 0;
		int[] arr = { 1, 2, 3 };

		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("程序出问题了");
		}
		System.out.println("over");
	}

	public static void method2() {
		int a = 10;
		int b = 0;
		int[] arr = { 1, 2, 3 };

		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("索引越界异常");
		} catch (Exception e) {
			System.out.println("程序出问题了");
		}

		System.out.println("over");
	}

	public static void method1() {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b); // ArithmeticException: / by zero
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		}

		int[] arr = { 1, 2, 3 };
		try {
			System.out.println(arr[3]); // ArrayIndexOutOfBoundsException: 3
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("索引越界异常");
		}

		System.out.println("over");
	}
}
