package cn.itcast_02;

/*
 * 静态导入：
 * 		格式：import static xxx.xxx.xxx.类名.方法名;
 * 
 * 注意：		
 * 		A:方法必须是静态的
 * 		B:如果有多个同名的静态方法，容易不知道使用谁?这个时候要使用，必须加前缀。由此可见，意义不大，所以一般不用，但是要能看懂。
 */
import static java.lang.Math.abs;
import static java.lang.Math.max;

public class StaticImportDemo {
	public static void main(String[] args) {
		// System.out.println(java.lang.Math.abs(-12));
		// System.out.println(java.lang.Math.max(12, 23));

		// System.out.println(Math.abs(-12));
		// System.out.println(Math.max(12, 23));

		System.out.println(abs(-12));
		System.out.println(java.lang.Math.max(12, 23));
	}

	public static boolean max(int a, int b) {
		return a == b;
	}
}
