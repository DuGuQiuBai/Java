package cn.itcast_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FileOutputStrema写数据的异常处理
 */
public class FileOutputStreamDemo3 {
	public static void main(String[] args) {
		// method1();
		method2();
	}

	public static void method2() {
		// 定义在外，可以让finally里面看到，
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("fos.txt");
			fos.write("hello".getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 先判断不为null，才去关闭
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void method1() {
		FileOutputStream fos = null;
		try {
			// System.out.println(10 / 0);
			fos = new FileOutputStream("fos.txt");
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("创建文件失败");
		}

		try {
			fos.write("hello".getBytes());
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("写入数据失败");
		}

		try {
			fos.close();
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("释放资源失败");
		}
	}
}
