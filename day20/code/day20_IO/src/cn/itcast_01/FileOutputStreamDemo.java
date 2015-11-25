package cn.itcast_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * IO流分类：
 * 		A:数据流向
 * 			输入流	读数据
 * 			输出流	写数据
 * 		B:数据类型
 * 			字节流
 * 			字符流
 * 		默认情况下，IO流分类说的是按照数据类型分。
 * 
 * IO流的四个基类：
 * 		字节流
 * 			字节输入流	InputStream
 * 			字节输出流	OutputStream
 * 		字符流
 * 			字符输入流	Reader
 * 			字符输出流	Writer
 * 
 * 需求：请把一句话："helloworld"写入一个文本文件。
 * 通过简单的分析后，我们找到了OutputStream。
 * 由于OutputStream是一个抽象类，所以我们应该找其子类来学习。
 * 学习前，我们先回想一个问题，就是硬盘上的文件，java提供了哪个类表示呢?File
 * 再结合现在的字节输出流OutputStream，两个拼接一下就有了一个新的名字：FileOutputStream
 * 
 * FileOutputStream的构造方法：
 * 		FileOutputStream(File file)
 * 		FileOutputStream(String name)
 * 
 * 字节输出流操作步骤：
 * 		A:创建字节输出流对象
 * 		B:调用写数据功能写数据
 * 		C:释放资源
 * 
 * 练习：请把字节的名字写到一个文本文件
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		// 创建字节输出流对象
		// FileOutputStream fos = new FileOutputStream("a.txt");

		// 如果传递的不是String，而是File，如果做呢?
		// File file = new File("a.txt");
		// FileOutputStream fos = new FileOutputStream(file);

		FileOutputStream fos = new FileOutputStream("a.txt");
		// OutputStream os = new FileOutputStream("a.txt");
		/*
		 * 创建字节输入流对象做了哪些事情呢? A:调用系统功能创建了一个文件a.txt B:创建了一个对象fos
		 * C:把fos对象指向了a.txt文件
		 */
  
		// 写数据
		// public void write(int b):一次写一个字节的数据
		// fos.write(57);
		// fos.write(55);
		// fos.write(97);

		// public void write(byte[] b):一次写一个字节数组的数据
		// byte[] bys = {97,98,99,100,101};
		// fos.write(bys);
		// 曾经我们讲解过，可以通过String得到byte[]
		// byte[] bys = "abcde".getBytes();
		// fos.write(bys);
		fos.write("helloworld".getBytes());

		// public void write(byte[] b,int off,int len):一次写一个字节数组的一部分
		// fos.write("helloworld".getBytes(), 0, 5);
		// fos.write("helloworld".getBytes(), 0, "helloworld".length());
		
		//释放资源
		fos.close();
		//关闭此文件输出流并释放与此流有关的所有系统资源。
		/*
		 * 两件事情：
		 * A:关闭流对象(流对象不可以继续在写数据了)
		 * B:释放与此流相关的资源(通知系统去释放与此流相关的资源)
		 */
		
		//java.io.IOException: Stream Closed
		//fos.write("haha".getBytes());
		
		
		// while(true){}
	}
}
