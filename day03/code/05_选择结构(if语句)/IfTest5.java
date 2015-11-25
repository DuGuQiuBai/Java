/*
	需求：获取三个数据中的最大值
*/
import java.util.Scanner;

class IfTest5 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		//键盘录入数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();
		System.out.println("请输入第三个数据：");
		int c = sc.nextInt();

		//三元运算符实现
		//int max  = (a>b)?(a>c?a:c):(b>c?b:c);
		int temp = a>b?a:b;
		int max = temp>c?temp:c;
		System.out.println("最大值是："+max);


		//if语句实现(if语句的嵌套使用)
		int max2;
		if(a > b) {
			if(a > c) {
				max2 = a;
			}else {
				max2 = c;
			}
		}else {
			if(b > c) {
				max2 = b;
			}else {
				max2 = c;
			}
		}
		System.out.println("最大值是："+max2);
	}
}
