package com.server;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ServerFrame extends JFrame implements ActionListener {
	
	private JButton jbt_start;
	private JButton jbt_stop;
	private JButton jbt_exit;
	private JTextArea jta_disMess;
	private JList jlt_disUsers;
	
	private Server server;
	
	public List<String> online_usernames;
	public List<Integer> online_usernameids;
	public ServerFrame(Server server) {
		this.server = server;
		online_usernames = new ArrayList<String>();
		online_usernameids = new ArrayList<Integer>();
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
		setTitle("\u670D\u52A1\u5668");
		setIconImage(Toolkit.getDefaultToolkit().getImage("Images/socket.jpg"));
		setSize(449, 301);
		setResizable(false);
		WinCenter.center(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				jbt_exit.doClick();
			}
		});
		getContentPane().setLayout(null);
		
		jbt_start = new JButton("\u542F\u52A8\u670D\u52A1\u5668");
		jbt_start.setBounds(32, 23, 103, 34);
		jbt_start.addActionListener(this);
		getContentPane().add(jbt_start);
		
		jbt_stop = new JButton("\u505C\u6B62\u670D\u52A1\u5668");
		jbt_stop.setBounds(145, 23, 103, 34);
		jbt_stop.setEnabled(false);
		jbt_stop.addActionListener(this);
		getContentPane().add(jbt_stop);
		
		jbt_exit = new JButton("\u9000\u51FA\u670D\u52A1\u5668");
		jbt_exit.setBounds(258, 23, 103, 34);
		jbt_exit.addActionListener(this);
		getContentPane().add(jbt_exit);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 64, 221, 192);
		scrollPane.setWheelScrollingEnabled(true);
		scrollPane.setBorder(BorderFactory.createTitledBorder("聊天消息"));
		getContentPane().add(scrollPane);
		
		jta_disMess = new JTextArea();
		scrollPane.setViewportView(jta_disMess);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(258, 65, 157, 191);
		scrollPane_1.setBorder(BorderFactory.createTitledBorder("在线用户"));
		getContentPane().add(scrollPane_1);
		
		jlt_disUsers = new JList();
		jlt_disUsers.setVisibleRowCount(4);
		scrollPane_1.setViewportView(jlt_disUsers);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == jbt_start){
			jbt_start.setEnabled(false);
			jbt_stop.setEnabled(true);
			server.startServer();
		}
		if(arg0.getSource() == jbt_stop){
			int flag = JOptionPane.showConfirmDialog(this, "是否要停止服务器？", "", 
            		JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(flag == JOptionPane.OK_OPTION){
            	server.stopServer();
            	jbt_start.setEnabled(true);
            	jbt_stop.setEnabled(false);
            }
		}
		if(arg0.getSource() == jbt_exit){
			if(jbt_stop.isEnabled()){
				jbt_stop.doClick();
			}
			server.close();
		}
	}

	public void setDisUsers(String userNames) {
		if(userNames.equals("@userlist")){
			jlt_disUsers.removeAll();
			String[] user_null = new String[]{};
			jlt_disUsers.setListData(user_null);
		}else{
			if(userNames.contains("@userlist")){
				String[] dis = userNames.split("@userlist");
				String [] disUsernames = new String[dis.length / 2];
				int j = 0;
				for(int i = 0; i < dis.length; i++){
					disUsernames[j++] = dis[i++];
				}
				jlt_disUsers.removeAll();
				jlt_disUsers.setListData(disUsernames);
			}
			if(userNames.contains("@exit")){
				String[] dis = {};
				jlt_disUsers.setListData(dis);
			}
		}
	}

	public void setDisMess(String message) {
		if(message.contains("@chat")){
			int local = message.indexOf("@chat");
			jta_disMess.append(message.substring(0, local) + "\n");
			jta_disMess.setCaretPosition(jta_disMess.getText().length());
		}
		if(message.contains("@exit")){
			jta_disMess.setText("");
		}
	}

	public void setStartAndStopUnable() {
		JOptionPane.showMessageDialog(this, "不能同时开启两个服务器");
		jbt_start.setEnabled(false);
		jbt_stop.setEnabled(false);
	}
}
