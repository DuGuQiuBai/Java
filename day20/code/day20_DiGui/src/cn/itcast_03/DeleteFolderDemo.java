package cn.itcast_03;

import java.io.File;

/*
 /*
 * 删除带内容的目录
 * D:\demo
 * 
 * 分析：
 * 		A:封装指定目录
 * 		B:获取指定目录下的所有文件或者文件夹的File数组
 * 		C:遍历该File数组，获取得到每一个File对象
 * 		D:判断该File对象
 * 			是文件夹：回到B(递归)
 * 			是文件：	
 * 				直接删除
 * 		E:删除文件夹
 */
public class DeleteFolderDemo {
	public static void main(String[] args) {
		// 封装指定目录
		File srcFolder = new File("d:\\demo");
		// 递归方法
		deleteFolder(srcFolder);
	}

	public static void deleteFolder(File srcFolder) {
		// 获取指定目录下的所有文件或者文件夹的File数组
		File[] fileArray = srcFolder.listFiles();

		// 删除除了系统文件以外的内容，我们是可以实现
		if (fileArray != null) {
			// 遍历该File数组，获取得到每一个File对象
			for (File file : fileArray) {
				if (file.isDirectory()) {
					deleteFolder(file);
				} else {
					System.out.println(file.getName() + "---" + file.delete());
				}
			}

			System.out
					.println(srcFolder.getName() + "---" + srcFolder.delete());
		}
	}
}
