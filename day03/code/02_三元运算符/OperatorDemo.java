/*
	三元运算符：
	格式
		(关系表达式)?表达式1：表达式2；

	执行流程：
		计算关系表达式，看其返回值
			true:表达式1就是整个表达式的值
			false:表达式2就是整个表达式的值

*/
class OperatorDemo {
	public static void main(String[] args) {
		//获取两个数据中的较大值
		int x = 3;
		int y = 4;
		int z = (x > y)? x : y;
		System.out.println(z);

		//比较两个数是否相等
		int a = 4;
		int b = 4;
		//boolean flag = (a==b)?true:false;
		boolean flag = (a == b);
		System.out.println(flag);

		//获取三个数据中的较大值
		int c = 30;
		int d = 40;
		int e = 50;
		//int max = (c>d)?(c>e?c:e):(d>e?d:e);
		int temp = (c>d)?c:d;
		int max = (temp>e)?temp:e;
		System.out.println(max);
	}
}
