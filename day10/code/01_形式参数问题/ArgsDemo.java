//形式参数如果是基本类型，只需要传递该基本类型的值即可。
class Demo {
	public int sum(int a,int b) {
		return a + b;
	}
}

class ArgsDemo {
	public static void main(String[] args) {
		Demo d = new Demo();

		//变量
		int x = 10;
		int y = 20;
		int z = d.sum(x,y);

		//常量
		int a = d.sum(10,20);

		System.out.println(z);
		System.out.println(a);
	}
}