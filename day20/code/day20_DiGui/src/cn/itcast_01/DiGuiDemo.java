package cn.itcast_01;

/*
 * 递归:方法定义中调用方法本身的现象
 * 
 * 注意事项：
 * 		A:递归一定要有出口，否则就是死递归
 * 		B:递归的次数不能过多，否则内存溢出
 * 		C:构造方法不能递归使用
 * 
 * StackOverflowError:当应用程序递归太深而发生堆栈溢出时，抛出该错误。 
 * 
 * 举例：
 * 		从前有座山，山上有座庙，庙里有个老和尚，正在给小和尚讲故事，故事是：
 * 			从前有座山，山上有座庙，庙里有个老和尚，正在给小和尚讲故事，故事是：
 * 				从前有座山，山上有座庙，庙里有个老和尚，正在给小和尚讲故事，故事是：
 * 					从前有座山，山上有座庙，庙里有个老和尚，正在给小和尚讲故事，故事是：
 * 						...
 * 
 * 		学java -- 找工作 -- 挣钱 -- 娶媳妇 -- 生娃娃 -- 放羊 -- 挣钱 --
 * 			学java -- 找工作 -- 挣钱 -- 娶媳妇 -- 生娃娃 -- 放羊 -- 挣钱 --
 * 				学java -- 找工作 -- 挣钱 -- 娶媳妇 -- 生娃娃 -- 放羊 -- 挣钱 --
 * 					...
 */
public class DiGuiDemo {
	public void show() {
		show();
	}

	// public DiGuiDemo() {
	// DiGuiDemo();
	// }

	public static void main(String[] args) {
		DiGuiDemo dgd = new DiGuiDemo();
		dgd.show();
	}
}