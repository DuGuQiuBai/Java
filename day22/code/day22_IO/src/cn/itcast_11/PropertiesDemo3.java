package cn.itcast_11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/*
 * Properties和IO流的结合使用。
 * A:把文本文件中的数据读取到集合中
 * 		数据源：文本文件
 * 		目的地：集合
 * 
 * 		public void load(InputStream inStream)
 *		public void load(Reader reader)
 * B:把集合中的数据存储到文本文件
 * 		数据源：集合
 * 		目的地：文本文件
 * 
 * 		public void store(OutputStream out,String comments)
 * 		public void store(Writer writer,String comments)
 */
public class PropertiesDemo3 {
	public static void main(String[] args) throws IOException {
		// 创建集合对象
		Properties prop = new Properties();
		// public void load(Reader reader)
		Reader r = new FileReader("prop.txt");
		prop.load(r);
		r.close();
		System.out.println("prop:" + prop);
		System.out.println("---------------------");

		// 创建集合对象
		Properties prop2 = new Properties();
		prop2.setProperty("001", "hello");
		prop2.setProperty("002", "world");
		prop2.setProperty("003", "java");

		// public void store(Writer writer,String comments)
		Writer w = new FileWriter("w.txt");
		prop2.store(w, null);
		w.close();
	}
}
