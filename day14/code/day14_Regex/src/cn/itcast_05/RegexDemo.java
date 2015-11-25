package cn.itcast_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 获取功能
 * 		Pattern和Matcher类的使用
 * 
 */
public class RegexDemo {
	public static void main(String[] args) {
		// 模式对象和匹配器对象的基本使用
		// // 把规则转换为模式对象
		// Pattern p = Pattern.compile("a*b");
		// // 通过模式对象得到匹配器对象
		// Matcher m = p.matcher("aaaaab");
		// // 通过匹配器对象调用功能
		// boolean b = m.matches();
		// System.out.println(b);

		// 作为判断来说
		// String s = "aaaaab";
		// String regex = "a*b";
		// boolean flag = s.matches(regex);
		// System.out.println(flag);

		// 需求：获取功能
		// 获取由三个字符组成的单词
		String s = "da jia hao,wo men dou hen ai java.";
		// 定义规则
		String regex = "\\b[a-z]{3}\\b";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);

		// public boolean find():问是否有匹配的
		// boolean b = m.find();
		// System.out.println(b);
		// 我们得拿出来
		// public String group()
		// String ss = m.group();
		// System.out.println(ss);

		// b = m.find();
		// System.out.println(b);
		// // 我们得拿出来
		// // public String group()
		// ss = m.group();
		// System.out.println(ss);

		while (m.find()) {
			System.out.println(m.group());
		}
	}
}
