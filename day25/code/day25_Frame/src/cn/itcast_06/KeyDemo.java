package cn.itcast_06;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 一个窗体，一个标签，一个文本框
 */
public class KeyDemo {
	public static void main(String[] args) {
		// 创建窗体对象
		final Frame f = new Frame("键盘事件");
		// 设置窗体属性
		f.setBounds(500, 250, 400, 300);
		// 设置布局
		f.setLayout(new FlowLayout());

		// 创建标签对象
		Label label = new Label("请输入你的qq号码，只能输入数字,不信你试试:");
		// 创建文本框
		TextField tf = new TextField(20);

		// 添加到窗体
		f.add(label);
		f.add(tf);

		// 注册事件
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// public char getKeyChar()
				char ch = e.getKeyChar();
				if (!(ch >= KeyEvent.VK_0 && ch <= KeyEvent.VK_9)) {
					System.out.println("你输入的是：" + ch);
					e.consume();
				}
			}
		});

		// 设置可见
		f.setVisible(true);
	}
}
