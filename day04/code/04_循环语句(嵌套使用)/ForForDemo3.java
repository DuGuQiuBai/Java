/*
	需求：在控制台输出九九乘法表。

		1*1=1
		1*2=2	2*2=4
		1*3=3	2*3=6	3*3=9
		...
		1*9=9	2*9=18	3*9=27	4*9=36	...

	转移字符：
		\t	tab键的位置
*/
class ForForDemo3 {
	public static void main(String[] args) {
		//如果我们把每一行看作一颗*
		//那么这其实就是我们刚才的三角形
		/*
		for(int x=1; x<=9; x++) {
			for(int y=1; y<=x; y++) {
				System.out.print("*"+"\t");
			}
			System.out.println();
		}
		*/

		//接下来，我们要把*替换为表达式
		for(int x=1; x<=9; x++) {
			for(int y=1; y<=x; y++) {
				System.out.print(y+"*"+x+"="+(x*y)+"\t");
			}
			System.out.println();
		}
	}
}
