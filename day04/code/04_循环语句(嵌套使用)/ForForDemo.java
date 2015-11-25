/*
	需求：请输出一个4行5列的星星(*)图案。

			*****
			*****
			*****
			*****

	输出语句的问题：
		System.out.println("*");
			在当前行输出*，并换行。

		System.out.print("*");
			仅仅在当前行输出*

	循环嵌套中：
		外循环控制行数
		内循环控制列数
*/
class ForForDemo {
	public static void main(String[] args) {
		//方式一
		/*
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		*/

		//方式二
		/*
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		*/

		//输出语句
		/*
		System.out.println("*");
		System.out.println("*");

		System.out.print("*");
		System.out.print("*");
		System.out.println();
		*/

		/*
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		*/

		//用循环改进一行输出5个*
		/*
		//第一行
		for(int x=0; x<5; x++) {
			System.out.print("*");
		}
		System.out.println();

		//第二行
		for(int x=0; x<5; x++) {
			System.out.print("*");
		}
		System.out.println();

		//第三行
		for(int x=0; x<5; x++) {
			System.out.print("*");
		}
		System.out.println();

		//第四行
		for(int x=0; x<5; x++) {
			System.out.print("*");
		}
		System.out.println();
		*/

		//同样的事情做了很多次
		for(int y=0; y<4; y++) {
			for(int x=0; x<5; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
