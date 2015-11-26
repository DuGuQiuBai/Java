package cn.itcast_10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 为什么要有序列化流呢?
 * 		为了让对象在文件中持久存储，或者在网络中传输。
 * 
 * 序列化流：ObjectOutputStream	
 * 		public final void writeObject(Object obj)
 * 反序列化流：ObjectInputStream	(把流数据的对象还原)
 * 		public final Object readObject()
 */
public class ObjectStreamDemo {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		// write();
		read();
	}

	private static void read() throws IOException, ClassNotFoundException {
		// ObjectInputStream(InputStream is)
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				"oos.txt"));
		Object obj = ois.readObject();
		ois.close();

		System.out.println(obj);
	}

	private static void write() throws IOException {
		// ObjectOutputStream(OutputStream out)
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"oos.txt"));
		Person p = new Person("林青霞", 28);
		oos.writeObject(p);
		oos.close();
	}
}
