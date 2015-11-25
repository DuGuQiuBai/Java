/*
	Math:做数学运算的类
	特点：没有构造方法，因为它的成员都是静态的。

	需求1：获取随机数
		public static double random():该值大于等于 0.0 且小于 1.0

	需求2：获取1-100之间的随机数    
*/
class MathDemo {
	public static void main(String[] args) {
		//获取随机数
		//double d = Math.random();
		//System.out.println(d);

		/*
		for(int x=0; x<10; x++) {
			//System.out.println(Math.random());
			System.out.println(Math.random()*100);
		}
		*/

		//我们如何获取1-100之间的随机数呢?
		for(int x=0; x<100; x++) {
			int number = (int)(Math.random()*100)+1;
			System.out.println(number);
		}
	}
}