package cn.itcast_07;

/*
 * 统计大串中小串出现的次数
 * 举例：在字符串” woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun”中java出现了5次
 */
public class StringTest3 {
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

		// 先查找一次
		int index = maxString.indexOf(minString);
		// 定义一个变量，用于记录每次最新的查找位置
		int startIndex = 0;

		// 判断位置是不是-1，如果是，就不继续了
		while (index != -1) {
			// 统计变量加1
			count++;
			// 计算最新的查找位置
			startIndex = index + minString.length();
			// 从最新的查找位置，再查一次小串在大串中出现的位置
			index = maxString.indexOf(minString, startIndex);
		}

		return count;
	}
}
