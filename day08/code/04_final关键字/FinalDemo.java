/*
	很多时候，我们可能不想让子类修改我的内容。这个时候该怎么半呢?
	针对这种情况，java又提供了一个状态修饰符：final。

	final:最终的意思。

	作用：
		可以修饰类，成员变量，成员方法。

	特点：
		类：类被final修饰，说明该类是最终类，不能被继承。
		成员变量：变量被final修饰后，就变成了常量。值不能被修改。
		成员方法：方法不能被子类重写。
*/
final class Fu {
	public int num = 10;
	public final int num2 = 20;

	public final void getResource() {
		System.out.println("这里是绝密的资源,可以看,不可以改");
	}
	
	public void show() {
		num = 100;
		System.out.println(num);
		//num2 = 200;
		System.out.println(num2);
	}
}

class Zi extends Fu {
	/*
	public void getResource() {
		System.out.println("这里我想干什么就干什么");
	}
	*/
}

class FinalDemo {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.getResource();
		z.show();
	}
}