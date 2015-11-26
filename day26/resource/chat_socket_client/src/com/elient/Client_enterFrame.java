package com.elient;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.Inet4Address;
import java.net.UnknownHostException;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Client_enterFrame extends JFrame implements ActionListener, KeyListener{
	public Client_enterFrame(Client client) {
		this.client = client;
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}
		setIconImage(Toolkit.getDefaultToolkit().getImage("Images/socket.jpg"));
		setTitle("\u804A\u5929\u5BA4");
		getContentPane().setLayout(null);
		setSize(296, 249);
		WinCenter.center(this);
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				jbt_exit.doClick();
			}
		});
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel.setBounds(23, 30, 81, 34);
		getContentPane().add(lblNewLabel);
		
		jtf_username = new JTextField();
		jtf_username.addKeyListener(this);
		jtf_username.setBounds(114, 30, 143, 34);
		getContentPane().add(jtf_username);
		jtf_username.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u670D\u52A1\u5668\u5730\u5740");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(23, 74, 81, 34);
		getContentPane().add(lblNewLabel_1);
		
		jtf_hostIp = new JTextField();
		jtf_hostIp.setBounds(114, 74, 143, 34);
		jtf_hostIp.addKeyListener(this);
		getContentPane().add(jtf_hostIp);
		try {
			String ip = (String)Inet4Address.getLocalHost().getHostAddress();
			jtf_hostIp.setText(ip);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		jtf_hostIp.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u7AEF\u53E3\u53F7");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(23, 118, 81, 34);
		getContentPane().add(lblNewLabel_2);
		
		jtf_hostPort = new JTextField();
		jtf_hostPort.addKeyListener(this);
		jtf_hostPort.setBounds(114, 118, 143, 34);
		getContentPane().add(jtf_hostPort);
		jtf_hostPort.setText("5000");
		jtf_hostPort.setColumns(10);
		
		jbt_enter = new JButton("\u8FDB\u5165\u804A\u5929\u5BA4");
		jbt_enter.addActionListener(this);
		jbt_enter.addKeyListener(this);
		jbt_enter.setFont(new Font("宋体", Font.PLAIN, 14));
		jbt_enter.setBounds(23, 162, 108, 39);
		getContentPane().add(jbt_enter);
		
		jbt_exit = new JButton("\u9000\u51FA\u804A\u5929\u5BA4");
		jbt_exit.setFont(new Font("宋体", Font.PLAIN, 14));
		jbt_exit.setBounds(144, 162, 113, 39);
		jbt_exit.addActionListener(this);
		getContentPane().add(jbt_exit);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField jtf_username;
	private JTextField jtf_hostIp;
	private JTextField jtf_hostPort;
	private JButton jbt_enter;
	private JButton jbt_exit;
	private Client client;


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jbt_exit){
			setVisible(false);
			client.exitLogin();
		}
		if(e.getSource() == jbt_enter){
			String username = jtf_username.getText();
			username.trim();
			String hostIp = jtf_hostIp.getText();
			hostIp.trim();
			String hostPort = jtf_hostPort.getText();
			hostPort.trim();
			if(!username.equals("")){
				if(!hostIp.equals("")){
					if(!hostPort.equals("")){
						String login_mess = client.login(username, hostIp, hostPort);
						if(login_mess.equals("true")){
							this.setVisible(false);
							client.showChatFrame(username);
						}else{
							JOptionPane.showMessageDialog(this, login_mess);
						}
					}else{
						JOptionPane.showMessageDialog(this, "服务器连接端口号不能为空！");
					}
				}else{
					JOptionPane.showMessageDialog(this, "服务器地址不能为空！");
				}
			}else{
				JOptionPane.showMessageDialog(this, "用户名不能为空！");
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if(arg0.getKeyCode() == KeyEvent.VK_ENTER){
			jbt_enter.doClick();
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {}

	@Override
	public void keyTyped(KeyEvent arg0) {}
}
