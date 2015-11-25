package cn.itcast_02;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 字节输入流读数据步骤：
 * A:创建字节输入流对象
 * B:调用方法，读取数据
 * C:释放资源
 * 
 * 字节输入流读取数据有两种方式:
 * A:一次读取一个字节
 * B:一次读取一个字节数组
 * 
 * 一次读取一个字节：public int read()
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		// 创建字节输入流对象
		// FileInputStream fis = new FileInputStream("fis.txt");
		FileInputStream fis = new FileInputStream("FileOutputStreamDemo.java");

		// 调用方法，读取数据
		// 第一次读取
		// int by = fis.read();
		// System.out.println(by);
		// System.out.println((char) by);
		//
		// // 第二次读取
		// by = fis.read();
		// System.out.println(by);
		// System.out.println((char) by);
		//
		// // 第三次读取
		// by = fis.read();
		// System.out.println(by);
		// System.out.println((char) by);
		// 我们发现上面的代码是一样的，所以，我们考虑要用循环改进
		// 如何用循环改进呢?
		// 重点来了
		// 就是如何判断循环什么时候结束
		// by = fis.read();
		// System.out.println(by);
		// by = fis.read();
		// System.out.println(by);
		// 通过测试我们发现，这个判断条件值是-1

		// int by = fis.read();
		// while (by != -1) {
		// System.out.print((char) by);
		// by = fis.read();
		// }

		// 最终代码
		int by = 0;
		// 读取数据，赋值，判断
		while ((by = fis.read()) != -1) {
			System.out.print((char) by);
		}

		// 释放资源
		fis.close();
	}
}
