package com.server;



public class Server {
	
	private ServerFrame serverFrame;
	private ServerThread serverThread;
	
	public ServerFrame getServerFrame() {
		return serverFrame;
	}

	public void setServerFrame(ServerFrame serverFrame) {
		this.serverFrame = serverFrame;
	}

	public Server(){}
	
	public void startServer() {
		try{
			serverThread = new ServerThread(serverFrame);
		}catch(Exception e){
			System.exit(0);
		}
		serverThread.setFlag_exit(true);
		serverThread.start();
	}

	public void stopServer(){
		synchronized (serverThread.messages) {
			String str = "@serverexit";
			serverThread.messages.add(str);
		}
		serverThread.serverFrame.setDisMess("@exit");
		serverThread.serverFrame.setDisUsers("@exit");
		serverThread.stopServer();
	}

	

	public static void main(String[] args) {
		Server server = new Server();
		ServerFrame serverFrame = new ServerFrame(server);
		server.setServerFrame(serverFrame);
		serverFrame.setVisible(true);
	}

	public void close() {
		if(serverThread != null){
			if(serverThread.isAlive()){
				serverThread.stopServer();
			}
		}
		System.exit(0);
	}
	
}
