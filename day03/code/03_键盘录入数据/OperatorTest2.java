/*
	需求：键盘录入两个数据，获取这两个数据中的最大值

	分析：
		A:键盘录入数据
		B:获取最大值，用三元运算符实现
		C:输出最大值
*/
import java.util.Scanner;

class OperatorTest2 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		//获取键盘录入数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();

		//获取数据最大值
		int max = (a>b)?a:b;

		//输出结果
		System.out.println("最大值是："+max);
	}
}