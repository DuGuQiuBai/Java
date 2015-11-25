/*
	键盘录入两个数据，比较这两个数据是否相等
*/
import java.util.Scanner;

class OperatorTest4 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		//获取键盘录入数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();

		//比较是否相等
		//boolean flag =  (a==b)?true:false;
		boolean flag = (a==b);

		//输出结果
		System.out.println(flag);
	}
}
