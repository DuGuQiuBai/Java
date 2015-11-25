package cn.itcast_04;

/*
 *getMessage():获取异常信息，返回字符串。
 *toString():获取异常类名和异常信息，返回字符串。
 *printStackTrace():获取异常类名和异常信息，以及异常出现在程序中的位置。返回值void。
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b); // 从哪里产生异常，就会在哪里创建一个异常的对象。new
										// ArithmeticException();
										// 然后，拿着该异常对象，到catch里面去匹配。

		} catch (ArithmeticException e) { // ArithmeticException e = new
											// ArithmeticException();
			// System.out.println(e.toString());
			// System.out.println("除数不能为0");

			// System.out.println(e.getMessage()); // by zero
			// System.out.println(e.toString());
			e.printStackTrace();
		}

		System.out.println("over");
	}
}
