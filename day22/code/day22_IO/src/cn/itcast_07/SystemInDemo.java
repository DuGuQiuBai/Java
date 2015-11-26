package cn.itcast_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 标准输入输出流：
 * System:
 * 		public static final InputStream in:标准输入流	键盘输入
 * 		public static final PrintStream out:标准输出流	控制台输出
 * 
 * 键盘录入数据：
 * 		A:main接受键盘录入数据
 * 		B:IO流实现键盘录入数据
 * 		C:Scanner实现键盘录入数据
 */
public class SystemInDemo {
	public static void main(String[] args) throws IOException {
		// // 键盘录入
		// InputStream is = System.in; // BufferedInputStream,多态
		// // System.out.println(is);
		//
		// // 需求：我想一次读取一行数据,但是现在我们是可以实现的，它的原理和BufferedReader是一样的,只不过稍微麻烦了
		// // 如何改进呢?
		// // 我是这样想的，我能不能直接使用readLine()呢?
		// // 如果能，我就能够直接一次读取一行,而readLine()方法是BufferedReader的
		// // 所以，我们要创建BufferedReader的对象
		// // 而这个时候，直接把is作为构造参数传递，报错，为什么呢?
		// // 因为BufferedReader是字符缓冲流，它只能对字符输入流进行缓冲
		// // 而is对象代表的是字节流，所以，我们需要考虑把字节流转换为字符流，然后再对字符流进行缓冲
		// // 我们前面学习过一个转换流：把字节转换为字符
		// InputStreamReader isr = new InputStreamReader(is);
		// BufferedReader br = new BufferedReader(isr);

		// 封装键盘录入，用IO实现
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("请输入一个字符串：");
		String line = br.readLine();
		System.out.println(line);

		System.out.println("请输入一个int类型的值：");
		line = br.readLine();
		int number = Integer.parseInt(line);
		System.out.println(number);

		// 释放资源
		// br.close();

		System.out.println("请输入一个int类型的值：");
		line = br.readLine();
		number = Integer.parseInt(line);
		System.out.println(number);
		System.out.println("-------------------------");

		// Scanner sc = new Scanner(System.in);
		// // ...
		// sc.close();
	}

}
