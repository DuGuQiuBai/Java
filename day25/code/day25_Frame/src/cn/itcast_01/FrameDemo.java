package cn.itcast_01;

import java.awt.Frame;

/*
 * Component：组件，就是一个对象。
 * 		基本组件	一个具有独立功能的组件，但是要依赖于容器组件存在
 * 		容器组件	可以存储基本组件和容器组件的组件
 * 通过观察它的继承体系图，我们如果按照以前的学习方式，学习顶层，太麻烦了。
 * 所以，我们今天直接上手Frame即可。
 * 
 * 构造方法：
 * 		public Frame()
 * 
 * 通过观察，我们知道了这样的两个小问题
 * 		A:窗体在内存中存在了，只不过我们没有看到。
 * 		B:创建的存在也是开启了线程的。
 */
public class FrameDemo {
	public static void main(String[] args) {
		// 创建窗体对象
		Frame f = new Frame();

		// 设置标题
		f.setTitle("百度一下,你就知道");
		// 设置窗体大小
		f.setSize(400, 300);
		// 设置窗体可见
		f.setVisible(true);

		// 设置位置
		f.setLocation(500, 200);

		// f.show();
		// System.out.println("over");
	}
}
