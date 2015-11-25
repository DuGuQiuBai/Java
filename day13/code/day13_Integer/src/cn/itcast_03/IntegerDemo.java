package cn.itcast_03;

/*
 * int和String类型的相互转换即可。
 * 
 * int -- String
 * 		String.valueOf(number)
 * 		Integer.toString(number)
 * 
 * String -- int
 * 		Integer.parseInt(s);
 */
public class IntegerDemo {
	public static void main(String[] args) {
		// int -- String
		int number = 100;
		// 方法1
		String s1 = number + "";
		//方式2
		String s2 = String.valueOf(number);
		//方式3
		//int -- Integer -- String
		Integer i = new Integer(number);
		String s3 = i.toString();
		//方式4
		String s4 = Integer.toString(number);
		System.out.println("--------------");

		String s = "100";
		//方式1
		//String -- Integer -- int
		Integer ii = new Integer(s);
		//public int intValue()
		int num = ii.intValue();
		//方式2
		//public static int parseInt(String s)
		int num2 = Integer.parseInt(s);
	}
}
