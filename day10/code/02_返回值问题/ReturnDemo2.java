//如果返回值是一个引用数据类型
//类：返回的是该类的对象
//抽象类：返回的是该抽象类的子类对象
//接口：返回的是该接口的实现类对象
/*
class Student {
	public void study() {
		System.out.println("好好学习，天天向上");
	}
}

class StudentDemo {
	public Student getStudent() {
		//Student s = new Student();
		//return s;

		return new Student();
	}

	public int sum(int a,int b) {
		return a + b;
	}
}

class ReturnDemo2 {
	public static void main(String[] args) {
		StudentDemo sd = new StudentDemo();
		Student s = sd.getStudent();  //new Student();
		s.study();
	}
}
*/

/*
abstract class Person {
	public abstract void study();
}

class PersonDemo {
	public Person getPerson() {
		return new Student();
	}
}

class Student extends Person {
	public void study() {
		System.out.println("好好学习，天天向上");
	}
}

class ReturnDemo2 {
	public static void main(String[] args) {
		PersonDemo pd = new PersonDemo();
		Person p = pd.getPerson();  //new Student();
		p.study();
	}
}
*/

