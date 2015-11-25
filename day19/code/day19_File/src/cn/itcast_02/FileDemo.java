package cn.itcast_02;

import java.io.File;
import java.io.IOException;

/*
 * 创建功能：
 * A:创建文件,如果文件不存在，就创建。存在，就不创建。
 * 		public boolean createNewFile() throws IOException
 * 		
 * B:创建文件夹，如果文件夹不存在，就创建。存在，就不创建。
 * 	 public boolean mkdir() 单级文件夹
 *   public boolean mkdirs() 多级文件夹
 *   
 * 到底创建的是文件还是文件夹，取决于你使用的方法。不取决于后缀名。
 * 骑白马的不一定是班长，可能是组长。
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		// 创建File文件
		File file = new File("d:\\a.txt");

		// public boolean createNewFile() throws IOException
		System.out.println("createNewFile:" + file.createNewFile());

		// 创建文件夹
		File file2 = new File("d:\\demo");
		System.out.println("mkdir:" + file2.mkdir());

		// 创建多级文件夹
		// File file3 = new File("d:\\aaa\\bbb");
		// System.out.println("mkdir:" + file3.mkdir());

		File file4 = new File("d:\\aaa");
		File file5 = new File("d:\\aaa\\bbb");
		// File file5 = new File(file4,"bbb");
		System.out.println("mkdir:" + file4.mkdir());
		System.out.println("mkdir:" + file5.mkdir());
		// 这种方式虽然可以，但是比较麻烦
		// 怎么办呢,有一种更简单的方式
		File file6 = new File("d:\\ccc\\dddd\\eee\\fff");
		System.out.println("mkdirs:" + file6.mkdirs());

		// 下面这个我到底创建的是什么呢?
		File file7 = new File("d:\\aaa\\bbb\\ccc.txt");
		System.out.println("mkdir:" + file7.mkdir());
	}
}
