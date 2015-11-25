class Student {
	//姓名
	private String name;
	//年龄
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	//显示类的所有成员变量的方法
	public void show() {
		System.out.println("姓名是："+name+",年龄是："+age);
	}
}
class StudentDemo2 {
	public static void main(String[] args) {
		//创建对象
		Student s = new Student();

		//使用成员变量
		s.show();

		//给成员变量赋值
		s.setName("林青霞");
		s.setAge(28);

		//再次使用成员变量
		s.show();

		System.out.println("姓名是："+s.getName()+",年龄是："+s.getAge());
	}
}
