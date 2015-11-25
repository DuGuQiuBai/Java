//饮食文化
class Person {
	public void eat() {
		System.out.println("person eat");
	}
}

class SouthPerson extends Person  {
	public void eat() {
		System.out.println("南方人喜欢吃米饭");
	}
}

class NorthPerson extends Person {
	public void eat() {
		System.out.println("北方人喜欢吃拉条子");
	}
}

class PersonDemo {
	public static void main(String[] args) {
		Person p = new Person();
		p.eat();

		SouthPerson sp = new SouthPerson();
		sp.eat();

		//p = sp;
		//p.eat();
		Person pp = new SouthPerson();
		pp.eat();
	}
}
