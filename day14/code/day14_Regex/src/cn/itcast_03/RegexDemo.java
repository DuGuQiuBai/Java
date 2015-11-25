package cn.itcast_03;

/*
 * 分割功能
 *		String类的功能：
 *			public String[] split(String regex)
 */
public class RegexDemo {
	public static void main(String[] args) {
		// aa,bb,cc
		String s1 = "aa,bb,cc";
		String regex1 = ",";
		String[] strArray1 = s1.split(regex1);
		for (int x = 0; x < strArray1.length; x++) {
			System.out.println(strArray1[x]);
		}
		System.out.println("---------------");
		// aa.bb.cc
		String s2 = "aa.bb.cc";
		String regex2 = "\\.";
		String[] strArray2 = s2.split(regex2);
		for (int x = 0; x < strArray2.length; x++) {
			System.out.println(strArray2[x]);
		}
		System.out.println("---------------");
		// aa bb cc
		String s3 = "aa bb cc";
		String regex3 = " ";
		String[] strArray3 = s3.split(regex3);
		for (int x = 0; x < strArray3.length; x++) {
			System.out.println(strArray3[x]);
		}
		System.out.println("---------------");
		// aa bb cc
		String s4 = "aa             bb    cc";
		String regex4 = " +";
		String[] strArray4 = s4.split(regex4);
		for (int x = 0; x < strArray4.length; x++) {
			System.out.println(strArray4[x]);
		}
		System.out.println("---------------");
		// D:\develop\eclipse-SDK-3.7.2-win64\workspace\day14_Regex
		String s5 = "D:\\develop\\eclipse-SDK-3.7.2-win64\\workspace\\day14_Regex";
		String regex5 = "\\\\";
		String[] strArray5 = s5.split(regex5);
		for (int x = 0; x < strArray5.length; x++) {
			System.out.println(strArray5[x]);
		}
		System.out.println("---------------");
	}
}
