/*
	for循环的格式：
		for(初始化语句;判断条件语句;控制条件语句) {
			循环体语句;
		}

		执行流程：
		A:首先执行初始化语句
		B:其次执行判断条件语句，看其返回值
			如果是true，就继续
			如果是false，循环结束
		C:执行循环体语句
		D:执行控制条件语句
		E:回到B
*/
class ForDemo2 {
	public static void main(String[] args) {
		//在控制台输出10次HelloWorld
		for(int x=0; x<10; x++) {
			System.out.println("HelloWorld");
		}	
		System.out.println("--------------");
		
		//初始化不从0开始
		for(int x=1; x<=10; x++) {
			System.out.println("HelloWorld");
		}	

		for(int x=1; x<11; x++) {
			System.out.println("HelloWorld");
		}

		for(int x=10; x>0; x--) {
			System.out.println("HelloWorld");
		}
	}
}
