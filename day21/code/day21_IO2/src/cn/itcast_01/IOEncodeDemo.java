package cn.itcast_01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * IO流中的编码解码问题：要想在IO流中对数据进行编码问题，必须使用转换流。
 */
public class IOEncodeDemo {
	public static void main(String[] args) throws IOException {
		// 写数据
		// 默认GBK
		// OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
		// "osw.txt"));
		// 指定GBK
		// OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
		// "osw.txt"), "GBK");
		// OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
		// "osw.txt"), "UTF-8");
		// osw.write("中国");
		// osw.close();

		// 读数据
		// InputStreamReader isr = new InputStreamReader(new FileInputStream(
		// "osw.txt"));
		// InputStreamReader isr = new InputStreamReader(new FileInputStream(
		// "osw.txt"), "GBK");
		InputStreamReader isr = new InputStreamReader(new FileInputStream(
				"osw.txt"), "UTF-8");
		char[] chs = new char[1024];
		int len = 0;
		while ((len = isr.read(chs)) != -1) {
			System.out.print(new String(chs, 0, len));
		}

		isr.close();
	}
}
