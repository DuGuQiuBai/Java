package cn.itcast_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/*
 *已知s.txt文件中有这样的一个字符串：“hcexfgijkamdnoqrzstuvwybpl”
 *请编写程序读取数据内容，把数据排序后写入ss.txt中。
 *
 *分析：
 *	A:读取文件内容，读一次，用字符串接受。
 *	B:把字符串转换成字符数组
 *	C:对字符数组进行排序
 *	D:把字符数组转换字符串
 *	E:把字符串写入文本文件
 */
public class StringDemo {
	public static void main(String[] args) throws IOException {
		// 读取文件内容，读一次，用字符串接受。
		BufferedReader br = new BufferedReader(new FileReader("s.txt"));
		String line = br.readLine();
		br.close();

		// 把字符串转换成字符数组
		char[] chs = line.toCharArray();

		// 对字符数组进行排序
		Arrays.sort(chs);

		// 把字符数组转换字符串
		String s = String.valueOf(chs);

		// 把字符串写入文本文件
		BufferedWriter bw = new BufferedWriter(new FileWriter("ss.txt"));
		bw.write(s);
		bw.newLine();
		bw.flush();
		bw.close();

	}
}
