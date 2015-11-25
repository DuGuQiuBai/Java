/*
	break:中断

	break的使用场景：
		A:在选择结构switch语句中
		B:在循环语句中
		离开使用场景的存在是没有意义的

	break:
		A:跳出单层循环
		B:跳出多层循环(了解)
			带标签的用法
*/
class BreakDemo {
	public static void main(String[] args) {
		for(int x=0; x<10; x++) {
			//System.out.println(x);
			if(x%2==0) {
				break;
				//break后面是不能有东西的
				//System.out.println(x);
			}

			System.out.println(x);
		}
		System.out.println("-------------");

		wc:for(int x=0; x<3; x++) {
			nc:for(int y=0; y<4; y++) {
				System.out.print("*");
				break;
			}
			System.out.println();
		}
	}
}