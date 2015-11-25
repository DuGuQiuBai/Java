/*
	面试题：
		short s=1, s = s+1; short s=1, s+=1;
		上面两个代码有没有问题，如果有，那里有问题
*/
class OperatorTest {
	public static void main(String[] args) {
		//short s = 1;
		//s = s + 1; 
		//有问题，可能损失精度
		
		short s = 1;
		s += 1; //s = s + 1;
		//这个是没有问题的。
		//因为这个式子等价于：
		// s = (s的数据类型)(s + 1);
	}
}