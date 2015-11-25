/*
	while循环的格式：
		while(条件表达式) {
			语句体;
		}

	变形格式：
		初始化语句;
		while(判断条件语句) {
			循环体语句;
			控制条件语句;
		}

		for(初始化语句;判断条件语句;控制条件语句) {
			 循环体语句;
		}
	由此可见while循环和for循环是可以等价转换的。
*/
class WhileDemo {
	public static void main(String[] args) {
		//for
		/*
		for(int x=0; x<10; x++) {
			System.out.println("HelloWorld");
		}
		System.out.println("--------------");
		*/

		//while
		/*
		int x=0;
		while(x<10) {
			System.out.println("HelloWorld");
			x++;
		}
		*/

		//求和
		//for
		/*
		int sum = 0;
		for(int x=1; x<=100; x++) {
			sum+=x;
		}
		System.out.println("1-100之和是："+sum);
		*/

		//while
		/*
		int sum = 0;
		int x = 1;
		while(x<=100) {
			sum += x;
			x++;
		}
		System.out.println("1-100之和是："+sum);
		*/

		//水仙花
		//for
		/*
		for(int x=100; x<1000; x++) {
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;

			if(x == (ge*ge*ge + shi*shi*shi + bai*bai*bai)) {
				System.out.println(x);
			}
		}
		*/

		//while
		int x = 100;
		while(x<1000) {
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;

			if(x == (ge*ge*ge + shi*shi*shi + bai*bai*bai)) {
				System.out.println(x);
			}

			x++;
		}
	}
}