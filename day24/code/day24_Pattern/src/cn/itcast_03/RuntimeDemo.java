package cn.itcast_03;

import java.io.IOException;

/*
 * Runtime：
 * 		public static Runtime getRuntime()
 * 
 * 没有构造，方法不全是静态的。
 * 这中类肯定是通过静态的方法返回了该类的对象。
 */
public class RuntimeDemo {
	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();

		// r.exec("calc");
		r.exec("notepad");
	}
}
