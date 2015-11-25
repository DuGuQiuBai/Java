package cn.itcast_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 把e:\\林青霞.jpg内容复制到当前项目目录下的mn.jpg中
 * 
 * 数据源：
 * 		e:\\林青霞.jpg	--	FileInputStream
 * 目的地：	
 * 		mn.jpg			--	FileOutputStream
 */
public class CopyImageDemo {
	public static void main(String[] args) throws IOException {
		// 封装数据源
		FileInputStream fis = new FileInputStream("e:\\林青霞.jpg");
		// 封装目的地
		FileOutputStream fos = new FileOutputStream("mn.jpg");

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
