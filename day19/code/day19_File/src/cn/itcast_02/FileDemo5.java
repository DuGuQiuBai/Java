package cn.itcast_02;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *public String getAbsolutePath():获取绝对路径
 *public String getPath():获取相对路径
 *public String getName():获取名称
 *public long length():获取文件的大小
 *public long lastModified():获取最后一次修改时间的毫秒值
 */
public class FileDemo5 {
	public static void main(String[] args) {
		File file = new File("aaa\\bbb\\b.txt");

		System.out.println("getAbsolutePath:" + file.getAbsolutePath());
		System.out.println("getPath:" + file.getPath());
		System.out.println("getName:" + file.getName());
		System.out.println("length:" + file.length());
		System.out.println("lastModified:" + file.lastModified());

		// 1428044959288
		Date d = new Date(1428044959288L);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
	}
}
