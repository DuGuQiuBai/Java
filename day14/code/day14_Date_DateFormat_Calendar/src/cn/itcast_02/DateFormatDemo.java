package cn.itcast_02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * DateFormat:是针对日期进行格式化和解析的抽象类。
 * 所以，我们学习其子类并使用。
 * SimpleDateForamt：
 * 格式化（日期 -> 文本）
 * 		Date	--	String
 * 				public final String format(Date date)
 * 				模式对象你想要什么就写什么。
 * 解析（文本 -> 日期）
 * 		String 	-- 	Date
 * 				public Date parse(String source)
 * 				模式对象必须和给定的字符串匹配。
 */
public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		// Date -- String
		Date d = new Date();
		// public SimpleDateFormat()
		// SimpleDateFormat sdf = new SimpleDateFormat();
		// SimpleDateFormat(String pattern)
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		// public final String format(Date date)
		String result = sdf.format(d);
		System.out.println(result);
		System.out.println("-------------------------------------------------");

		String s = "2008-08-08 12:23:34";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// public Date parse(String source)
		Date dd = sdf2.parse(s);
		System.out.println(dd);
	}
}
