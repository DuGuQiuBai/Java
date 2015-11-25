/*
	继承间的成员变量关系：
		名字不同：非常的简单，一看就知道使用的是谁。
		名字相同：就近原则。

	使用变量的时候，会先找局部范围。
	如果想直接使用成员变量，加关键字：this即可。
	如果想直接使用父类的成员变量，加关键字：super即可。
*/
class Father {
	public int age = 40;
}

class Son extends Father {
	public int num = 100;
	public int age = 20;

	public void show() {
		int age = 60;
		System.out.println(age); //局部范围
		System.out.println(this.age); //本类成员范围
		System.out.println(super.age); //父类成员范围
		System.out.println(num);
	}
}

class ExtendsDemo3 {
	public static void main(String[] args) {
		Son s = new Son();
		//System.out.println(s.age);
		//System.out.println(s.num);

		s.show();
	}
}
