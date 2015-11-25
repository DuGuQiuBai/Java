/*
	成员变量和局部变量的区别：
		A:在类中的位置不同
			成员变量 类中方法外
			局部变量 方法内或者方法声明上
		B:在内存中的位置不同
			成员变量 堆内存
			局部变量 栈内存
		C:生命周期不同
			成员变量 随着对象的存在而存在，随着对象的消失而消失
			局部变量 随着方法的调用而存在，随着方法的调用完毕而消失
		D:初始化值不同
			成员变量 有默认的初始化值
			局部变量 没有默认的初始化值，必须先定义，赋值，才能使用。

		注意：
			如果有同名的变量，一般会采用就近原则。
*/
class VariableDemo {
	//成员变量
	int x;

	public static void main(String[] args) {
		//局部变量
		int y;
		//System.out.println(y);

		VariableDemo vd = new VariableDemo();
		System.out.println(vd.x);
	}
}