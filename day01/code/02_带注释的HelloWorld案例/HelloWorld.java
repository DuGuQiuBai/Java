/*
	需求：我要完成HelloWorld案例

	分析：
		A:java语言最基本的单位是类，所以我们首先要定义一个类
		B:java程序要想能够独立运行，必须有主方法
		C:如果想要程序有输出，必须有输出语句

	步骤：
		A:定义类的格式
			class 类名 {
				//类体
			}
		B:主方法的格式
			public static void main(String[] args) {
				//方法体
			}
		C:输出语句的格式
			System.out.println("这里的内容是可以改");

	最后把我们的思想用代码给体现出来
*/
//这是我的带注释的HelloWorld案例
//class用来定义类
class HelloWorld {
	/*
		这是main方法
		main方法是程序的入口
		jvm会自动调用main方法
	*/
	public static void main(String[] args) {
		//这是输出语句
		System.out.println("HelloWorld");
	}
}