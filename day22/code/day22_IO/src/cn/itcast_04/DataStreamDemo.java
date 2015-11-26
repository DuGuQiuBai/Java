package cn.itcast_04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 数据输入输出流：把基本类型的数据写到文件，还可以从文件读取
 */
public class DataStreamDemo {
	public static void main(String[] args) throws IOException {
		// write();
		read();
	}

	private static void read() throws IOException {
		// DataInputStream(InputStream in)
		DataInputStream dis = new DataInputStream(
				new FileInputStream("dos.txt"));

		// 读数据
		System.out.println(dis.readByte());
		System.out.println(dis.readShort());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		System.out.println(dis.readChar());
		System.out.println(dis.readBoolean());

		// 释放资源
		dis.close();
	}

	private static void write() throws IOException {
		// DataOutputStream(OutputStream out)
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(
				"dos.txt"));

		// 写数据
		dos.writeByte(1);
		dos.writeShort(10);
		dos.writeInt(100);
		dos.writeLong(1000);
		dos.writeFloat(1.1f);
		dos.writeDouble(2.2);
		dos.writeChar('a');
		dos.writeBoolean(true);

		// 释放资源
		dos.close();
	}
}
