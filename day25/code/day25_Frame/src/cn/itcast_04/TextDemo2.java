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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 通过观察图，我们分析知道应该有如下的几个组件：
 * 窗体，文本框，按钮，文本域
 * 并且对窗体和按钮添加事件
 */
public class TextDemo2 {
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
		Button bu = new Button("写到文本文件");
		Button bu2 = new Button("读取文本文件");
		// 创建文本域
		final TextArea ta = new TextArea(10, 40);

		// 添加到窗体
		f.add(tf);
		f.add(bu);
		f.add(bu2);
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

				// 写到文本文件
				BufferedWriter bw = null;
				try {
					bw = new BufferedWriter(new FileWriter("bw.txt", true));
					bw.write(tf_str);
					bw.newLine();
					bw.flush();
				} catch (IOException e1) {
					e1.printStackTrace();
				} finally {
					if (bw != null) {
						try {
							bw.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}
			}
		});

		bu2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");

				BufferedReader br = null;
				try {
					br = new BufferedReader(new FileReader("bw.txt"));
					String line = null;
					while ((line = br.readLine()) != null) {
						ta.append(line + "\n");
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				} finally {
					if (br != null) {
						try {
							br.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}
			}
		});

		// 设置窗体可见
		f.setVisible(true);
	}
}
