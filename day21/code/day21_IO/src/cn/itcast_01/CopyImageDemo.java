package cn.itcast_01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：请把项目路径下的闭月羞花.bmp复制到项目路径下的林青霞.bmp中
 * 数据源：
 * 		闭月羞花.bmp	--	FileInputStream
 * 目的地：		
 * 		林青霞.bmp	--	FileOutputStream
 */
public class CopyImageDemo {
	public static void main(String[] args) throws IOException {
		// 封装数据源
		FileInputStream fis = new FileInputStream("闭月羞花.bmp");
		// 封装目的地
		FileOutputStream fos = new FileOutputStream("林青霞.bmp");

		// 方式1
		// int by = 0;
		// while ((by = fis.read()) != -1) {
		// fos.write(by);
		// }

		// 方式2
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}

		// 释放资源
		fos.close();
		fis.close();
	}
}
