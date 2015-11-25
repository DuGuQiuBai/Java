/*
按照要求，补齐代码
	interface Inter { void show(); }
	class Outer { //补齐代码 }
	class OuterDemo {
	    public static void main(String[] args) {
		      Outer.method().show();
		  }
	}
要求在控制台输出”HelloWorld”
*/
interface Inter { void show(); }

class Outer { 
	//补齐代码
	public static Inter method() {
		return new Inter() {
			public void show() {
				System.out.println("HelloWorld");
			}
		};
	}
}

class OuterDemo {
	public static void main(String[] args) {
		Outer.method().show();
		/*
			Outer.method():类名能够直接调用方法，说明该方法是静态的。
			Outer.method().show():这种用法叫链式编程，调用show()方法之前的内容应该是一个对象
		*/
	}
}