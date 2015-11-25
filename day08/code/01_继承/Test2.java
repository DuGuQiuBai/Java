/*
	基础知识：
		A:继承间的构造方法关系
			创建子类对象，会先去访问父类的构造方法。对父类的数据进行初始化。
		B:继承间的成员变量关系
			就近原则
		C:this和super的使用
		D:一个类的初始化过程
			成员变量初始化
				默认
				显示
				构造方法
*/
class Fu{
	public int num = 10;
	public Fu(){
		System.out.println("fu");
	}
}
class Zi extends Fu{
	public int num = 20;
	public Zi(){
		System.out.println("zi");
	}
	public void show(){
		int num = 30;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}
class Test2 {
	public static void main(String[] args) {
		Zi z = new Zi();  
		z.show();
	}
}