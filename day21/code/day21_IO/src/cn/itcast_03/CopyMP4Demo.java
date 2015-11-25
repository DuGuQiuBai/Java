package cn.itcast_03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 数据源：
 * 		d:\\哥有老婆.mp4
 * 目的地：
 * 		项目路径下copy.mp4
 * 
 * 四种方式：
 * A:基本字节流一次读写一个字节	67023毫秒
 * B:基本字节流一次读写一个字节数组	共耗时：102毫秒
 * C:高效字节流一次读写一个字节	共耗时：650毫秒
 * D:高效字节流一次读写一个字节数组	共耗时：36毫秒
 */
public class CopyMP4Demo {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		// method1();
		// method2();
		// method3();
		method4();
		long end = System.currentTimeMillis();
		System.out.println("共耗时：" + (end - start) + "毫秒");
	}

	// 基本字节流一次读写一个字节
	public static void method1() throws IOException {
		FileInputStream fis = new FileInputStream("d:\\哥有老婆.mp4");
		FileOutputStream fos = new FileOutputStream("copy1.mp4");

		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}

		fos.close();
		fis.close();
	}

	// 基本字节流一次读写一个字节数组
	public static void method2() throws IOException {
		FileInputStream fis = new FileInputStream("d:\\哥有老婆.mp4");
		FileOutputStream fos = new FileOutputStream("copy2.mp4");

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}

		fos.close();
		fis.close();
	}

	// 高效字节流一次读写一个字节
	public static void method3() throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				"d:\\哥有老婆.mp4"));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("copy3.mp4"));

		int by = 0;
		while ((by = bis.read()) != -1) {
			bos.write(by);
		}

		bos.close();
		bis.close();
	}

	// 高效字节流一次读写一个字节数组
	public static void method4() throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				"d:\\哥有老婆.mp4"));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("copy4.mp4"));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		bis.close();
	}
}
