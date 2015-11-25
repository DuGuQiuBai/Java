package cn.itcast.dao;

import cn.itcast.pojo.User;

/**
 * 操作用户的接口
 * 
 * @author fqy
 * @version V1.0
 */
public interface UserDao {
	/**
	 * 这是用户登录功能
	 * 
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 * @return 登录是否成功
	 */
	public abstract boolean isLogin(String username, String password);

	// 按说，注册也应该返回boolean类型，但是我们的List体系的集合，添加元素永远返回true，所以呢，我就返回void类型
	// 按照我们正常的想法，好像觉得也应该是用户名和密码，但是呢?这里我传递一个用户对象。这个对象包含了用户名和密码。
	// 如果一个方法的参数多于3个的时候，建议传递对象。
	/**
	 * 这是用户注册功能
	 * 
	 * @param user
	 *            用户对象
	 */
	public abstract void regist(User user);
}
