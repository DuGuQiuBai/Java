package cn.itcast_05;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
 * 通过观察我们知道我们要做的东西是1个窗体，4个按钮
 */
public class MouseDemo {
	public static void main(String[] args) {
		// 创建窗体对象
		final Frame f = new Frame("更改背景色");
		// 设置窗体属性
		f.setBounds(500, 250, 400, 300);
		// 设置布局
		f.setLayout(new FlowLayout());

		// 创建按钮
		Button redButton = new Button("红色");
		Button greenButton = new Button("绿色");
		Button blueButton = new Button("蓝色");
		Button whiteButton = new Button("复原");

		// 添加到窗体
		f.add(redButton);
		f.add(greenButton);
		f.add(blueButton);
		f.add(whiteButton);

		// 注册事件
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// redButton

		// 动作事件
		// redButton.addActionListener(new ActionListener() {
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// // public void setBackground(Color c)
		// f.setBackground(Color.RED);
		// }
		// });

		// 点击事件
		// redButton.addMouseListener(new MouseAdapter() {
		// @Override
		// public void mouseClicked(MouseEvent e) {
		// f.setBackground(Color.RED);
		// }
		// });

		redButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				f.setBackground(Color.RED);
			}
		});

		redButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				f.setBackground(Color.WHITE);
			}
		});

		// 设置窗体可见
		f.setVisible(true);

	}
}
