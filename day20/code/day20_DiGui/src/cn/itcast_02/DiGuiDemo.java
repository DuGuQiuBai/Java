package cn.itcast_02;

/*
 * 需求：求5的阶乘
 */
public class DiGuiDemo {
	public static void main(String[] args) {
		// 用循环实现阶乘
		int jc = 1;
		for (int x = 1; x <= 5; x++) {
			jc *= x;
		}
		System.out.println("5的阶乘是：" + jc);

		// 用递归实现求阶乘
		System.out.println("5的阶乘是："+jc(5));
		
	}
	
	/*定义一个方法jc(int n),
	 *假如jc(n)表示n的阶乘，请问
	 *n-1的阶乘如何表示呢?
	 *jc(n-1)
	 *
	 *出口是1！= 1
	 */
	public static int jc(int n){
		if(n==1){
			return 1;
		}else {
			return n*jc(n-1);
		}
	}
}
