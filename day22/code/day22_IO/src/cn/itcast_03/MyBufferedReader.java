package cn.itcast_03;

import java.io.IOException;
import java.io.Reader;

public class MyBufferedReader {
	private Reader r;

	public MyBufferedReader(Reader r) { // Reader r = new FileReader("my.txt");
		this.r = r;
	}

	public String readLine() throws IOException {
		/*
		 * 我们现在已知的是r对象，r对象读取数据有两种方式：一次读取一个字符，一次读取一个字符数组
		 * 我们准备用哪个呢?如果用数组的方式，长度不好确定，所以，最终确定一次读取一个字符。
		 * 我们每次读取一个字符，当读取第二个字符的时候，前一个就会丢失，所以，我们要想办法把读取过的字符保存起来。
		 * 用什么呢?通过简单的分析，我们最终确定了StringBuilder
		 */
		StringBuilder sb = new StringBuilder();

		// while (true) {
		// // 一次读取一个字符
		// int ch = r.read();
		// if (ch == '\r') {
		// continue;
		// }
		// if (ch == '\n') {
		// // return sb.toString();
		// break;
		// } else {
		// sb.append((char) ch);
		// }
		// }
		// return sb.toString();

		// 如何解决死循环问题呢?

		int ch = 0;
		while ((ch = r.read()) != -1) {
			if (ch == '\r') {
				continue;
			}
			if (ch == '\n') {
				return sb.toString();
			} else {
				sb.append((char) ch);
			}
		}

		// 防止数据丢失
		if (sb.length() > 0) {
			return sb.toString();
		}

		return null;

	}

	public void close() throws IOException {
		r.close();
	}
}
