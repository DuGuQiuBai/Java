/*
	+:做加法操作
		A:针对数据操作
		B:针对字符进行做+
			ASCII码表
				'0'	48
				'A'	65
				'a'	97
		C:针对字符串进行做+
			在字符串的操作中，叫字符串连接符
*/
class DataTypeDemo3 {
	public static void main(String[] args) {
		System.out.println('a');
		System.out.println('a'+1);
		System.out.println('A'+0);
		System.out.println('0'+0);
		System.out.println("-----------");


		System.out.println('a'+'b');
		System.out.println("a"+"b");
		
		System.out.println("hello"+'a'+1); //左边字符串，往后拼的都是字符串
		System.out.println('a'+1+"hello");
		System.out.println("5+5="+5+5);
		System.out.println(5+5+"=5+5");
	}
}
