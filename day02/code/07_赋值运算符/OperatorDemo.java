/*
	赋值运算符：
		基本：=
		复合：+=,-=,*=,/=,%=,...
*/
class OperatorDemo {
	public static void main(String[] args) {
		//把10赋值给int类型的变量a
		int a = 10;

		//复合的用法
		int b = 10;
		b += 20; //结果等价于：b = b + 20;
		System.out.println(b);
	}
}