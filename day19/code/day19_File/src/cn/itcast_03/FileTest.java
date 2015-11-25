package cn.itcast_03;

import java.io.File;

/*
 * 需求：请把d盘目录下所有的.jpg结尾的文件名称给输出出来
 * 
 * 分析：
 * 		A:封装目录
 * 		B:获取该目录下所有的文件或者文件夹的File数组
 * 		C:遍历该File数组，得到每一个File对象
 * 		D:判断该File对象
 * 			先判断是否是文件
 * 				是：
 * 					继续判断是否以.jpg结尾
 * 						是：输出名称
 */
public class FileTest {
	public static void main(String[] args) {
		// 封装目录
		File folder = new File("d:\\");

		// 获取该目录下所有的文件或者文件夹的File数组
		File[] fileArray = folder.listFiles();

		// 遍历该File数组，得到每一个File对象
		for (File file : fileArray) {
			// 先判断是否是文件
			if (file.isFile()) {
				// 继续判断是否以.jpg结尾
				if (file.getName().endsWith(".jpg")) {
					System.out.println(file.getName());
				}
			}
		}
	}
}
