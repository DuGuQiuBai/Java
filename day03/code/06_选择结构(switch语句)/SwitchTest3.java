/*
	用switch语句实现键盘录入月份，输出对应的季节

	在做判断的时候，我们有两种选择，if语句和switch语句，那么，我们到底该如何选择使用那种语句呢?
		if语句使用场景：
			针对结果是boolean类型的判断
			针对一个范围的判断
			针对几个常量值的判断
		switch语句使用场景：
			针对几个常量值的判断
*/
import java.util.Scanner;

class SwitchTest3 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		//键盘录入数据
		System.out.println("请输入月份：");
		int month = sc.nextInt();

		/*
		switch(month) {
			case 1:
				System.out.println("冬季");
				break;
			case 2:
				System.out.println("冬季");
				break;
			case 3:
				System.out.println("春季");
				break;
			case 4:
				System.out.println("春季");
				break;
			case 5:
				System.out.println("春季");
				break;
			case 6:
				System.out.println("夏季");
				break;
			case 7:
				System.out.println("夏季");
				break;
			case 8:
				System.out.println("夏季");
				break;
			case 9:
				System.out.println("秋季");
				break;
			case 10:
				System.out.println("秋季");
				break;
			case 11:
				System.out.println("秋季");
				break;
			case 12:
				System.out.println("冬季");
				break;
			default:
				System.out.println("你输入的月份有误");
		}
		*/

		//比较麻烦
		switch(month) {
			case 1:
			case 2:
			case 12:
				System.out.println("冬季");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			default:
				System.out.println("你输入的月份有误");
		}
	}
}
