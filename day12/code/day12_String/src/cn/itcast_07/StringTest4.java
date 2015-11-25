package cn.itcast_07;

public class StringTest4 {
	public static void main(String[] args) {
		String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		String minString = "java";

		int count = getCount(maxString, minString);
		System.out.println(count);
	}

	// 写功能实现：
	// 形式参数:String maxString,String minString;
	// 返回值类型:int
	public static int getCount(String maxString, String minString) {
		// 定义统计变量
		int count = 0;

		// 第一次查找
		int index = maxString.indexOf(minString);

		while (index != -1) {
			count++;
			// 截取，得到新的大串
			maxString = maxString.substring(index + minString.length());
			// 继续查找
			index = maxString.indexOf(minString);
		}

		return count;
	}
}
