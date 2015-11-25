class ForTest {
	public static void main(String[] args) {
		//请在控制台输出数据1-10
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		System.out.println("------------");

		for(int x=0; x<10; x++) {
			System.out.println(x+1);	
		}
		System.out.println("------------");

		for(int x=1; x<=10; x++) {
			System.out.println(x);	
		}
		System.out.println("------------");

		for(int x=10; x>0; x--) {
			System.out.println(x);	
		}
		System.out.println("------------");
	}
}
