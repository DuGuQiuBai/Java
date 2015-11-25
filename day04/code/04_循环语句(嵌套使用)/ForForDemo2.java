/*
	需求：请输出如下图形
			*
			**
			***
			****
			*****
*/
class ForForDemo2 {
	public static void main(String[] args) {
		//我们先输出一个5行5列的星形
		/*
		for(int x=0; x<5; x++) {
			for(int y=0; y<5; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/

		//而我们现在需要的是下半部分
		//通过观察图形：我们知道行没有变化，是列在变化
		//第一行：1列
		//第二行：2列
		//第三行：3列
		//第四行：4列
		//第五行：5列
		//既然是一个变化的数，那么我们就定义一个变量
		/*
		int z = 0;
		for(int x=0; x<5; x++) {
			for(int y=0; y<=z; y++) {
				System.out.print("*");
			}
			System.out.println();
			z++;
		}
		*/

		//我们发现z的变化和x的变化其实是一致的
		//所以我们根本就没有必要定义z变量，直接把z用x替换
		for(int x=0; x<5; x++) {
			for(int y=0; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------");

		for(int x=1; x<=5; x++) {
			for(int y=1; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}