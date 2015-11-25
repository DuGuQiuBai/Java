/*
	代码块：在Java中，使用{}括起来的代码被称为代码块。

	根据其位置和声明的不同，可以分为
		局部代码块：在方法中出现；限定变量生命周期，及早释放，提高内存利用率
		构造代码块：在类中方法外出现；
					多个构造方法方法中相同的代码存放到一起，每次调用构造都执行，并且在构造方法前执行
		静态代码块：在类中方法外出现，加了static修饰。
					用于给类进行初始化，在加载的时候就执行，并且只执行一次。
*/
//局部代码块
/*
class Code {
	public void show() {
		//局部代码块
		{
			int x = 10;
			System.out.println(x);
		}

		//System.out.println(x);
		//... 1000行,x在这1000行代码中没有被使用
		int y = 100;
		System.out.println(y);
	}
}
*/

//构造代码块
/*
class Code {

	//构造代码块
	{
		System.out.println("AAAAA"); 
	}

	public Code() {
		//System.out.println("AAAAA"); //假如这个代码的内容比较多，并且在每个构造中都会出现
	}

	public Code(String s) {
		//System.out.println("AAAAA");
		System.out.println(s);
	}
}
*/

//静态代码块
class Code {
	//静态代码块
	static {
		System.out.println("AAAAA"); 
	}

	/*
	public Code() {
	}

	public Code(String s) {
		System.out.println(s);
	}
	*/
}

class CodeDemo {
	static {
		System.out.println("BBBBB"); 
	}

	public static void main(String[] args) {
		Code c = new Code();
		//c.show();

		//Code c2 = new Code("hello");
		System.out.println("CCCCC");
	}
}