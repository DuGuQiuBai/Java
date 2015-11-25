/*
	模拟做单项选择题，根据你的选择，给出对应的答案。(表达式是字符的情况)
	根据给定的字符串，来输出你选择的字符串是什么。(表达式是字符串的情况)
*/
class SwitchTest2 {
	public static void main(String[] args) {
		//定义一个选项
		//表达式是字符
		char ch = 'B';

		switch(ch) {
			case 'A':
				System.out.println("你选择了A");
				break;
			case 'B':
				System.out.println("你选择了B");
				break;
			case 'C':
				System.out.println("你选择了C");
				break;
			case 'D':
				System.out.println("你选择了D");
				break;
		}

		//给定字符串进行判断
		String s = "java";

		switch(s) {
			case "hello":
				System.out.println("hello");
				break;
			case "world":
				System.out.println("world");
				break;
			case "java":
				System.out.println("java");
				break;
			default:
				System.out.println("android");
		}
	}
}
