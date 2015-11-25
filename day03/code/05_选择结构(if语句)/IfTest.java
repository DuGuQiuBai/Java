/*
	键盘录入两个数据，获取这两个数据中的最大值

	分析：
		A:键盘录入数据
		B:判断，用if语句实现
		C:输出结果

	练习：
		键盘录入两个数据，比较这两个数据是否相等
		用if语句实现。
*/
import java.util.Scanner;

class IfTest {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		//键盘录入数据
		System.out.println("请输入第一个数据：");
		int firstNumber = sc.nextInt();
		System.out.println("请输入第二个数据：");
		int secondNumber = sc.nextInt();

		//用if语句实现

		//方式1：直接把结果输出
		if(firstNumber > secondNumber) {
			System.out.println("较大的值是："+firstNumber);
		}else {
			System.out.println("较大的值是："+secondNumber);
		}
		System.out.println("-----------------------------");

		//方式2：把结果保存下来
		/*
		变量的生命周期问题,作用域问题
		if(firstNumber > secondNumber) {
			int max = firstNumber;
		}else {
			int max = secondNumber;
		}
		*/

		int max;
		if(firstNumber > secondNumber) {
			max = firstNumber;
		}else {
			max = secondNumber;
		}
		System.out.println("较大的值是："+max);
	}
}
