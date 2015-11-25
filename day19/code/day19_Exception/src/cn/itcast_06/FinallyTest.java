package cn.itcast_06;

/*
 * 面试题：
 * final,finally和finalize的区别?
 * final:修饰类，修饰成员变量，修饰成员方法
 * 		修饰类,类不能被继承	
 * 		修饰成员变量，变量是常量
 * 		修饰成员方法，方法不能被重写
 * finally:被finally控制的代码永远会执行，用于释放资源。
 * 		注意事项：就是在执行到finally之前jvm退出了。
 * finalize:是Object类的方法，启动垃圾回收器，用于回收垃圾。
 * 
 * 如果catch里面有return语句，请问finally的代码还会执行吗?如果会，请问是在return前还是return后。
 * 会执行。
 * 前。
 * 准确的说法：中间。
 * 整个这个过程有三步：
 * 		1：执行到return 40;的时候，就在内存中形成了一个返回路径。
 * 		2:由于它发现还有一个finally，所以，继续执行了finally，n=50
 * 		3:finally结束后，再次回到以前的返回路径，继续。所以返回的是40
 */
public class FinallyTest {
	public static void main(String[] args) {
		System.out.println(returnInt()); // 40
	}

	public static int returnInt() {
		int n = 10;
		try {
			n = 20;
			System.out.println(10 / 0);
			n = 30;
		} catch (ArithmeticException e) {
			n = 40;
			return n;
		} finally {
			n = 50;
			return n;
		}
		// return 0;
	}
}
