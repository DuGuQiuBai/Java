package cn.itcast_04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * 特有功能：
 * BufferedReader:
 * 		public String readLine()：包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null 
 * BufferedWriter:
 * 		public void newLine()：写一个换行符
 */
public class BufferedDemo {
	public static void main(String[] args) throws IOException {
		// 写数据
		// BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
		// for (int x = 0; x < 10; x++) {
		// bw.write("hello" + x);
		// bw.newLine();
		// bw.flush();
		// }
		// bw.close();

		// 读取数据
		BufferedReader br = new BufferedReader(new FileReader("bw.txt"));

		// String s = br.readLine();
		// System.out.println(s);
		// s = br.readLine();
		// System.out.println(s);

		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		br.close();
	}
}
