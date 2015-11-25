/*
	for和while的区别：
	使用区别：控制条件语句所控制的那个变量，在for循环结束后，就不能再被访问到了，
			  而while循环结束还可以继续使用，如果你想继续使用，就用while，否则推荐使用for。
			  原因是for循环结束，该变量就从内存中消失，能够提高内存的使用效率。
	场景区别：
			for循环适合针对一个范围判断进行操作
				水仙花
			while循环适合判断次数不明确操作
				吃葡萄
*/
class WhileDemo2 {
	public static void main(String[] args) {
		int x = 0;
		while(x<10) {
			System.out.println(x);
			x++;
		}
		System.out.println(x+"---");
		System.out.println("-----------");

		for(int y=0; y<10; y++) {
			System.out.println(y);
		}
		//System.out.println(y+"---");
	}
}
