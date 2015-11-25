package cn.itcast_01;

/*
 * Math是用于数学操作的类。方法都是静态的
 */
public class MathDemo {
	public static void main(String[] args) {
		// public static int abs(int a):绝对值
		System.out.println("abs:" + Math.abs(12));
		System.out.println("abs:" + Math.abs(-12));
		System.out.println("--------------------");

		// public static double ceil(double a):大于等于参数的最小整数值
		System.out.println("ceil:" + Math.ceil(12.34));
		System.out.println("ceil:" + Math.ceil(12.56));
		System.out.println("--------------------");

		// public static double floor(double a):小于等于参数的最大整数值
		System.out.println("floor:" + Math.floor(12.34));
		System.out.println("floor:" + Math.floor(12.56));
		System.out.println("--------------------");

		// public static int max(int a,int b) min自学
		System.out.println("max:" + Math.max(12, 23));
		// 方法的嵌套调用
		System.out.println("max:" + Math.max(Math.max(24, 47), 23));
		System.out.println("--------------------");

		// public static double pow(double a,double b)
		System.out.println("pow:" + Math.pow(2, 3));
		System.out.println("pow:" + Math.pow(5, 5));
		System.out.println("--------------------");

		// public static double random():产生随机数。[0.0,1.0)

		// public static int round(float a) 参数为double的自学
		System.out.println("round:" + Math.round(12.34f));
		System.out.println("round:" + Math.round(12.56f));
		System.out.println("--------------------");

		// public static double sqrt(double a):正平方根
		System.out.println("sqrt:" + Math.sqrt(16));
	}
}
