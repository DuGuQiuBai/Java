class ForTest3 {
	public static void main(String[] args) {
		//求出1-100之间偶数和

		/*
		//定义求和变量
		int sum = 0;

		//通过for循环获取每一个数据
		for(int x=1; x<=100; x++) {
			//把数据累加
			sum += x;
		}

		//输出结果
		System.out.println("1-100之和："+sum);
		System.out.println("---------------");
		*/

		//偶数:能被2整除的数据
		//如何判断数据是否能够被整出呢? x%2 == 0

		/*
		int sum = 0;

		for(int x=1; x<=100; x++) {
			if(x%2 == 0) {
				sum += x;
			}
		}

		System.out.println("1-100的偶数和："+sum);
		*/

		int sum = 0;

		for(int x=0; x<=100; x+=2) {
			sum += x;
		}

		System.out.println("1-100的偶数和："+sum);
	}
}
