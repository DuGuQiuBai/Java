/*
	switch语句格式：
		switch(表达式) {
			case 值1：
				语句体1;
				break;
		    case 值2：
				语句体2;
				break;
				…
		    default：	
				语句体n+1;
				break;
		}

		格式解释：
			A:switch表示这是switch语句
			B:表达式的取值
				byte,short,int,char
				JDK5以后可以是枚举类型。(enum)
				JDK7以后可以是字符串。(String)
			C:case后面跟的是要和表达式进行比较的值
			D:语句体可以是多条语句
			E:break表示中断，结束的意思，可以结束switch语句
			F:default语句表示所有情况都不匹配的时候，就执行该处的内容，和if语句的else相似。
		
		面试题：
			switch的表达式可以是byte类型吗?可以是long类型吗?可以是String类型吗?
				可以。
				不可以。
				JDK7以后可以。

		执行流程：
			A:首先计算出表达式的值
			B:其次，和case依次比较，一旦有对应的值，就会执行相应的语句，
			  在执行的过程中，遇到break就会结束。
			C:最后，如果所有的case都和表达式的值不匹配，就会执行default语句体部分，然后程序结束掉。

		需求：根据键盘录入的数值1，2，3，…7输出对应的星期一，星期二，星期三…星期日。

		分析：
			A:键盘录入数据，用Scanner实现
			B:对录入的数据进行判断，用switch实现
			C:输出对应的结果
*/
import java.util.Scanner;

class SwitchDemo {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		//键盘录入数据
		System.out.println("请输入一个数据(1-7)：");
		int week = sc.nextInt();

		//用switch语句实现
		switch(week) {
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期日");
				break;
			default:
				System.out.println("你输入的数据有误");
				break;
		}
	}
}