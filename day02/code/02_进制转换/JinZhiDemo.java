/*
	二进制	
		由0,1组成。以0b开头
	八进制	
		由0,1,…7组成。以0开头
	十进制	
		由0,1,…9组成。整数默认是十进制的
	十六进制    
		由0,1,…9,a,b,c,d,e,f(大小写均可)。以0x开头

*/
class JinZhiDemo {
	public static void main(String[] args) {
		System.out.println(0b100);//4
		System.out.println(0100);//64
		System.out.println(100);//100
		System.out.println(0x100);//256
	}
}