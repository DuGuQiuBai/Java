/*
	某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，
	在传递过程中需要加密，加密规则如下：
		首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字，
		最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
		然后，把加密后的结果在控制台打印出来。

	分析：
		A:数据是小于8位的整数
			数据是变化的。(不以0开头)
		B:加密规则
			假设数据为：123456

			首先将数据倒序
				654321
			然后将每位数字都加上5，再用和除以10的余数代替该数字
				109876
			最后将第一位和最后一位数字交换
				609871
		C:输出结果
			609871
*/
class JiaMiDemo{
	public static void main(String[] args) {
		//123456
		//int[] arr = {1,2,3,4,5,6};

		//定义数据
		int number = 123456;

		//定义数组
		int[] arr = new int[8];

		//取得一个数据的任意位上的值
		//6,5,4,3,2,1
		/*
		arr[0] = number%10;
		arr[1] = number/10%10;
		arr[2] = number/10/10%10;
		...
		*/

		//第一步
		//定义一个索引变量
		int index = 0;

		while(number>0) {
			arr[index]  = number%10; //arr[0]=6,arr[1]=5,arr[2]=4,arr[3]=3,arr[4]=2,arr[5]=1
			number/=10; //number=12345,number=1234,number=123,number=12,number=1,number=0
			index++; //index=1,index=2,index=3,index=4,index=5,index=6
		}

		for(int x=0; x<index; x++) {
			System.out.print(arr[x]);
		}
		System.out.println();

		//第二步
		for(int x=0; x<index; x++) {
			arr[x] += 5;
			arr[x] %= 10;
		}	

		for(int x=0; x<index; x++) {
			System.out.print(arr[x]);
		}
		System.out.println();

		//第三步
		int temp = arr[0];
		arr[0] = arr[index-1];
		arr[index-1] = temp;

		for(int x=0; x<index; x++) {
			System.out.print(arr[x]);
		}
		System.out.println();
	}
}