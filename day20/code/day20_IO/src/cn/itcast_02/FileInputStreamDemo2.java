package cn.itcast_02;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 为了提高读取数据的效率，就有了第二种方案。
 * 一次读取一个字节数组：public int read(byte[] b):返回的是实际的读取长度，把数据读取到字节数组中
 */
public class FileInputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		// 创建字节输入流对象
		FileInputStream fis = new FileInputStream("a.txt");

		// 读取数据
		// public int read(byte[] b)
		// byte[] bys = new byte[5];

		// // 第一次读取
		// int len = fis.read(bys);
		// System.out.println(len);
		// // System.out.println(new String(bys));
		// System.out.println(new String(bys, 0, len));
		//
		// // 第二次读取
		// len = fis.read(bys);
		// System.out.println(len);
		// // System.out.println(new String(bys));
		// System.out.println(new String(bys, 0, len));
		//
		// // 第三次读取
		// len = fis.read(bys);
		// System.out.println(len);
		// // System.out.println(new String(bys));
		// System.out.println(new String(bys, 0, len));
		//
		// // 第四次读取
		// len = fis.read(bys);
		// System.out.println(len);
		// // System.out.println(new String(bys));
		// System.out.println(new String(bys, 0, len));
		//
		// // 用循环改，就应该知道判断结束的条件
		// len = fis.read(bys);
		// len = fis.read(bys);
		// System.out.println(len);
		// System.out.println(len);

		// byte[] bys = new byte[5];
		byte[] bys = new byte[1024 * 1024]; // 这里的数据一般是1024或者其整数倍
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			System.out.print(new String(bys, 0, len));
		}

		// 释放资源
		fis.close();
	}
}
