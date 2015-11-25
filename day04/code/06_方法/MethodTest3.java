/*
	键盘录入三个数据，返回三个数中的最大值
*/
import java.util.Scanner;

class MethodTest3 {
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
		
		//调用功能
		int max = getMax(a,b,c);
		System.out.println(max);
	}

	/*
		返回三个数中的最大值
		两个明确：
			返回值类型：int
			参数列表：int a,int b,int c
	*/
	public static int getMax(int a,int b,int c) {
		/*
		if(a>b){
			if(a>c) {
				return a;
			}else {
				return c;
			}
		}else{
			if(b>c) {
				return b;
			}else {
				return c;
			}
		}
		*/

		//三元
		//return a>b?a>c?a:c:b>c?b:c;

		int temp = a>b?a:b;
		int max = temp>c?temp:c;
		return max;
	}
}
