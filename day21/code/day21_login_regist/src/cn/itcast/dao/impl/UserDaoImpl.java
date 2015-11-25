package cn.itcast.dao.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;

public class UserDaoImpl implements UserDao {

	private static File userFile = new File("user.txt");

	static {
		try {
			userFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean isLogin(String username, String password) {
		boolean flag = false;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(userFile));
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] datas = line.split("=");
				if (datas[0].equals(username) && datas[1].equals(password)) {
					flag = true;
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return flag;
	}

	@Override
	public void regist(User user) {
		// 我们最好能够有一个格式：
		// username=password
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(userFile, true));
			bw.write(user.getUsername() + "=" + user.getPassword());
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
