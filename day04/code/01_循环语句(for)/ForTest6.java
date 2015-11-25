/*
	需求：请统计1-1000之间同时满足如下条件的数据有多少个：
			对3整除余2
			对5整除余3
			对7整除余2

	分析：
		A:定义一个统计变量。
		B:1-1000之间告诉我们了范围，用for循环可以解决
		C:条件
			对3整除余2
			对5整除余3
			对7整除余2

			x%3 == 2
			x%5 == 3
			x%7 == 2
*/
class ForTest6 {
	public static void main(String[] args) {
		//定义一个统计变量。
		int count = 0;

		//1-1000之间告诉我们了范围，用for循环可以解决
		for(int x=1; x<=1000; x++) {
			//判断条件
			if(x%3==2 && x%5==3 && x%7==2) {
				//System.out.println(x);
				count++;
			}
		}

		System.out.println("共有"+count+"个满足条件的数据");
	}
}
