/*
	数组查表法(根据键盘录入索引,查找对应星期)
*/
import java.util.Scanner;

class ArrayTest4 {
	public static void main(String[] args) {
		//1,2,3,4,5,6,7
		//定义一个数组
		String[] strArray = {"","星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
	
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个数字(1~7)：");
		int week = sc.nextInt();

		//如何得到数据呢?
		System.out.println("你想得到的是："+strArray[week]);
	}
}
