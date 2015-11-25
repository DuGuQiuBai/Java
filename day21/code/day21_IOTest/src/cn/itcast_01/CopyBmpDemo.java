package cn.itcast_01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制图片(4种)
 * A:基本字节流一次读写一个字节
 * B:基本字节流一次读写一个字节数组
 * C:高效字节流一次读写一个字节
 * D:高效字节流一次读写一个字节数组
 */
public class CopyBmpDemo {
	public static void main(String[] args) throws IOException {
		File srcFile = new File("c:\\林青霞.bmp");
		File destFile = new File("d:\\mn.bmp");

		// method1(srcFile, destFile);
		// method2(srcFile, destFile);
		// method3(srcFile, destFile);
		method4(srcFile, destFile);
	}

	// 高效字节流一次读写一个字节数组
	public static void method4(File srcFile, File destFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(destFile));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		bis.close();
	}

	// 高效字节流一次读写一个字节
	public static void method3(File srcFile, File destFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(destFile));

		int by = 0;
		while ((by = bis.read()) != -1) {
			bos.write(by);
		}

		bos.close();
		bis.close();
	}

	// 基本字节流一次读写一个字节数组
	public static void method2(File srcFile, File destFile) throws IOException {
		FileInputStream fis = new FileInputStream(srcFile);
		FileOutputStream fos = new FileOutputStream(destFile);

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}

		fos.close();
		fis.close();
	}

	// 基本字节流一次读写一个字节
	public static void method1(File srcFile, File destFile) throws IOException {
		FileInputStream fis = new FileInputStream(srcFile);
		FileOutputStream fos = new FileOutputStream(destFile);

		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}

		fos.close();
		fis.close();
	}
}
