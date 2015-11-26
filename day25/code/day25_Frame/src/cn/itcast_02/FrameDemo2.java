package cn.itcast_02;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/*
 * 用适配器类改进程序。
 * 
 * 场景：
 * 		 不是所有的事件都需要适配器类。
 * 		举例：一个事件接口中只有一个方法。
 */
public class FrameDemo2 {
	public static void main(String[] args) {
		// 创建窗体
		Frame f = new Frame();

		// 设置窗体属性
		f.setTitle("窗体关闭");
		f.setSize(400, 200);
		f.setLocation(500, 250);

		// 注册事件
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// 设置窗体可见
		f.setVisible(true);
	}
}
