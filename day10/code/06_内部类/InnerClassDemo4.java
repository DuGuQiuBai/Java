/*
	匿名内部类：没有名字的内部类
	
	前提：存在一个类或者接口
			这里的类可以是具体类也可以是抽象类。

	格式：
		new 类名或者接口名() {
			重写方法;
		}

	本质理解：其本质是匿名子类对象
*/
interface Inter {
	public abstract void show();
	public abstract void show2();
}

class Outer {
	private int num = 100;

	public void method() {
		//一个方法
		/*
		new Inter() {
			public void show() {
				System.out.println("show");
			}
		}.show();
		*/

		
		//两个方法
		/*
		new Inter() {
			public void show() {
				System.out.println("show");
			}

			public void show2() {
				System.out.println("show2");
			}
		}.show();

		new Inter() {
			public void show() {
				System.out.println("show");
			}

			public void show2() {
				System.out.println("show2");
			}
		}.show2();
		*/

		//两个方法
		Inter i = new Inter() {
			public void show() {
				System.out.println("show");
			}

			public void show2() {
				System.out.println("show2");
			}
		};

		i.show();
		i.show2();
	}
}

class InnerClassDemo4 {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}
