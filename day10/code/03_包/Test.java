package cn.itcast;

/*
	导包格式
		import 包名..类名;

	package,import,class有没有顺序关系(面试题)
		有。
		package --> import --> class
		唯一		多个		多个
*/
import com.liuyi.Demo;

public class Test {
	public static void main(String[] args) {
		/*
		com.liuyi.Demo d = new com.liuyi.Demo();
		int result = d.sum(10,20);
		System.out.println(result);

		com.liuyi.Demo d2 = new com.liuyi.Demo();
		int result2 = d2.sum(10,20);
		System.out.println(result2);

		com.liuyi.Demo d3 = new com.liuyi.Demo();
		int result3 = d3.sum(10,20);
		System.out.println(result3);
		*/

		Demo d = new Demo();
		int result = d.sum(10,20);
		System.out.println(result);
	}
}