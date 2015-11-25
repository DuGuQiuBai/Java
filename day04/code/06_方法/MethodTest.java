/*
	需求：键盘录入两个数据，返回两个数中的较大值

	分析：
		A:键盘录入数据，用Scanner实现。
		B:写一个功能实现，返回两个数据的较大值
		C:调用功能
		D:输出结果
*/
import java.util.Scanner;

class MethodTest {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		//获取键盘录入数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();

		//调用方法
		int max = getMax(a,b);
		System.out.println("大的值是："+max);
	}

	/*
		返回两个数中的较大值
		两个明确：
			返回值：int
			参数列表：int a,int b
	*/
	public static int getMax(int a,int b) {
		/*
		if(a > b) {
			return a;
		}else {
			return b;
		}
		*/

		/*
		int m = a>b?a:b;
		return m;
		*/

		return a>b?a:b;
	}
}
