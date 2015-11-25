package cn.itcast_02;

import java.io.File;

/*
 *public boolean isDirectory():是否是文件夹
 *public boolean isFile():是否是文件
 *public boolean exists():是否存在
 *public boolean canRead():是否可读
 *public boolean canWrite():是否可写
 *public boolean isHidden():是否隐藏
 */
public class FileDemo4 {
	public static void main(String[] args) {
		File file = new File("demo.txt");

		System.out.println("isDirectory:" + file.isDirectory());
		System.out.println("isFile:" + file.isFile());
		System.out.println("exists:" + file.exists());
		System.out.println("canRead:" + file.canRead());
		System.out.println("canWrite:" + file.canWrite());
		System.out.println("isHidden:" + file.isHidden());
	}
}
