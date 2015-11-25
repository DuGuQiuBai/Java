/*
	构造方法：给对象的数据进行初始化

	特点：
		A:方法名与类名相同
		B:没有返回值类型，连void都没有
		C:没有具体的返回值

	构造方法的格式：
		修饰符 类名(...) {
		
		}

	构造方法的注意事项：
		A:如果你不提供构造方法，系统会给出默认无参构造方法
		B:如果你提供了构造方法，系统将不再提供默认无参构造方法
			这个时候，如果你还想继续使用无参构造方法，只能自己给出。
			推荐：永远自己给出无参构造方法。
		C:构造方法也是可以重载的
		D:构造方法中可以有return语句吗?
			可以。只不过是return;

*/
class Student {
	//成员变量
	private String name;
	private int age;

	//构造方法
	public Student() {
		System.out.println("我是无参构造方法");
		//return;
	}

	public Student(String name) {
		this.name = name;
	}

	public Student(int age) {
		this.age = age;
	}

	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}

	//getXxx()/setXxx()方法
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

	//显示所有成员变量的方法
	public void show() {
		System.out.println("姓名是："+name+",年龄是："+age);
	}
}

class StudentDemo {
	public static void main(String[] args) {
		//创建对象
		Student s = new Student();
		s.show();

		//创建对象
		Student s2 = new Student("林青霞");
		s2.show();

		//创建对象
		Student s3 = new Student(28);
		s3.show();

		//创建对象
		Student s4 = new Student("林青霞",28);
		s4.show();
	}
}