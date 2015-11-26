package cn.itcast_06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * print:
 * println:
 */
public class PrintWriterDemo2 {
	public static void main(String[] args) throws IOException {
		// PrintWriter(OutputStream out, boolean autoFlush)
		// PrintWriter(Writer out, boolean autoFlush)

		// PrintWriter pw = new PrintWriter("pw2.txt");

		// PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt"), true);
		// pw.print(100);
		// pw.print(true);
		// pw.print("hello");

		// pw.flush();

		// println()
		PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt"), true);

		// 不但能刷新，还能够实现换行
		pw.println("hello");
		pw.println("world");
		pw.println("java");
		
		// write,newLine,flush
		

		pw.close();
	}
}
