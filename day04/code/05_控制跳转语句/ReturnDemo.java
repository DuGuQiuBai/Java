/*
	return：结束方法的。
*/
class ReturnDemo {
	public static void main(String[] args) {
		for(int x=0; x<10; x++) {
			if(x%3==0) {
				//break;
				//continue;
				return;
			}
			System.out.println(x);
		}

		System.out.println("over");
	}
}