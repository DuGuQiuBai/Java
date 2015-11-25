package cn.itcast_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 把e:\\DOS命令.avi复制到当前项目目录下的copy.avi中
 * 数据源：
 * 		e:\\DOS命令.avi
 * 目的地：
 * 		copy.avi
 */
public class CopyAviDemo {
	public static void main(String[] args) throws IOException {
		// 封装数据源
		FileInputStream fis = new FileInputStream("e:\\DOS命令.avi");
		// 封装目的地
		FileOutputStream fos = new FileOutputStream("copy.avi");

		// 读写数据
		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}

		// 释放资源
		fos.close();
		fis.close();
	}
}
