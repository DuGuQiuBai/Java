/*
	final的初始化时机：
		A:在定义的时候立即给值。以后在也不能改了。
		B:在定义后，构造方法结束前赋值都可以。
*/
class Demo {
	int num;
	//final int num2 = 0;
	final int num2 = 0;

	
	static {
		num2 = 10;
	}
	

	/*
	{
		num2 = 20;
	}
	*/

	public Demo() {
		//num2 = 100;
	}
}

class FinalDemo3 {
	public static void main(String[] args) {
		Demo d =  new Demo();
		System.out.println(d.num);
		System.out.println(d.num2);
	}
}
