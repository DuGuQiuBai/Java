package cn.itcast_07;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 一级菜单
 */
public class MenuDemo {
	public static void main(String[] args) {
		// 创建窗体对象
		final Frame f = new Frame("一级菜单");
		// 设置窗体属性
		f.setBounds(500, 250, 400, 300);

		// 创建菜单栏
		MenuBar mb = new MenuBar();
		// 创建菜单
		Menu m = new Menu("文件");
		// 创建菜单项
		MenuItem mi = new MenuItem("退出系统");

		// 菜单本身组合
		m.add(mi);
		mb.add(m);

		// 添加到窗体
		f.setMenuBar(mb);

		// 注册事件
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		mi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true);
	}
}
