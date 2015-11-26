package cn.itcast_04;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 通过观察图，我们分析知道应该有如下的几个组件：
 * 窗体，文本框，按钮，文本域
 * 并且对窗体和按钮添加事件
 */
public class TextDemo {
	public static void main(String[] args) {
		// 创建窗体对象
		Frame f = new Frame("数据转移");
		// 设置窗体属性
		f.setBounds(500, 250, 400, 300);
		// 设置布局
		f.setLayout(new FlowLayout());

		// 创建文本框
		final TextField tf = new TextField(20);
		// 创建按钮
		Button bu = new Button("数据转移");
		// 创建文本域
		final TextArea ta = new TextArea(10, 40);

		// 添加到窗体
		f.add(tf);
		f.add(bu);
		f.add(ta);

		// 注册事件
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// 对bu添加事件
		bu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 获取文本框的值，赋值给文本域
				String tf_str = tf.getText();
				// 清空数据
				tf.setText("");

				// ta.setText(tf_str);
				ta.append(tf_str + "\n");
			}
		});

		// 设置窗体可见
		f.setVisible(true);
	}
}
