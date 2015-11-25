/*
	键盘录入两个数据，比较两个数是否相等
*/
import java.util.Scanner;

class MethodTest2 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		//键盘录入数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();

		//调用方法
		boolean flag = compare(a,b);
		System.out.println(flag);
	}

	/*
		比较两个数是否相等

		两个明确：
			返回值类型：boolean
			参数列表：int a,int b
	*/
	public static boolean compare(int a,int b) {
		/*
		if(a == b) {
			return true;
		}else {
			return false;
		}
		*/

		//三元格式1
		//boolean flag = a==b?true:false;
		//return flag;

		//三元格式2
		//return a==b?true:false;
	
		//最终版
		return a == b;
	}
}
