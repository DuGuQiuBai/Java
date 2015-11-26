package cn.itcast_07;

/*
 * C语言的输出语句：printf(...)
 */
public class PrintfDemo {
	public static void main(String[] args) {
		// 固定文本
		// System.out.printf("hellworld\n");
		// System.out.printf("hellworld\n");

		// 带指示的文本
		// System.out.printf("%d\n", 100, 200);
		// System.out.printf("%d<%d\n", 100, 200);
		// System.out.printf("%d<%d\n", 100);

		// System.out.printf("%d+%d=%d\n", 10, 20, 30);
		// System.out.println(10 + "+" + 20 + "=" + 30);

		System.out.printf("%.1f\n", 12.345);
		System.out.printf("%.2f\n", 12.567);
		System.out.printf("%.2f\n", 12.564);
	}
}
