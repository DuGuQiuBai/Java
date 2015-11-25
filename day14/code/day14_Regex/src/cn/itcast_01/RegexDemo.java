package cn.itcast_01;

import java.util.Scanner;

/*
 * 正则表达式：符合一定规则的字符串。
 * 
 * 练习：
 * 		校验qq号码.
 *			1:要求必须是5-15位数字
 *			2:0不能开头
 */
public class RegexDemo {
	public static void main(String[] args) {
		//键盘录入对象
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入你的qq号码：");
		String qq = sc.nextLine();
		
		boolean flag = checkQQ(qq);
		System.out.println("flag:"+flag);
		
		//使用正则表达式来实现
		boolean flag2 = checkQQ2(qq);
		System.out.println("flag2:"+flag2);
	}
	
	public static boolean checkQQ2(String qq){
		//正则表达式
		// String regex = "[1-9][0-9]{4,14}";
		// //public boolean matches(String regex)
		// boolean flag = qq.matches(regex);
		// return flag;
		
		return qq.matches("[1-9][0-9]{4,14}");
	}

	/*
	 * 返回值类型：boolean 参数列表：String qq
	 */
	public static boolean checkQQ(String qq) {
		boolean flag = true;

		// 校验长度
		if (qq.length() >= 5 && qq.length() <= 15) {
			// 0不能开头
			if (!qq.startsWith("0")) {
				// 是否都是数字字符
				char[] chs = qq.toCharArray();
				for (int x = 0; x < chs.length; x++) {
					char ch = chs[x];
					if (!Character.isDigit(ch)) {
						flag = false;
						break;
					}
				}
			} else {
				flag = false;
			}
		} else {
			flag = false;
		}

		return flag;
	}
}
