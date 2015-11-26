package cn.itcast_05;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 * 内存操作流：数据在内存中转一圈
 * ByteArrayInputStream
 * ByteArrayOutputStream
 */
public class ArrayStreamDemo {
	public static void main(String[] args) throws IOException {
		// public ByteArrayOutputStream()
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write("helloworld".getBytes());
		baos.write("javajava".getBytes());
		baos.write("android".getBytes());
		baos.close();

		// public byte[] toByteArray()
		byte[] bys = baos.toByteArray();

		// public ByteArrayInputStream(byte[] buf)
		ByteArrayInputStream bais = new ByteArrayInputStream(bys);
		int by = 0;
		while ((by = bais.read()) != -1) {
			System.out.print((char) by);
		}
		bais.close();
	}
}
