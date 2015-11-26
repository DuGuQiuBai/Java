package cn.itcast_12;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * JDK4以后，出现了新IO。在nio包下。和以前的IO相比，它是把文件映射到内存，效率更高。
 * JDK7出现了几个新东西：
 * Path:与平台无关的路径。
 * Paths:包含了返回Path的静态方法。
 * 		public static Path get(URI uri):根据给定的URI来确定文件路径。
 * Files:操作文件的工具类。提供了大量的方法，简单了解如下方法
 * 		public static long copy(Path source, OutputStream out) :复制文件
 * 		public static Path write(Path path, Iterable<? extends CharSequence> lines, Charset cs, OpenOption... options):
 *			把集合的数据写到文件。
 */
public class JDK7Demo {
	public static void main(String[] args) throws IOException {
		// public static long copy(Path source, OutputStream out)
		// Files.copy(Paths.get("a.txt"), new FileOutputStream("b.txt"));
		// Files.copy(Paths.get("d:\\mn.bmp"), new FileOutputStream("mn.bmp"));

		// 把集合数据写到文本文件
		// ArrayList<String> array = new ArrayList<String>();
		// array.add("hello");
		// array.add("world");
		// array.add("java");
		// Files.write(Paths.get("array.txt"), array, Charset.forName("GBK"));
	}
}
