//形式参数如果是引用类型：
//具体类：该类的对象。
//抽象类：该类的子类对象。
//接口：该接口的实现类对象。
//数组：数组的地址值。其实就是一个数组对象。

/*
class Student {
	public void study() {
		System.out.println("好好学习,天天向上");
	}
}

class StudentDemo {
	public void method(Student s) {
		s.study();
	}
}

class ArgsDemo2 {
	public static void main(String[] args) {
		StudentDemo sd = new StudentDemo();
		Student s = new Student();
		sd.method(s);
	}
}
*/

/*
abstract class Person {
	public abstract void study();
}

class PersonDemo {
	public void method(Person p) {
		p.study();
	}
}

class Student extends Person {
	public void study() {
		System.out.println("好好学习,天天向上");
	}
}

class ArgsDemo2 {
	public static void main(String[] args) {
		PersonDemo pd = new PersonDemo();
		Person p = new Student();
		pd.method(p);
	}
}
*/
interface Person {
	public abstract void study();
}

class PersonDemo {
	public void method(Person p) {
		p.study();
	}
}

class Student implements Person {
	public void study() {
		System.out.println("好好学习,天天向上");
	}
}

class ArgsDemo2 {
	public static void main(String[] args) {
		PersonDemo pd = new PersonDemo();
		Person p = new Student();
		pd.method(p);
	}
}