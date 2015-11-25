package cn.itcast_01;

/*
 * 异常：程序在运行的过程中，出现了不正常的情况。
 * 举例：
 * 		班长骑着自行车去旅游
 * 		一开始就要检查的：漏气了，链子掉了
 * 		发现没有问题，就上路，一路顺风。
 * 		山路，中间很铺好的水泥路，两边有尖尖小石子，
 * 		如果，他正常的话，走水泥路就好了，肯定是没有任何问题的，
 * 		但是呢，他偏偏不走寻常路，走上小石子，车爆胎了。
 * 		他怕爆胎没走石子路，走的是水泥路，但是走到一半，发现山路塌陷了，班长只好回来了。
 * 分类：
 * 		错误	Error	合理的应用程序不应该试图捕获的严重问题。说明我们不需要处理这种问题，比如说内存溢出。
 * 		异常	Exception	合理的应用程序想要捕获的条件，说明是需要我们进行处理的。
 * 			编译时期异常	非RuntimeException	这是我们必须要处理的异常。
 * 			运行时期异常	RuntimeException	这种异常，一般我们也是不需要处理的。一般出现这样的问题，应该是我们写的代码出问题了。
 * 
 * JVM的默认处理方案:
 * 		程序出现了异常，如果我们没有做任何处理，jvm做出了默认的处理。
 * 		把异常的类名，产生的原因以及出现的位置等信息显示在了控制台。
 * 		并让程序从这里结束了。
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("hello");

		int a = 10;
		// int b = 4;
		int b = 0; // java.lang.ArithmeticException: / by zero
		System.out.println(a / b);

		System.out.println("world");
	}
}