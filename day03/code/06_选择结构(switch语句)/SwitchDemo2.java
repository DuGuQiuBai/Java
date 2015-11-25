/*
	注意事项
		A:case后面只能是常量，不能是变量，而且，多个case后面的值不能出现相同的
		B:default可以省略吗
			可以省略。一般不建议。除非判断的值是固定的。
		C:break可以省略吗
			可以。最后一个肯定是没有任何问题的。
			中间的省略也是可以的，但是不建议，因为可能对我们想要的结果产生影响。
		D:default的位置一定要在最后吗
			不一定，可以在任何和case相对应的位置。
			但是，这个时候，最好加上break。
		E:switch语句的结束条件
			a:遇到break。
			b:执行到程序的末尾
*/
class SwitchDemo2 {
	public static void main(String[] args) {
		int week = 3;
		//int y = 4;

		switch(week) {
			case 1:
				System.out.println(1);
				break;
			case 2:
				System.out.println(2);
				break;
			default:
				System.out.println(5);
				break;
			case 3:
				System.out.println(3);
				break;
			case 4:
				System.out.println(4);
				break;
			/*
			default:
				System.out.println(5);
				//break;
			*/
		}
	}
}
