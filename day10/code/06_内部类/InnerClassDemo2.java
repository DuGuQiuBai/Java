/*
	举例：身体和心脏。

	class Body {
		private class Heart {
			public void operator() {
				System.out.println("心脏搭桥");
			}
		}

		public void method() {
			if(如果你是医生){
				Heart h = new Heart();
				h.operator();
			}
		}
	}

	Body.Heart bh = new Body().new Heart();
	bh.operator();

	为了不让外界直接访问心脏对象，所以，我们把内部类用private修饰。
	这个时候，又不能做手术了，那么，到底该怎么解决呢?
	我们就可以在外部类中定义一个功能：
	现在如何使用呢?
		Body b = new Body();
		b.method();
		

	成员内部类：
		private：为了数据的安全性
		static：为了让数据访问更方便

*/
/*
class Outer {
	private class Inner {
		public void show() {
			System.out.println("show");
		}
	} 

	public void method() {
		Inner i = new Inner();
		i.show();
	}
}
*/

class Outer {
	//int num  = 10;
	//static int num2 = 20;

	public static class Inner {
		public void show() {
			System.out.println("show");
			//System.out.println(num);
			//System.out.println(num2);
		}

		public static void show2() {
			System.out.println("show2");
			//System.out.println(num);
			//System.out.println(num2);
		}
	}
}

class InnerClassDemo2 {
	public static void main(String[] args) {
		//错误
		//Outer.Inner oi = new Outer().new Inner();
	
		//用private修饰
		//Outer o = new Outer();
		//o.method();

		//用static修饰后，这种写法错误
		//Outer.Inner oi = new Outer().new Inner();
		//用类名限定
		Outer.Inner oi = new Outer.Inner();
		oi.show();
		oi.show2();

		//Outer.Inner.show2();
	}
}
