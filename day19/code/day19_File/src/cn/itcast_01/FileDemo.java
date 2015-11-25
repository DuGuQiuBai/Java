package cn.itcast_01;

import java.io.File;

/*
 * File:文件和目录路径名的抽象表示形式
 * 理解：不代表这个文件或者目录一定存在。
 * 
 * 构造方法：
 * 		File(String pathname)：通过一个路径名创建File对象
 * 		File(String parent, String child)： 通过父路径和子路径名创建File对象
 * 		File(File parent, String child)：通过父路径File对象和子路径名创建File对象
 */
public class FileDemo {
	public static void main(String[] args) {
		// 创建对象
		// File(String pathname)：通过一个路径名创建File对象
		File file = new File("d:\\demo\\a.txt");

		// File(String parent, String child)： 通过父路径和子路径名创建File对象
		File file2 = new File("d:\\demo", "a.txt");

		// File(File parent, String child)：通过父路径File对象和子路径名创建File对象
		File file3 = new File("d:\\demo");
		File file4 = new File(file3, "a.txt");
	}
}
