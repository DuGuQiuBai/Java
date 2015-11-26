package cn.itcast_09;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
 * SequenceInputStream 表示其他输入流的逻辑串联。它从输入流的有序集合开始，并从第一个输入流开始读取，直到到达文件末尾，
 * 接着从第二个输入流读取，依次类推，直到到达包含的最后一个输入流的文件末尾为止。 
 * 
 * 构造方法：
 * 		SequenceInputStream(InputStream s1, InputStream s2):合并两个流对象
 * 		SequenceInputStream(Enumeration e):合并多个流对象
 */
public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		// mergeTwo();
		mergeMore();
	}

	private static void mergeMore() throws IOException {
		// SequenceInputStream(Enumeration e):合并多个流对象
		// public Enumeration<E> elements()
		// Vector

		// 创建集合对象
		Vector<InputStream> v = new Vector<InputStream>();
		// 创建元素对象
		InputStream s1 = new FileInputStream("MyBufferedReader.java");
		InputStream s2 = new FileInputStream("MyBufferedReaderDemo.java");
		InputStream s3 = new FileInputStream("MyLineNumberReader.java");
		InputStream s4 = new FileInputStream("MyMyLineNumberReaderDemo.java");
		// 把元素添加到集合
		v.add(s1);
		v.add(s2);
		v.add(s3);
		v.add(s4);
		// 通过集合的到Enumeration
		Enumeration<InputStream> en = v.elements();

		// 创建合并流对象
		SequenceInputStream sis = new SequenceInputStream(en);
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("Copy.java"));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = sis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		sis.close();
	}

	private static void mergeTwo() throws IOException {
		// SequenceInputStream(InputStream s1, InputStream s2)
		InputStream s1 = new FileInputStream("MyBufferedReader.java");
		InputStream s2 = new FileInputStream("MyBufferedReaderDemo.java");
		SequenceInputStream sis = new SequenceInputStream(s1, s2);

		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("Copy.java"));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = sis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		sis.close();
	}
}
