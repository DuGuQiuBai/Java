/*
	关系运算符：
		==,!=,>,>=,<,<=

	特点：
		无论表达式是简单还是复杂，结果肯定是boolean类型。
	
	注意事项：
		关系运算符“==”不能误写成“=” 。
*/
class OperatorDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 20;
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println((a + b*c) == (a*b + c));
		System.out.println("----------------");

		System.out.println(a = b); //把b的值赋值给a，把a的值作为结果留下来
		System.out.println(a = c);
	}
}
