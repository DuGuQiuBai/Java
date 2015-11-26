package cn.itcast_08;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * RandomAccessFile:此类的实例支持对随机访问文件的读取和写入。
 * RandomAccessFile(String name, String mode) 
 * 
 * public long getFilePointer():返回偏移量，以字节为单位
 * public void seek(long pos):设置到此文件开头测量到的文件指针偏移量，在该位置发生下一个读取或写入操作。
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		write();
		read();
	}

	private static void read() throws IOException {
		// 创建对象
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

		// 读数据
		System.out.println(raf.getFilePointer());
		System.out.println(raf.readInt());
		System.out.println(raf.getFilePointer());
		System.out.println(raf.readChar());
		System.out.println(raf.getFilePointer());
		System.out.println(raf.readUTF());
		System.out.println(raf.getFilePointer());
		System.out.println("------------------");

		// System.out.println(raf.read());
		// raf.seek(0);
		// System.out.println(raf.readInt());
		raf.seek(4);
		System.out.println(raf.readChar());

		raf.seek(1000);
		System.out.println(raf.readUTF());

		// 释放资源
		raf.close();
	}

	private static void write() throws IOException {
		// 创建对象
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

		// 写数据
		raf.writeInt(100);
		raf.writeChar('a');
		// raf.writeUTF("hello");
		raf.writeUTF("林青霞");

		raf.seek(1000);
		raf.writeUTF("哈哈");

		// 释放资源
		raf.close();
	}
}
