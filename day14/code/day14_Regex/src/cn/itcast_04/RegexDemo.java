package cn.itcast_04;

/*
 * 替换功能
 *		String类的功能：
 *			public String replaceAll(String regex,String replacement)
 */
public class RegexDemo {
	public static void main(String[] args) {
		// 需求：论坛中不能出现数字字符，用*替换
		String s = "hellowodekahaoshi62212934564347892nikyidaqiangeiwoxiexie13212345678gaowoyishen";

		// String ss = s.replaceAll("\\d", "*");
		// String ss = s.replaceAll("\\d", "");
		String ss = s.replaceAll("\\d+", "***");

		System.out.println(ss);
	}
}