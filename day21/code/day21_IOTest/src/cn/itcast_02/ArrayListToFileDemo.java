package cn.itcast_02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 把ArrayList集合中的字符串数据存储到文本文件
 * 
 * 数据源：
 * 		ArrayList
 * 目的地：
 * 		array.txt
 */
public class ArrayListToFileDemo {
	public static void main(String[] args) throws IOException {
		// 创建集合对象
		// 封装数据源
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");

		// 封装目的地
		BufferedWriter bw = new BufferedWriter(new FileWriter("array.txt"));

		for (String line : array) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// 释放资源
		bw.close();
	}
}
