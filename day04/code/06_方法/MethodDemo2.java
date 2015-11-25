/*
	方法的注意事项：
		A:方法不调用不执行
		B:方法与方法是平级关系，不能嵌套定义
		C:方法定义的时候参数之间用逗号隔开
		D:方法调用的时候不用在传递数据类型
			可以传递变量，也可以常量。就是不能加数据类型
		E:如果方法有明确的返回值，一定要有return带回一个值
*/
class MethodDemo2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int c = sum(a,b);
		System.out.println(c);

		int d = sum(10,20);
		System.out.println(d);
	}
	
	public static int sum(int a,int b) {
		//return a + b;
		int c = a + b;
		return c;
	}
}
