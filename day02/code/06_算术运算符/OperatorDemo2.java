/*
	/:两个数据做除法的商
	%:两个数据做除法的余数。

	注意：
		%的最终结果和第一个数据的符号相关。
*/
class OperatorDemo2 {
	public static void main(String[] args) {
		//%和/的区别，一个是余数，一个是商
		System.out.println(5/3);
		System.out.println(5%3);

		//问题：判断数据整出，用哪个符号。
		//用%,如果余数为0，说明整除。

		System.out.println(5%3); //2
		System.out.println(5%-3);//2
		System.out.println(-5%3);//-2
		System.out.println(-5%3);//-2
	}
}