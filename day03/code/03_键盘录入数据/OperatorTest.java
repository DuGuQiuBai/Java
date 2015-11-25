/*
	需求：键盘录入两个数据，并对这两个数据求和，输出其结果
	
	分析：
		A:键盘录入数据，通过Scanner实现。
			导包	import java.util.Scanner;
			创建对象	Scanner sc = new Scanner(System.in);
			获取数据	int i = sc.nextInt();

		B:录入两个数据
			所以就是int i = sc.nextInt();来两次。分别用不同的变量接受
				int i = sc.nextInt();
				int j = sc.nextInt();

		C:求两个数据的和
			int sum = i + j;

		D:输出结果
			System.out.println(sum);
*/
import java.util.Scanner;

class OperatorTest {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		//录入数据
		System.out.println("请输入第一个数据：");
		int firstNumber = sc.nextInt();
		System.out.println("请输入第二个数据：");
		int secondNumber = sc.nextInt();

		//做加法
		int sum = firstNumber + secondNumber;

		//输出结果
		System.out.println("数据和是："+sum);
	}
}
