package cn.itcast_02;

/*
 * 兔子问题(斐波那契数列):有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第20个月的兔子对数为多少？
 * 			兔子对数
 *  第一个月：	1
 *  第二个月：	1
 *  第三个月：	2
 *  第四个月：	3
 *  第五个月：	5
 *  第六个月：	8
 *  ...
 *  
 *  斐波那契数列：1,1,2,3,5,8...
 *  
 *  规律：从第三项开始，每一项是前两项之和。	
 *  出口：前两项应该是已知。第一项1，第二项1
 *  
 *  相邻的两个月我们用a，b表示
 *  第一个相邻：a=1,b=1
 *  第二个相邻：a=1,b=2
 *  第三个相邻：a=2,b=3
 *  第四个相邻：a=3,b=5
 *  ...
 *  每次下一个相邻的a是以前的b，b是以前的a+b
 */
public class DiGuiTest {
	public static void main(String[] args) {
		// 用数组做
		int[] arr = new int[20];
		arr[0] = 1;
		arr[1] = 1;
		for (int x = 2; x < arr.length; x++) {
			arr[x] = arr[x - 1] + arr[x - 2];
		}
		System.out.println("第20个月的兔子对数是：" + arr[19]);
		
		//用变量的变化来做
		int a = 1;
		int b = 1;
		for(int x=0; x<18; x++){
			int temp = a;//以前的a
			a = b;
			b = temp + b;
		}
		System.out.println("第20个月的兔子对数是："+b);
		
		//用递归实现
		System.out.println("第20个月的兔子对数是："+fib(20));
	}
	
	/*
	 * 定义方法fib(int n)
	 * fib(n)表示是第n个月的兔子对数。
	 * 请问，n-1和n-2个月的兔子对数如何表示呢?
	 * fib(n-1),fib(n-2)
	 */
	public static int fib(int n){
		if(n==1 || n==2){
			return 1;
		}else {
			return fib(n-1)+fib(n-2);
		}
	}
}