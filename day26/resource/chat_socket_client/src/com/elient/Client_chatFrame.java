package com.elient;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Client_chatFrame extends JFrame implements ActionListener,
		KeyListener, ListSelectionListener {
	public Client_chatFrame(Client client, String title) {
		this.client = client;
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		setIconImage(Toolkit.getDefaultToolkit().getImage("Images/socket.jpg"));
		setTitle("\u804A\u5929\u5BA4" + "  " + title);
		setSize(450, 325);
		WinCenter.center(this);
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				jbt_exit.doClick();
			}
		});
		getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(BorderFactory.createTitledBorder("聊天消息"));
		scrollPane.setBounds(10, 10, 283, 167);
		scrollPane.setWheelScrollingEnabled(true);
		getContentPane().add(scrollPane);

		jta_disMess = new JTextArea();
		jta_disMess.setEditable(false);
		scrollPane.setViewportView(jta_disMess);

		jtf_inputMess = new JTextField();
		jtf_inputMess.addKeyListener(this);
		jtf_inputMess.setBounds(10, 242, 192, 32);
		getContentPane().add(jtf_inputMess);
		jtf_inputMess.setColumns(10);

		jbt_trans = new JButton("\u53D1  \u9001");
		jbt_trans.setFont(new Font("宋体", Font.PLAIN, 14));
		jbt_trans.setBounds(212, 241, 93, 32);
		jbt_trans.addActionListener(this);
		getContentPane().add(jbt_trans);

		jbt_clear = new JButton("\u6E05\u9664\u804A\u5929\u8BB0\u5F55");
		jbt_clear.setFont(new Font("宋体", Font.PLAIN, 14));
		jbt_clear.setBounds(158, 187, 135, 37);
		jbt_clear.addActionListener(this);
		getContentPane().add(jbt_clear);

		jbt_exit = new JButton("\u9000\u51FA\u804A\u5929\u5BA4");
		jbt_exit.setFont(new Font("宋体", Font.PLAIN, 14));
		jbt_exit.setBounds(20, 189, 128, 37);
		jbt_exit.addActionListener(this);
		getContentPane().add(jbt_exit);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(BorderFactory.createTitledBorder("在线用户"));
		scrollPane_1.setBounds(303, 10, 128, 214);
		getContentPane().add(scrollPane_1);

		jlt_disUsers = new JList();
		jlt_disUsers.setVisibleRowCount(4);
		jlt_disUsers.setSelectedIndex(0);
		jlt_disUsers
				.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		jlt_disUsers.addListSelectionListener(this);
		scrollPane_1.setViewportView(jlt_disUsers);

		jbt_singlChat = new JButton("\u5355\u4EBA\u804A\u5929");
		jbt_singlChat.setBounds(315, 241, 116, 32);
		jbt_singlChat.addActionListener(this);
		getContentPane().add(jbt_singlChat);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField jtf_inputMess;
	private JTextArea jta_disMess;
	private JButton jbt_trans;
	private JButton jbt_clear;
	private JButton jbt_exit;
	private JList jlt_disUsers;
	private JButton jbt_singlChat;
	private JScrollPane scrollPane_1;
	private Client client;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbt_clear) {
			jta_disMess.setText("");
		}
		if (e.getSource() == jbt_trans) {
			String mess = jtf_inputMess.getText();
			mess.trim();
			jtf_inputMess.setText("");
			if (mess.equals("")) {
				JOptionPane.showMessageDialog(this, "不能发送空消息");
				jtf_inputMess.setText("");
			} else {
				client.transMess(mess);
			}
		}
		if (e.getSource() == jbt_exit) {
			if (JOptionPane.OK_OPTION == JOptionPane.showConfirmDialog(this,
					"是否确定要退出聊天室？", "提示", JOptionPane.OK_CANCEL_OPTION)) {
				this.setVisible(false);
				client.exitChat();
				System.exit(0);
			}
		}
		if (e.getSource() == jbt_singlChat) {
			String user_names = (String) jlt_disUsers.getSelectedValue();
			if (user_names == null) {
				JOptionPane.showMessageDialog(this, "您未选择聊天对象\n请选择要单独聊天的对象");
			} else {
				if (!client.c_singleFrames.containsKey(user_names)) {
					createSingleChatFrame(user_names);
				} else {
					client.c_singleFrames.get(user_names)
							.setFocusableWindowState(true);
				}
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
			if (arg0.getSource() == jtf_inputMess) {
				jbt_trans.doClick();
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}

	public void setDisMess(String substring) {
		int local = substring.indexOf("@chat");
		jta_disMess.append(substring.substring(0, local) + "\n");
		jta_disMess.setCaretPosition(jta_disMess.getText().length());
	}

	public void setDisUsers(String chat_re) {
		String[] infos = chat_re.split("@userlist");
		String[] info = new String[infos.length / 2];
		for (int i = 1; i < infos.length; i++) {
			int id_user = 0;
			try {
				id_user = Integer.parseInt(infos[i]);
				if (client.getThreadID() == id_user) {
					if (!client.username.equals(infos[i - 1])) {
						JOptionPane.showMessageDialog(this,
								"由于有同名的用户登录，所以您的用户名后面加上了编号");
						client.username = infos[i - 1];
						this.setTitle("聊天室    " + client.username);
						break;
					} else {
						break;
					}
				} else {
					i++;
				}
			} catch (Exception e) {
			}
		}
		if (infos.length == 2) {
			String[] s = new String[] {};
			if (!client.c_singleFrames.isEmpty()) {
				ListModel list = jlt_disUsers.getModel();
				for (int i = 0; i < list.getSize(); i++) {
					if (client.c_singleFrames.get(list.getElementAt(i)) != null) {
						client.c_singleFrames.get(list.getElementAt(i))
								.setExitNotify();
					}
				}
			}
			jlt_disUsers.removeAll();
			jlt_disUsers.setListData(s);
		} else {
			if ((infos.length / 2 - 1) < client.username_online.size()) {
				// 有人下线
				List<String> rec = new ArrayList<String>();
				int i = 0;
				for (; i < infos.length; i++) {
					rec.add(0, infos[i++]);
				}
				for (i = 0; i < client.username_online.size(); i++) {
					if (!rec.contains(client.username_online.get(i))) {
						break;
					}
				}
				String name = client.username_online.get(i);
				client.username_online.remove(i);
				try {
					client.clientuserid.remove(i);
				} catch (Exception e) {
					e.printStackTrace();
				}

				if (client.c_singleFrames.containsKey(name)) {
					client.c_singleFrames.get(name).closeSingleFrame();
					client.c_singleFrames.remove(name);
				}
			} else {
				List<Integer> online = new ArrayList<Integer>();
				for (int i = 0; i < client.username_online.size(); i++) {
					online.add(0, client.clientuserid.get(i));
				}
				if (online.isEmpty()) {
					for (int i = 1; i < infos.length; i++) {
						if ((int) Integer.parseInt(infos[i]) != client
								.getThreadID()) {
							client.username_online.add(0, infos[i - 1]);
							client.clientuserid.add(0,
									Integer.parseInt(infos[i]));
						}
						i++;
					}
				} else {
					for (int i = 1; i < infos.length; i++) {
						if (Integer.parseInt(infos[i]) != client.getThreadID()) {
							if (!online.contains(Integer.parseInt(infos[i]))) {
								client.username_online.add(0, infos[i - 1]);
								client.clientuserid.add(0,
										Integer.parseInt(infos[i]));
							} else {
								String name = client.username_online
										.get(client.clientuserid
												.indexOf(Integer
														.parseInt(infos[i])));
								if (!name.equals(infos[i - 1])) {
									if (client.c_singleFrames.containsKey(name)) {
										Client_singleFrame cf = client.c_singleFrames
												.get(name);
										cf.setTitle(name);
										client.c_singleFrames.remove(name);
										client.c_singleFrames.put(name, cf);
										cf.setVisible(false);

									}
									client.username_online.remove(name);
									client.clientuserid.remove(new Integer(
											Integer.parseInt(infos[i])));
									client.username_online.add(0, infos[i - 1]);
									client.clientuserid.add(0,
											Integer.parseInt(infos[i]));
								}
							}
						}
						i++;
					}
				}

			}
			try {
				for (int i = 0; i < client.username_online.size(); i++) {
					info[i] = client.username_online.get(i);
				}

			} catch (Exception e) {
			}
			jlt_disUsers.removeAll();
			jlt_disUsers.setListData(info);
		}
	}

	public void closeClient() {
		JOptionPane.showMessageDialog(this, "服务器已关闭", "提示",
				JOptionPane.OK_OPTION);
		client.exitClient();
		setVisible(false);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		if (e.getSource() == jlt_disUsers) {
		}
	}

	public void createSingleChatFrame(String name) {
		Client_singleFrame c_singlFrame = new Client_singleFrame(client, name);
		client.c_singleFrames.put(name, c_singlFrame);
		try {
			c_singlFrame.userThreadID = client.clientuserid
					.get(client.username_online.indexOf(name));
		} catch (Exception e) {
		}

		c_singlFrame.setVisible(true);
	}

	public void setSingleFrame(String chat_re) {
		String[] infos = chat_re.split("@single");
		try {
			if (client.c_singleFrames.containsKey(infos[0])) {
				client.c_singleFrames.get(infos[0]).setDisMess(infos[3]);
			} else {
				createSingleChatFrame(infos[0]);
				client.c_singleFrames.get(infos[0]).setDisMess(infos[3]);
			}
		} catch (Exception e) {
		}
	}
}
