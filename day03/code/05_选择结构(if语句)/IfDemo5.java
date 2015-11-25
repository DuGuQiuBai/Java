/*
	if语句格式3：
		if(关系表达式1) {
		     语句体1;
		}else  if (关系表达式2) {
			 语句体2;
		}
		…
		else {
			 语句体n+1;
		}

	执行流程：
		首先判断关系表达式1看其结果是true还是false
		如果是true就执行语句体1
		如果是false就继续判断关系表达式2看其结果是true还是false
		如果是true就执行语句体2
		如果是false就继续判断关系表达式…看其结果是true还是false
		…
		如果没有任何关系表达式为true，就执行语句体n+1。

	需求：
		键盘录入学生成绩，根据成绩输出对于的评价。
			90-100	优秀
			80-90	好
			70-80	良
			60-70	及格
			60以下	不及格
*/
import java.util.Scanner;

class IfDemo5 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		//键盘录入学生成绩
		System.out.println("请输入成绩：");
		int score = sc.nextInt();

		//校验数据的时候，一定要注意：
		//正确数据
		//错误数据
		//边界数据

		/*
		if(score>=90 && score<=100) {
			System.out.println("优秀");
		}else if(score>=80 && score<90) {
			System.out.println("好");
		}else if(score>=70 && score<80) {
			System.out.println("良");
		}else if(score>=60 && score<70) {
			System.out.println("及格");
		}else {
			System.out.println("不及格");
		}
		*/

		//这个时候，虽然可以满足要求了。但是没有考虑到错误数据的情况。
		//所以，我们需要加一个判断
		/*
		if(score>=90 && score<=100) {
			System.out.println("优秀");
		}else if(score>=80 && score<90) {
			System.out.println("好");
		}else if(score>=70 && score<80) {
			System.out.println("良");
		}else if(score>=60 && score<70) {
			System.out.println("及格");
		}else if(score>=0 && score<60) {
			System.out.println("不及格");
		}else {
			System.out.println("输入的成绩有误");
		}
		*/

		//我们也可以先判断成绩是否有误
		if(score<0 || score>100) {
			System.out.println("输入的成绩有误");
		}else if(score>=90 && score<=100) {
			System.out.println("优秀");
		}else if(score>=80 && score<90) {
			System.out.println("好");
		}else if(score>=70 && score<80) {
			System.out.println("良");
		}else if(score>=60 && score<70) {
			System.out.println("及格");
		}else {
			System.out.println("不及格");
		}
	}
}
