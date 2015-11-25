/*
	三种循环的区别：
		A:do…while循环至少会执行一次循环体。
		B:for循环和while循环只有在条件成立的时候才会去执行循环体。

	注意事项：
		A:写程序优先考虑for循环，再考虑while循环，最后考虑do…while循环。
		B:最简单的死循环代码
			for(;;){}
		
*/
class DoWhileTest {
	public static void main(String[] args) {
		/*
		for(int x = 10; x>20; x++) {
			System.out.println("hello");
		}

		int y = 10;
		while(y>20){
			System.out.println("world");
			y++;
		}

		int z = 10;
		do{
			System.out.println("java");
			z++;
		}while(z>20);
		*/
	
		/*
		for(;;){
			System.out.println("haha");
		}
		*/

		while(true) {
			System.out.println("haha");
		}
	}
}
