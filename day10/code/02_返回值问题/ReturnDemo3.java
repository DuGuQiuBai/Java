//返回值类型是接口，其实返回的是接口的实现类对象
interface Person {
	public abstract void study();
}

class PersonDemo {
	public Person getPerson() {
		return new Student();
	}
}

class Student implements Person {
	public void study() {
		System.out.println("好好学习，天天向上");
	}
}

class ReturnDemo3 {
	public static void main(String[] args) {
		//PersonDemo pd = new PersonDemo();
		//Person p = pd.getPerson();
		//p.study();
		
		//链式编程
		new PersonDemo().getPerson().study();
	}
}