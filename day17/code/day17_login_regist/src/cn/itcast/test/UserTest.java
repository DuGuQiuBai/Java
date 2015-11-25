package cn.itcast.test;

import java.util.Scanner;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.game.GuessNumber;
import cn.itcast.pojo.User;

/*
 * 这是测试类
 */
public class UserTest {
	public static void main(String[] args) {
		wc: while (true) {
			// 欢迎界面
			System.out.println("-----------欢迎光临------------");
			System.out.println("1 登录");
			System.out.println("2 注册");
			System.out.println("3 退出");
			System.out.println("请选择：");
			// 键盘录入数据
			Scanner sc = new Scanner(System.in);
			String choiceString = sc.nextLine();

			// 多处使用
			UserDao ud = new UserDaoImpl();

			switch (choiceString) {
			case "1":
				System.out.println("-----------登录界面------------");
				// 键盘录入用户名和密码
				System.out.println("请输入用户名：");
				String username = sc.nextLine();
				System.out.println("请输入密码：");
				String password = sc.nextLine();
				// 调用功能
				// UserDao ud = new UserDaoImpl();
				boolean flag = ud.isLogin(username, password);
				if (flag) {
					System.out.println("登录成功");

					String yn;
					do {
						// 启动游戏
						GuessNumber.start();
						System.out.println("你还要玩吗?是请输入y:");
						yn = sc.nextLine();
					} while ("y".equals(yn));

					// break wc;
				} else {
					System.out.println("登录失败,回到选择界面");
				}
				break;
			case "2":
				System.out.println("-----------注册界面------------");
				// 键盘录入用户名和密码
				System.out.println("请输入用户名：");
				String newUsername = sc.nextLine();
				System.out.println("请输入密码：");
				String newPassword = sc.nextLine();
				// 调用功能
				// UserDao ud = new UserDaoImpl();
				// 把数据封装到对象中
				// User user = new User(newUsername, newPassword);
				User user = new User();
				user.setUsername(newUsername);
				user.setPassword(newPassword);

				ud.regist(user);
				System.out.println("注册成功,回到选择界面");
				break;
			case "3":
			default:
				System.out.println("谢谢光临，欢迎再来");
				System.exit(0);
				break;
			}
		}
	}
}
