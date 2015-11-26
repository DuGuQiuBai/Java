package cn.itcast_07;

import java.io.IOException;
import java.io.PrintStream;

/*
 * public static final PrintStream out:标准输出流	控制台输出
 * 
 * 键盘录入：BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * 控制台输出：BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 */
public class SystemOutDemo {
	public static void main(String[] args) throws IOException {
		// 标准输入流
		// PrintStream ps = System.out;
		// OutputStream os = ps;
		// OutputStream os = System.out; // PrintStream,多态
		// System.out.println(os);

		// os.write("hello\r\n".getBytes());
		// os.write("world\r\n".getBytes());
		// os.write("java\r\n".getBytes());

		// 写数据的时候，每次不能写一个字符串，比较麻烦，所以我们考虑改进
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
		// System.out));
		// bw.write("hello");
		// bw.newLine();
		// bw.flush();
		// bw.write("world");
		// bw.newLine();
		// bw.flush();

		// bw.close();

		// 标准输出流
		// PrintStream ps = System.out;
		// ps.print(100);
		// ps.print(true);
		// ps.println(100);
		// ps.println(true);

		System.out.println(100);
		System.out.println(true);
		System.out.println();
		// System.out.print();
	}
}
