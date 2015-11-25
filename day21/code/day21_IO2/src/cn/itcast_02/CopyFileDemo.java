package cn.itcast_02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 用OutputStreamWriter和InputStreamReader复制java文件
 * 数据源：
 * 		InputStreamReaderDemo.java
 * 目的地：
 * 		Copy.java
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		// 封装数据源
		InputStreamReader isr = new InputStreamReader(new FileInputStream(
				"InputStreamReaderDemo.java"));
		// 封装目的地
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
				"Copy.java"));

		// 方式1
		// int ch = 0;
		// while ((ch = isr.read()) != -1) {
		// osw.write(ch);
		// }

		// 方式2
		char[] chs = new char[1024];
		int len = 0;
		while ((len = isr.read(chs)) != -1) {
			osw.write(chs, 0, len);
		}

		// 释放资源
		osw.close();
		isr.close();
	}
}