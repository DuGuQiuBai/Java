package cn.itcast_02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * 由于数组的方式一次比一个字节的方式快很多，所以，java本身在设计的时候，也考虑到了。
 * 就设计出了内置数组的缓冲区流。
 * 字节缓冲输入流
 * 		BufferedInputStream
 * 字节缓冲输出流
 * 		BufferedOutputStream
 * 
 * 通过看构造方法，我们发现，缓冲流不能直接操作文件。
 * 是建立在基本的操作流之上的。
 * 所以，这种流也被称之为高级流。
 */
public class BufferedDemo {
	public static void main(String[] args) throws IOException {
		// 写数据
		// BufferedOutputStream(OutputStream out)
		// OutputStream out = new FileOutputStream("bos.txt");
		// BufferedOutputStream bos = new BufferedOutputStream(out);
		// BufferedOutputStream bos = new BufferedOutputStream(
		// new FileOutputStream("bos.txt"));
		// bos.write("hello".getBytes());
		// bos.close();

		// 读数据
		// BufferedInputStream(InputStream is)
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				"bos.txt"));

		// 方式1
		int by = 0;
		while ((by = bis.read()) != -1) {
			System.out.print((char) by);
		}
		System.out.println("-----------------------");

		// 方式2
		bis = new BufferedInputStream(new FileInputStream("bos.txt"));
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			System.out.print(new String(bys, 0, len));
		}

		bis.close();
	}
}
