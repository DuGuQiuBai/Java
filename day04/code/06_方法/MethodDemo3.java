/*
	没有明确返回值的方法调用：void修饰的方法
		单独调用
*/
class MethodDemo3 {
	public static void main(String[] args) {
		/*
		//需求：请在控制台输出一个3行4列的星形
		for(int x=0; x<3; x++){
			for(int y=0; y<4; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------");
		//需求：请在控制台输出一个5行6列的星形
		for(int x=0; x<5; x++){
			for(int y=0; y<6; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------");
		//需求：请在控制台输出一个7行8列的星形
		for(int x=0; x<7; x++){
			for(int y=0; y<8; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------");
		*/

		//单独调用
		//printXing(3,4);
		//printXing(7,8);

		//输出调用
		//System.out.println(printXing(7,8));

		//赋值调用
		//void v = printXing(7,8);
		//System.out.println(v);
	}

	public static void printXing(int a,int b) {
		for(int x=0; x<a; x++){
			for(int y=0; y<b; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
