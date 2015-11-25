/*
	do...while格式：
		do {
			语句体;
		}while(条件表达式);

	变形格式：
		初始化语句;
		do {
			循环体语句;
			控制条件语句;
		}while(判断条件语句);
		
		
		for(初始化语句;判断条件语句;控制条件语句) {
			 循环体语句;
		}
*/
class DoWhileDemo {
	public static void main(String[] args) {
		/*
		int sum = 0;
		for(int x=1; x<=100; x++) {
			sum+=x;
		}
		System.out.println(sum);
		*/

		//do...while
		int sum = 0;
		int x = 1;
		do{
			sum+=x;
			x++;
		}while (x<=100);
		System.out.println(sum);
	}
}