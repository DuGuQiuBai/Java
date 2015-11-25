/*
	需求：键盘录入月份的值，输出对应的季节。
		春 3,4,5
		夏 6,7,8
		秋 9,10,11
		冬 12,1,2

	分析：
		A:键盘录入月份，用Scanner实现。
		B:用if语句实现判断
*/
import java.util.Scanner;

class IfTest4 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		//键盘录入月份
		System.out.println("请输入月份：");
		int month = sc.nextInt();
		
		/*
		if(month<1 || month>12) {
			System.out.println("月份输入有误");
		}else if(month == 1) {
			System.out.println("冬季");
		}else if(month == 2) {
			System.out.println("冬季");
		}else if(month == 3) {
			System.out.println("春季");
		}else if(month == 4) {
			System.out.println("春季");
		}else if(month == 5) {
			System.out.println("春季");
		}else if(month == 6) {
			System.out.println("夏季");
		}else if(month == 7) {
			System.out.println("夏季");
		}else if(month == 8) {
			System.out.println("夏季");
		}else if(month == 9) {
			System.out.println("秋季");
		}else if(month == 10) {
			System.out.println("秋季");
		}else if(month == 11) {
			System.out.println("秋季");
		}else {
			System.out.println("冬季");
		}
		*/

		//虽然现在可以实现，但是感觉有些麻烦
		//所以我们要对程序进行改进
		//如何改呢?
		//month==3 || month==4 || month==5
		/*
		if(month<1 || month>12) {
			System.out.println("月份输入有误");
		}else if(month==3 || month==4 || month==5) {
			System.out.println("春季");
		}else if(month==6 || month==7 || month==8) {
			System.out.println("夏季");
		}else if(month==9 || month==10 || month==11) {
			System.out.println("秋季");
		}else {
			System.out.println("冬季");
		}
		*/

		//这个时候，已经可以了。
		//但是，加入判断的条件较多，比如说，上半年和下半年。
		//判断的条件比较多的话，我们其实还可以考虑通过另外的一种形式进行表达
		//(month>=3 && month<=5)
		//针对一个范围的判断
		if(month<1 || month>12) {
			System.out.println("月份输入有误");
		}else if(month>=3 && month<=5) {
			System.out.println("春季");
		}else if(month>=6 && month<=8) {
			System.out.println("夏季");
		}else if(month>=9 && month<=11) {
			System.out.println("秋季");
		}else {
			System.out.println("冬季");
		}
	}
}
