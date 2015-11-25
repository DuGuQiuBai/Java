/*
	比较两个数据是否相等。参数类型分别为两个byte类型，两个short类型，
	两个int类型，两个long类型，并在main方法中进行测试
*/
class MethodTest {
	public static void main(String[] args) {
		//测试
		byte a = 10;
		byte b = 10;
		System.out.println(compare(a,b));

		System.out.println(compare(10,10));
	}

	//byte
	/*
	public static boolean compare(byte a,byte b) {
		System.out.println("byte");
		return a == b;
	}

	//short
	public static boolean compare(short a,short b) {
		System.out.println("short");
		return a == b;
	}

	//int
	public static boolean compare(int a,int b) {
		System.out.println("int");
		return a == b;
	}
	*/

	//long 
	public static boolean compare(long a,long b) {
		System.out.println("long");
		return a == b;
	}
}
