/*
	需求：统计”水仙花数”共有多少个

	分析：
		A:我们要统计有多少个满足条件的数据，就要定义一个统计变量
			int count = 0;
		B:一个三位数其实告诉我们的是范围，通过for循环就可以搞定。
		C:其各位数字的立方和等于该数本身就是规则
			我们如何取得每一个位上的数据呢?

			给了任意的一个数据x 153
			个位：x%10
			十位：x/10%10
			百位：x/10/10%10
			千位：x/10/10/10%10
			...

			x == (个位*个位*个位 + 十位*十位*十位 + 百位*百位*百位)
*/
class ForDemo4 {
	public static void main(String[] args) {
		//定义统计变量
		int count = 0;

		for(int x=100; x<1000; x++) {
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;

			if(x == (ge*ge*ge + shi*shi*shi + bai*bai*bai)) {
				count++;
			}
		}

		System.out.println("水仙花数共有："+count+"个");
	}
}
