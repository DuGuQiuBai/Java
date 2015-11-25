package cn.itcast_01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * 字符流 = 字节流 +编码表
 * OutputStreamWriter:把字节流转换成字符流。
 * OutputStreamWriter(OutputStream out):默认字符集
 * OutputStreamWriter(OutputStream out, String charsetName):指定字符集 
 * 
 * flush()和close()的区别?
 * A:flush 刷新流，流对象还可以继续使用
 * B:close 关闭流，流对象不可以继续使用
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		// 创建对象
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
				"osw.txt"));

		// 写数据的方法
		// 写一个字符
		// osw.write('中');
		/*
		 * 这个时候，为什么没有数据呢? 字符 = 2字节
		 */
		// 写一个字符数组
		// char[] chs = { 'a', 'b', 'c', '林', '青', '霞' };
		// osw.write(chs);

		// 写一个字符数组的一部分
		// osw.write(chs, 0, 3);

		// 写一个字符串
		// osw.write("helloworld");

		// 写一个字符串的一部分
		String s = "hello";
		osw.write(s, 0, s.length());

		osw.flush();
		// 10M-20M

		// 释放资源
		osw.close();// 关闭此流，但要先刷新它
		// osw.write("haha"); //java.io.IOException: Stream closed
	}
}
