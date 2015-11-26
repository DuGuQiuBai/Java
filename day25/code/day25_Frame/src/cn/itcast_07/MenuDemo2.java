package cn.itcast_07;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

/*
 * Frame
 * 		MenuBar
 * 			Menu
 * 				Menu
 * 					MenuItem
 * 				MenuItem
 */
public class MenuDemo2 {
	public static void main(String[] args) {
		// 创建窗体对象
		final Frame f = new Frame("多级菜单");
		// 设置窗体属性
		f.setBounds(500, 250, 400, 300);

		// 创建菜单栏
		MenuBar mb = new MenuBar();
		// 创建菜单
		Menu m1 = new Menu("文件");
		Menu m2 = new Menu("更改名称");
		// 创建菜单项
		final MenuItem mi1 = new MenuItem("好好学习");
		final MenuItem mi2 = new MenuItem("天天向上");
		MenuItem mi3 = new MenuItem("恢复标题");
		MenuItem mi4 = new MenuItem("打开记事本");
		MenuItem mi5 = new MenuItem("退出系统");

		// 菜单本身组合
		m2.add(mi1);
		m2.add(mi2);
		m2.add(mi3);

		m1.add(m2);
		m1.add(mi4);
		m1.add(mi5);

		mb.add(m1);

		// 添加到窗体
		f.setMenuBar(mb);

		// 获取以前的标题
		final String title = f.getTitle();

		// 注册事件
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		mi5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		mi4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Runtime r = Runtime.getRuntime();
				try {
					r.exec("notepad");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		mi1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.setTitle(mi1.getLabel());
			}
		});

		mi2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.setTitle(mi2.getLabel());
			}
		});

		mi3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.setTitle(title);
			}
		});

		f.setVisible(true);
	}
}
