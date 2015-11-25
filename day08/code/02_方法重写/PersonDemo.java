/*
	方法重写注意事项：
		A:父类中私有方法不能被重写
		B:子类重写父类方法时，访问权限不能更低
			建议一样即可。
		C:父类静态方法，子类也必须通过静态方法进行重写。
*/
class Person {
	public void show() {
		System.out.println("show person");
	}	

	private void show2() {
		System.out.println("show2 person");
	}

	public void show3() {
		System.out.println("show3 person");
	}

	public static void show4() {
		System.out.println("show4 person");
	}
}

class Student extends Person {
	public void show() {
		System.out.println("show student");
	}

	private void show2() {
		System.out.println("show2 student");
	}

	public void show3() {
		System.out.println("show3 student");
	}

	public static void show4() {
		System.out.println("show4 student");
	}
}

class PersonDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
		//s.show2();
		s.show3();
		s.show4();
	}
}
