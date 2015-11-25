/*
	我们曾经说过，起名字，要做到见名知意，而现在的n和a都不是一个好的变量名称。

	由于变量在查找的时候，采用的是就近原则，所以，这个时候，就产生了问题。
	本来想给成员变量赋值的，确赋值给了局部变量。
	那么，我们该如何解决这个问题呢?
	java针对这种情况，就提供了一个关键字：this

	this：代表本类的对象

	应用场景：
		局部变量隐藏成员变量
*/
class Student {
	private String name;
	private int age;

	/*
	public void setName(String n) {
		name = n;
	}
	*/

	public void setName(String name) {  //"林青霞"
		this.name = name;
	}

	public String getName() {
		return name; //其实这里隐含了this
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}

class StudentDemo {
	public static void main(String[] args) {
		//创建对象
		Student s = new Student();
		//输出成员变量的值
		System.out.println(s.getName()+"---"+s.getAge());

		//给成员变量赋值
		s.setName("林青霞");
		s.setAge(28);

		//再次输出成员变量的值
		System.out.println(s.getName()+"---"+s.getAge());
	}	
}
