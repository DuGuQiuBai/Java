package cn.itcast_06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 数据源：
 * 		MyBufferedReader.java	--	Reader	--	FileReader --	BufferedReader
 * 目的地：
 * 		Copy.java	--	Writer -- FileWriter -- BufferedWriter -- PrintWriter
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		// // 封装数据源
		// BufferedReader br = new BufferedReader(new FileReader(
		// "MyBufferedReader.java"));
		// // 封装目的地
		// BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.java"));
		// // 读写数据
		// String line = null;
		// while ((line = br.readLine()) != null) {
		// bw.write(line);
		// bw.newLine();
		// bw.flush();
		// }
		// // 释放资源
		// bw.close();
		// br.close();

		// 用PrintWriter改进版
		BufferedReader br = new BufferedReader(new FileReader(
				"MyBufferedReader.java"));
		PrintWriter pw = new PrintWriter(new FileWriter("Copy.java"), true);

		String line = null;
		while ((line = br.readLine()) != null) {
			pw.println(line);
		}

		pw.close();
		br.close();
	}
}
