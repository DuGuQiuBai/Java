package cn.itcast_03;

import java.io.File;
import java.io.FilenameFilter;

/*
 * 需求：请把d盘目录下所有的.jpg结尾的文件名称给输出出来
 * A方案思路:
 *		先获取所有的文件或者文件夹的File数组，在遍历的时候，依次判断，如果满足条件，就输出。
 * B方案思路：
 * 		先判断满足条件吗?如果满足，就往数组里面方法，最后直接遍历即可。
 * 
 * 要想实现B方案，就必须知道一个东西：FilenameFilter 文件名称过滤器。
 */
public class FileTest2 {
	public static void main(String[] args) {
		File folder = new File("d:\\");

		// public String[] list(FilenameFilter filter)
		// public File[] listFiles(FilenameFilter filter)

		// String[] strArray = folder.list(new FilenameFilter() {
		// @Override
		// public boolean accept(File dir, String name) {
		// // return false;
		// // return true;
		// // System.out.println(dir + "---" + name);
		// // File file = new File(dir, name);
		// // boolean flag = file.isFile();
		// // boolean flag2 = name.endsWith(".jpg");
		// // return flag && flag2;
		//
		// return new File(dir, name).isFile() && name.endsWith(".jpg");
		// }
		// });
		//
		// for (String str : strArray) {
		// System.out.println(str);
		// }

		// public File[] listFiles(FilenameFilter filter)
		File[] fileArray = folder.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".jpg");
			}
		});

		for (File file : fileArray) {
			System.out.println(file.getName());
		}
	}
}
