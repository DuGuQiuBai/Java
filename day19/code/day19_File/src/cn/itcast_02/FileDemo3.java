package cn.itcast_02;

import java.io.File;

/*
 * 重命名功能:public boolean renameTo(File dest)
 * 路径相同：改名
 * 路径不同：剪切并改名
 */
public class FileDemo3 {
	public static void main(String[] args) {
		// 需求：我要把a.txt的文件名称改为b.txt
		// 创建对象
		// File file = new File("a.txt");
		// // 目标
		// File dest = new File("b.txt");
		// // 调用方法
		// System.out.println("renameTo:" + file.renameTo(dest));

		File file = new File("b.txt");
		File dest = new File("e:\\a.txt");
		System.out.println("renameTo:" + file.renameTo(dest));
	}
}
