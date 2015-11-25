package cn.itcast_03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Java中的异常被分为两大类：编译时异常和运行时异常。所有的RuntimeException类及其子类的实例被称为运行时异常，其他的异常就是编译时异常
 *	编译时异常
 *		Java程序必须显示处理，否则程序就会发生错误，无法通过编译
 *	运行时异常
 *		无需显示处理，也可以和编译时异常一样处理
 *
 * 处理异常的方式特别的简单：会点击鼠标即可。
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		String s = "2015-04-03 10:37:45";
		// 请写功能实现
		Date d = null;
		try {
			// System.out.println(10/0);
			d = stringToDate(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(d);

		System.out.println("haha");

		// System.out.println(10/0);
	}

	public static Date stringToDate(String s) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(s);
		return d;
	}
}
