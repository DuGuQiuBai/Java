package cn.itcast_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符缓冲区流
 * BufferedReader
 * BufferedWriter
 * 
 * 
 * 数据源：
 * 		a.txt
 * 目的地：
 * 		b.txt
 * 
 * 目前为止：
 * 		复制文本文件：
 * 			8种
 * 				字节流	4种
 * 					基本字节流
 * 					字节缓冲流
 * 				字符流	4种
 * 					基本字符流
 * 					字符缓冲流
 * 
 * 		复制图片，视频，音频等：
 * 			4种
 * 				字节流	4种
 * 					基本字节流
 * 					字节缓冲流
 */
public class CopyFileDemo2 {
	public static void main(String[] args) throws IOException {
		// 封装数据源
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		// 封装目的地
		BufferedWriter bw = new BufferedWriter(new FileWriter("c.txt"));

		// 两种方式
		char[] chs = new char[1024];
		int len = 0;
		while ((len = br.read(chs)) != -1) {
			bw.write(chs, 0, len);
		}

		bw.close();
		br.close();
	}
}
