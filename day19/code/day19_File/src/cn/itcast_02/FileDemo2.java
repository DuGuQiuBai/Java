package cn.itcast_02;

import java.io.File;
import java.io.IOException;

/*
 * 删除功能：public boolean delete() 既可以删除文件，也可以删除文件夹。
 * 
 * 相对路径：不以盘符开始的路径
 * 绝对路径：以盘符开始的路径
 * 
 * 注意事项：
 * 		A:如果一个文件夹内有内容，是不能直接删除的。
 * 		B:Java程序的删除不走回收站，直接删除。
 */
public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		// 创建File对象
		File file = new File("a.txt");
		System.out.println("createNewFile:" + file.createNewFile());

		File file2 = new File("aaa\\bbb");
		System.out.println("mkdirs:" + file2.mkdirs());

		File file3 = new File(file2, "b.txt");
		System.out.println("createNewFile:" + file3.createNewFile());

		// 删除文件
		System.out.println("delete:" + file.delete());

		// 删除文件夹
		File file4 = new File("aaa\\bbb\\ccc");
		System.out.println("delete:" + file4.delete());

		File file5 = new File("aaa");
		System.out.println("delete:" + file5.delete());
	}
}
