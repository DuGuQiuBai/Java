package cn.itcast_02;

/*
 * java中我们如何处理异常呢?
 * A:try…catch…finally
 * B:throws
 * 
 * try…catch…finally格式
 * try {
 * 		可能出现问题的代码
 * }catch(异常类名 变量) {
 * 		针对问题的处理
 * }finally {
 * 		释放资源的代码
 * }
 * 
 * finally等会在讲，所以，这个时候，我们先使用简单的格式：
 * try {
 * 		可能出现问题的代码
 * }catch(异常类名 变量) {
 * 		针对问题的处理
 * }
 * 
 * 尽可能的把可能出现问题的代码用try包含，如果你判断不了哪些有问题，可以多包含一些。
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("hello");

		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
			// 实际开发的时候，应该给出的是页面形式的提示
		}

		System.out.println("world");
	}
}
