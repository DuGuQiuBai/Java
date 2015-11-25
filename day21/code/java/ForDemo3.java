/*
	需求：求5的阶乘

	阶乘：
		n! = n*(n-1)*(n-2)*...*3*2*1

		n! = n*(n-1)!
*/
class ForDemo3 {
	public static void main(String[] args) {
		//定义累乘变量
		int jc = 1;

		for(int x=1; x<=5; x++) {
			jc *= x;
		}

		System.out.println("5的阶乘是："+jc);
	}
}