package cn.itcast_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 从文本文件中读取数据(每一行为一个字符串数据)到集合中，并遍历集合
 * 
 * 数据源：
 * 		array.txt
 * 目的地：
 * 		ArrayList
 */
public class FileToArrayListDemo {
	public static void main(String[] args) throws IOException {
		// 封装数据源
		BufferedReader br = new BufferedReader(new FileReader("array.txt"));

		// 封装目的地
		ArrayList<String> array = new ArrayList<String>();

		String line = null;
		while ((line = br.readLine()) != null) {
			array.add(line);
		}

		br.close();

		// 遍历集合
		for (String s : array) {
			System.out.println(s);
		}
	}
}
