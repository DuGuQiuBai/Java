package cn.itcast_07;

/*
 * java API虽然提供了大多数的异常类，但是他不可能考虑到所有的情况。
 * 所以呢，针对我们自己的特殊需求的异常，我们需要自己定义异常。
 * 而我们要自己定义一个类，让他成为异常类，那么，它必须要继承自异常类。
 * 继承自哪个呢?
 * 		继承自Exception
 *		继承自RuntimeException
 */
public class MyException extends Exception {
	public MyException() {
		super();
	}

	public MyException(String message) {
		super(message);
	}
}
