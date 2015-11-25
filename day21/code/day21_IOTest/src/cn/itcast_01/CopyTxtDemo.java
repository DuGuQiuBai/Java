package cn.itcast_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 复制文本文件(9种，而我们选择字符流，就用5种方式实现)
 * A:基本字符流一次一个字符
 * B:基本字符流一次一个字符数组
 * C:高效字符流一次一个字符
 * D:高效字符流一次一个字符数组
 * E:高效字符流一次一个字符串
 * 
 * 数据源：
 * 		c:\\a.txt
 * 目的地：
 * 		d:\\b.txt
 */
public class CopyTxtDemo {
	public static void main(String[] args) throws IOException {
		String srcString = "c:\\a.txt";
		String destString = "d:\\b.txt";

		method1(srcString, destString);
		// method2(srcString, destString);
		// method3(srcString, destString);
		// method4(srcString, destString);
		// method5(srcString, destString);
	}

	// 高效字符流一次一个字符串
	private static void method5(String srcString, String destString)
			throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(srcString));
		BufferedWriter bw = new BufferedWriter(new FileWriter(destString));

		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		bw.close();
		br.close();
	}

	// 高效字符流一次一个字符数组
	private static void method4(String srcString, String destString)
			throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(srcString));
		BufferedWriter bw = new BufferedWriter(new FileWriter(destString));

		char[] chs = new char[1024];
		int len = 0;
		while ((len = br.read(chs)) != -1) {
			bw.write(chs, 0, len);
		}

		bw.close();
		br.close();
	}

	// 高效字符流一次一个字符
	private static void method3(String srcString, String destString)
			throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(srcString));
		BufferedWriter bw = new BufferedWriter(new FileWriter(destString));

		int ch = 0;
		while ((ch = br.read()) != -1) {
			bw.write(ch);
		}

		bw.close();
		br.close();
	}

	// 基本字符流一次一个字符数组
	private static void method2(String srcString, String destString)
			throws IOException {
		FileReader fr = new FileReader(srcString);
		FileWriter fw = new FileWriter(destString);

		char[] chs = new char[1024];
		int len = 0;
		while ((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
		}

		fw.close();
		fr.close();
	}

	// 基本字符流一次一个字符
	private static void method1(String srcString, String destString)
			throws IOException {
		FileReader fr = new FileReader(srcString);
		FileWriter fw = new FileWriter(destString);

		int ch = 0;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}

		fw.close();
		fr.close();
	}

}
