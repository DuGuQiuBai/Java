package cn.itcast_04;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 字节流操作中文，不是特别的方便，所以我们要想办法改进。这个时候就引出了转换流。
 * 可以把字节流转换为字符流。
 * 字符流 = 字节流+编码表
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("a.txt");

		// int by = 0;
		// while ((by = fis.read()) != -1) {
		// System.out.print((char) by);
		// }

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			System.out.print(new String(bys, 0, len));
		}

		fis.close();
	}
}
