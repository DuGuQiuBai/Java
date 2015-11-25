package cn.itcast_06;

/*
 * finally:被finally控制的语句体一定会执行。
 * 应用：数据库的连接，IO操作的时候。
 * 注意事项：
 * 		在执行到finally之前jvm退出了
 */
public class FinallyDemo {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.exit(0);
		} finally {
			// 释放资源的操作
			System.out.println("over");
		}
	}
}
