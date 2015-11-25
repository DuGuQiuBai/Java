/*
	键盘录入三个数据，获取这三个数据中的最大值
*/
import java.util.Scanner;

class OperatorTest3 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		//获取键盘录入数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();
		System.out.println("请输入第三个数据：");
		int c = sc.nextInt();

		//获取三个数据的最大值
		int temp = (a>b)?a:b;
		int max = (temp>c)?temp:c;

		//输出结果
		System.out.println("最大值是："+max);

	}
}
