/*
	需求：键盘录入两个数据，比较这两个数据是否相等

	分析：
		A:键盘录入，用Scanner
		B:比较这两个数据，用if语句
		C:两种形式展示结果
*/
import java.util.Scanner;

class IfTest2 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		//键盘录入数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();

		//比较数据
		//方式1:把结果直接输出
		if(a == b) {
			System.out.println(true);
		}else {
			System.out.println(false);	
		}
		System.out.println("------------------");

		//方式2:把结果保留下来
		boolean flag;
		if(a == b) {
			flag = true;
		}else {
			flag = false;
		}
		System.out.println(flag);
	}
}
