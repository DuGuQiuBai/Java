package cn.itcast_02;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 这是操作日期的工具类
 * 
 * @author fqy
 * @version V1.0
 */
public class DateTool {
	private DateTool() {
	}

	/**
	 * 这是获取年月日时分秒的方法 格式：1997-06-01 12:23:34
	 * 
	 * @param d
	 * @return
	 */
	public static String getRiQi(Date d) {
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// String s = sdf.format(d);
		// return s;
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(d);
	}

	/**
	 * 这是获取年月日的方法 格式：1997-06-01
	 * 
	 * @param d
	 * @return
	 */
	public static String getNYR(Date d) {
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// String s = sdf.format(d);
		// return s;
		return new SimpleDateFormat("yyyy-MM-dd").format(d);
	}

	/**
	 * 这是获取时分秒的方法 格式：12:23:34
	 * 
	 * @param d
	 * @return
	 */
	public static String getSFM(Date d) {
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// String s = sdf.format(d);
		// return s;
		return new SimpleDateFormat("HH:mm:ss").format(d);
	}
}
