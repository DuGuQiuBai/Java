/*
	局部内部类：
		A:可以直接访问外部类的成员
		B:可以创建内部类对象，通过对象调用内部类方法，来使用局部内部类功能

	面试题：
		局部内部类访问局部变量为什么需要被final修饰?
			因为局部变量会随着方法的调用完毕而消失，
			这个时候，局部对象并没有立马从堆内存中消失，
			还要使用那个变量。为了让数据还能继续被使用，
			就用fianl修饰，这样，在堆内存里面存储的其实是一个常量值。
*/
class Outer {
	//private int num = 100;
		
	public void method() {
		final int num = 100;

		class Inner {
			public void show() {
				System.out.println(num);
			}
		}

		Inner i = new Inner();
		i.show();
	}
}

class InnerClassDemo3 {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}