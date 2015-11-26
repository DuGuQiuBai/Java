package com.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ClientThread extends Thread {

	public Socket clientSocket;
	public ServerThread serverThread;
	public DataInputStream dis;
	public DataOutputStream dos;
	public String client_userID;
	private boolean flag_exit = false;
	public ClientThread(Socket socket, ServerThread serverThread){
		clientSocket = socket;
		this.serverThread = serverThread;
		try {
			dis = new DataInputStream(clientSocket.getInputStream());
			dos = new DataOutputStream(clientSocket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		while(flag_exit){
			try {
				String Message = dis.readUTF();
				if(Message.contains("@login")){
					String [] userInfo = Message.split("@login");
					int userID = Integer.parseInt(userInfo[1]);
					serverThread.users.remove(userID);
					if(serverThread.users.containsValue(userInfo[0])){
						for(int i = 0; i < serverThread.clients.size(); i++){
							int id = (int)serverThread.clients.get(i).getId();
							if(serverThread.users.get(id).equals(userInfo[0])){
								serverThread.users.remove(id);
								serverThread.users.put(id, userInfo[0] + "_" + id);
								break;
							}
						}
						serverThread.users.put(Integer.parseInt(userInfo[1]), userInfo[0] + "_" + userInfo[1]);
					}else{
						serverThread.users.put(userID, userInfo[0]);
					}
					
					Message = null;
					StringBuffer sb = new StringBuffer();
					synchronized (serverThread.clients) {
						for(int i = 0; i < serverThread.clients.size(); i++){
							int threadID = (int) serverThread.clients.elementAt(i).getId();
							sb.append((String)serverThread.users.get(new Integer(threadID)) + "@userlist");
							sb.append(threadID + "@userlist");
						}
					}
					String userNames = new String(sb);
					serverThread.serverFrame.setDisUsers(userNames);
					Message = userNames;
				}else{
					if(Message.contains("@exit")){
						String [] userInfo = Message.split("@exit");
						int userID = Integer.parseInt(userInfo[1]);
						serverThread.users.remove(userID);
						Message = null;
						StringBuffer sb = new StringBuffer();
						synchronized (serverThread.clients) {
							for(int i = 0; i < serverThread.clients.size(); i++){
								int threadID = (int) serverThread.clients.elementAt(i).getId();
								if(userID == threadID){
									serverThread.clients.removeElementAt(i);
									i--;
								}else{
									sb.append((String)serverThread.users.get(new Integer(threadID)) + "@userlist");
									sb.append(threadID + "@userlist");
								}
							}
						}
						String userNames = new String(sb);
						if(userNames.equals("")){
							serverThread.serverFrame.setDisUsers("@userlist");
						}else{
							serverThread.serverFrame.setDisUsers(userNames);
						}
						Message = userNames;
					}else{
						if(Message.contains("@chat")){
							String[] chat = Message.split("@chat");
							StringBuffer sb = new StringBuffer();
							SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
							String date = form.format(new Date());
							sb.append(chat[0] + "  " + date + "\n");
							sb.append(chat[2] + "@chat");
							String str = new String(sb);
							Message = str;
							serverThread.serverFrame.setDisMess(Message);
						}else{
							if(Message.contains("@single")){
								
							}
						}
					}
				}
				synchronized (serverThread.messages) {
					if(Message != null){
						serverThread.messages.addElement(Message);
					}
				}
				if(Message.contains("@exit")){
					this.clientSocket.close();
					flag_exit = false;
				}
			} catch (IOException e) {}
		}
	}

	public void closeClienthread(ClientThread clientThread) {
		if(clientThread.clientSocket != null){
			try {
				clientThread.clientSocket.close();
			} catch (IOException e) {
				System.out.println("server's clientSocket is null");
			}
		}
		
		try {
			setFlag_exit(false);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public void setFlag_exit(boolean b) {
		flag_exit = b;
	}
}
