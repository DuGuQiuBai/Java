package cn.itcast_04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 数据源：
 * 		InputStreamReaderDemo.java
 * 目的地：
 * 		Deom.java
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		// 用字符缓冲流的特有功能实现

		// 一次读取一行

		// 封装数据源
		BufferedReader br = new BufferedReader(new FileReader(
				"InputStreamReaderDemo.java"));
		// 封装目的地
		BufferedWriter bw = new BufferedWriter(new FileWriter("Demo.java"));

		// 读写一行
		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// 释放资源
		bw.close();
		br.close();
	}
}
