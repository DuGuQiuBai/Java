package cn.itcast_03;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 需求：在窗体中添加一个按钮。并对按钮添加事件，没点击一次按钮，控制台输出：你再点试试
 * 
 * 分析：
 * 		A:创建窗体对象
 * 		B:创建按钮对象
 * 		C:把按钮对象添加到窗体对象
 * 		D:让窗体显示
 */
public class ButtonDemo {
	public static void main(String[] args) {
		// 创建窗体对象
		Frame f = new Frame();
		// 设置窗体属性
		f.setTitle("按钮事件");
		f.setBounds(500, 250, 400, 300);
		// 设置布局
		f.setLayout(new FlowLayout());

		// 创建按钮对象
		Button bu = new Button("点我啊");
		// bu.setSize(20, 10);

		// 把按钮添加到窗体
		f.add(bu);

		// 注册事件

		// 注册按钮点击事件
		bu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("你再点试试");
			}
		});

		// 窗体关闭事件
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// 设置窗体显示
		f.setVisible(true);
	}
}
