package cn.itcast_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 * 需求：names.txt中存储的是我们班所有同学的名称。
 * 请写一个功能，每次运行程序，随机产生一个名称出来。
 * 
 * 分析：
 * 		A:数据来自于文本文件,所以我们要读取数据
 * 		B:把读取到的数据存储到集合中
 * 		C:随机产生一个索引
 * 		D:从集合中根据随机产生的索引获取一个值就可以了
 */
public class GetNameDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("names.txt"));
		ArrayList<String> array = new ArrayList<String>();

		String line = null;
		while ((line = br.readLine()) != null) {
			array.add(line);
		}

		br.close();

		// 随机产生一个索引
		// int index = (int) (Math.random() * array.size()); //
		// [0,array.size()-1)

		Random r = new Random();
		int index = r.nextInt(array.size());
		System.out.println("幸运者是：" + array.get(index));

		// 以下为扩展内容
		array.remove(index);
		BufferedWriter bw = new BufferedWriter(new FileWriter("names.txt"));
		for (String name : array) {
			bw.write(name);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
