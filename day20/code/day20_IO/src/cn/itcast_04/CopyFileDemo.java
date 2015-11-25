package cn.itcast_04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 把当前项目目录下的a.txt内容复制到当前项目目录下的b.txt中
 * 
 * 复制文件：
 * 数据源：
 * 		a.txt	--	InputStream	--	FileInputStream	--	一次读一个字节数组
 * 目的地：
 * 		b.txt	--	OutputStream -- FileOutputStream -- 一次写一个字节数组一部分
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		// 封装数据源
		FileInputStream fis = new FileInputStream("a.txt");
		// 封装目的地
		FileOutputStream fos = new FileOutputStream("b.txt");

		// 读写数据
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}

		// 释放资源
		fos.close();
		fis.close();
	}
}
