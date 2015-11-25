package cn.itcast_01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 两个小问题：
 * A:实现数据的换行?
 * 		不同的系统，针对换行符号的识别是不一样的。
 * 		Mac:		\r
 * 		linux:		\n
 * 		windows:	\r\n
 * 		系统自带的记事本软件，只能识别该系统能够识别的换行。
 * 		而Eclipse自带的记事本，以及Editplus却可以识别任意的换行符。
 * 
 * B:实现数据的追加写入? 
 * 		public FileOutputStream(String name,boolean append)
 * 		如果第二个参数为 true，则将字节写入文件末尾处，而不是写入文件开始处。
 */
public class FileOutputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		// 创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("b.txt",true);

		// 写数据
		for (int x = 0; x < 10; x++) {
			// // fos.write(("hello" + x).getBytes());
			// fos.write(("hello" + x + "\n").getBytes());
			// fos.write(("hello" + x + "\r").getBytes());
			fos.write(("hello" + x + "\r\n").getBytes());
		}

		// 释放资源
		fos.close();
	}
}
