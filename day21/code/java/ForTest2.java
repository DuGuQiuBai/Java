/*
	需求：求出1-10之间数据之和
		0+1=1
			1+2=3
				3+3=6
					6+4=10
						10+5=15
							...

		因为每一次的累加结果都是变化的，所以要定义一个变量，专门用于记录每次累加的结果。
		由于我们需要的1，2，3，4...也是变化的，所以我们也要定义一个变量，而这个变量用循环就能得到每个值。
*/
class ForTest2 {
	public static void main(String[] args) {
		//最好想
		//System.out.println(1+2+3+4+5+6+7+8+9+10);
	
		//跟循环结合起来
		int sum = 0;

		for(int x=1; x<=10; x++) {
			//x=1,2,3,4,...10

			//sum = sum + x; //sum=0 + 1 = 1;
			//sum = sum + x; //sum=1 + 2 = 3;

			//sum = sum + x;
		
			sum += x;
		}

		System.out.println("1-10的和是："+sum);
	}
}