/*
	&&和&的区别? 前者有短路效果，只要左边是false，右边不执行。而后者，全部执行。
	||和|的区别? 前者有短路效果，只要左边是true，右边不执行。而后者，全部执行。
*/
class OperatorDemo2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		//&:逻辑与	有false则false
		System.out.println(a>b & a>c); //false & false = false
		System.out.println(a>b & a<c); //false & true = false
		System.out.println(a<b & a>c); //true & false = false
		System.out.println(a<b & a<c); //true & true = true
		System.out.println("--------");

		//&&:
		System.out.println(a>b && a>c); //false && false = false
		System.out.println(a>b && a<c); //false && true = false
		System.out.println(a<b && a>c); //true && false = false
		System.out.println(a<b && a<c); //true && true = true
		System.out.println("--------");

		//|:逻辑或	有true则true
		System.out.println(a>b | a>c); //false | false = false
		System.out.println(a>b | a<c); //false | true = true
		System.out.println(a<b | a>c); //true | false = true
		System.out.println(a<b | a<c); //true | true = true
		System.out.println("--------");

		//||:
		System.out.println(a>b || a>c); //false || false = false
		System.out.println(a>b || a<c); //false || true = true
		System.out.println(a<b || a>c); //true || false = true
		System.out.println(a<b || a<c); //true || true = true
		System.out.println("--------");

		int x = 3;
		int y = 4;
		//System.out.println((x++)>3 & (y++)>4); //false & false = false
		//System.out.println(x);//4
		//System.out.println(y);//5
		System.out.println((x++)>3 && (y++)>4);
		System.out.println(x);//4
		System.out.println(y);//4
	}
}
