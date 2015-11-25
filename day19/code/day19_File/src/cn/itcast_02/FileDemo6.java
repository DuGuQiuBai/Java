package cn.itcast_02;

import java.io.File;

/*
 * public String[] list():返回的是给定目录下的所有文件或者文件夹的名称数组。
 * public File[] listFiles():返回的是给定目录下的所有文件或者文件夹的File数组。
 */
public class FileDemo6 {
	public static void main(String[] args) {
		// 给定一个目录：d:\\
		File file = new File("d:\\");

		// public String[] list():返回的是给定目录下的所有文件或者文件夹的名称数组。
		String[] strArray = file.list();
		for (String str : strArray) {
			System.out.println(str);
		}
		System.out.println("-----------------");

		// public File[] listFiles():返回的是给定目录下的所有文件或者文件夹的File数组。
		File[] fileArray = file.listFiles();
		for (File f : fileArray) {
			// System.out.println(f);
			System.out.println(f.getName());
		}
	}
}
