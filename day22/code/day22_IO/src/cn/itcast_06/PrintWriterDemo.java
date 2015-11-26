package cn.itcast_06;

import java.io.IOException;
import java.io.PrintWriter;

/*
 * 打印流：
 * 		字节流打印流	PrintStream
 * 		字符打印流		PrintWriter
 * 
 * 特点：
 * 		A:只能操作目的地，不能操作数据源。
 * 		B:可以操作任意类型的数据。
 * 		C:如果启动了自动刷新，能够自动刷新。
 * 		D:可以操作文件的流	
 * 			哪些流可以直接操作文件呢? FileInputStream,FileOutputStream,FileReader,FileWriter,PrintStream,PrintWriter
 * 			看构造方法：如果同时可以接收File和String类型的构造参数，就是可以的。
 */
public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		// 打印流作为Writer的子类的使用
		PrintWriter pw = new PrintWriter("pw.txt");

		pw.write("hello");
		pw.write("\r\n");
		pw.flush();
		pw.write("world");
		pw.write("\r\n");
		pw.flush();
		pw.write("java");
		pw.write("\r\n");
		pw.flush();

		// 释放资源
		pw.close();
	}
}
