package cn.itcast_03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Writer:
 * 		OutputStreamWriter 把字节流转换为字符流,并可以指定编码
 * 			FileWriter
 * Reader:
 * 		InputStreamReader 把字节流转换为字符流,并可以指定编码
 * 			FileReader
 * 
 * 数据源：
 * 		a.txt
 * 目的地：
 * 		b.txt
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		// 封装数据源
		FileReader fr = new FileReader("a.txt");
		// 封装目的地
		FileWriter fw = new FileWriter("b.txt");

		// 读写
		// 方式1
		// int ch = 0;
		// while ((ch = fr.read()) != -1) {
		// fw.write(ch);
		// }

		// 方式2
		char[] chs = new char[1024];
		int len = 0;
		while ((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
		}

		// 释放资源
		fw.close();
		fr.close();
	}
}
