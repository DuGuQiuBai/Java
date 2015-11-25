/*
	需求：键盘录入x的值，计算出y的并输出。
			x>=3	y = 2x + 1;
			-1<=x<3	y = 2x;
			x<-1	y = 2x – 1;


	分析：
		A:键盘录入数据。
		B:判断x的取值范围，并计算出对应的y的值
		C:最后输出y的值
*/
import java.util.Scanner;

class IfTest3 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in); 

		//键盘录入数据
		System.out.println("请输入一个数据：");
		int x = sc.nextInt();

		int y;
		if(x >= 3) {
			y = 2*x + 1;
		}else if(x>=-1 && x<3) {
			y = 2*x;
		}else {
			y = 2*x - 1;
		}

		System.out.println("y的值是："+y);
	}
}