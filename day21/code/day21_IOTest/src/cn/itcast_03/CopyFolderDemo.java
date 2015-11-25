package cn.itcast_03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制单级文件夹
 * 
 * 数据源：
 * 		d:\\demo
 * 目的地：
 * 		demo
 * 
 * 分析：
 * 		A:在目的地创建文件夹
 * 		B:获取数据源文件夹下的所有文件的File数组
 * 		C:遍历File数组，得到每一个File对象
 * 		D:复制该File
 * 			数据源：d:\\demo\\a.txt
 * 			目的地：demo\\a.txt
 */
public class CopyFolderDemo {
	public static void main(String[] args) throws IOException {
		// 封装数据源文件夹
		File srcFolder = new File("d:\\demo");

		// 在目的地创建文件夹
		// 封装和数据源一样的文件夹，并判断是否存在，如果不存在，就创建
		File destFolder = new File(srcFolder.getName());
		if (!destFolder.exists()) {
			destFolder.mkdir();
		}

		// 获取数据源文件夹下的所有文件的File数组
		File[] fileArray = srcFolder.listFiles();

		// 遍历File数组，得到每一个File对象
		for (File file : fileArray) {
			String name = file.getName(); // a.txt
			File newFile = new File(destFolder, name); // demo\\a.txt

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
