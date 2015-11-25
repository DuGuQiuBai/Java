package cn.itcast_03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制单级文件夹中指定文件并修改文件名称
 * 需求：把d:\\java文件夹下的所有java文件复制到d:\\jad目录下，并修改后缀名为jad。
 * 
 * 分析：
 * 		A:封装数据源目录
 * 		B:封装目的地目录
 * 		C:获取数据源目录下的所有文件的File数组
 * 		D:遍历File数组,得到每一个File对象
 * 		E:复制即可
 * 			数据源：d:\\java\\ForDemo.java
 * 			目的地：d:\\jad\\ForDemo.jad
 */
public class ChangeNameDemo {
	public static void main(String[] args) throws IOException {
		// 封装数据源目录
		File srcFolder = new File("d:\\java");

		// 封装目的地目录
		File destFolder = new File("d:\\jad");
		if (!destFolder.exists()) {
			destFolder.mkdir();
		}

		// 获取数据源目录下的所有文件的File数组
		File[] fileArray = srcFolder.listFiles();

		// 遍历File数组,得到每一个File对象
		for (File file : fileArray) {
			// System.out.println(file); // d:\java\ForDemo.java
			String name = file.getName(); // ForDemo.java
			name = name.replace(".java", ".jad"); // ForDemo.jad
			File newFile = new File(destFolder, name); // d:\\jad\\ForDemo.jad

			copy(file, newFile);
		}
	}

	private static void copy(File file, File newFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				file));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(newFile));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		bis.close();
	}
}
