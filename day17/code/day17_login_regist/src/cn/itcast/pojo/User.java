package cn.itcast.pojo;

/**
 * 用户描述类
 * 
 * @author fqy
 * @version V1.0
 */
public class User {
	// 用户名
	private String username;
	// 密码
	private String password;

	public User() {
		super();
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
