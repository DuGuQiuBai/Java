/*
	continue的使用场景：
		在循环语句中
		离开使用场景的存在是没有意义的
	
	continue的作用：
		A:单层循环对比break，然后总结两个的区别
			break  退出当前循环
			continue  退出本次循环
		B:也可以带标签的使用

*/
class ContinueDemo {
	public static void main(String[] args) {
		//continue;

		for(int x=0; x<10; x++) {
			if(x%2==0) {
				//break;  //结束当前循环
				continue; //结束本次循环操作，进入下一次操作
			}
			System.out.println(x);
		}


		wc:for(int x=0; x<3; x++) {
			nc:for(int y=0; y<4; y++) {
				System.out.print("*");
				continue wc;
			}
			System.out.println();
		}
	}
}
