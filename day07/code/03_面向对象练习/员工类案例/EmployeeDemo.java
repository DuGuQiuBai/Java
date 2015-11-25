/*
	定义一个员工类,自己分析出几个成员，
	然后给出成员变量，构造方法，getXxx()/setXxx()方法，
	以及一个显示所有成员信息的方法。并测试。

	Employee：
		成员变量：员工编号,姓名,职位
		构造方法：无参，带参
		成员方法：getXxx()/setXxx()方法，show()
*/
class Employee {
	private String eid;
	private String name;
	private String job;

	public Employee() {}

	public Employee(String eid,String name,String job) {
		this.eid = eid;
		this.name = name;
		this.job = job;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEid() {
		return eid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public void show() {
		System.out.println("员工编号是："+eid+",姓名是："+name+",职位是："+job);
	}
}

class EmployeeDemo {
	public static void main(String[] args) {
		//无参
		Employee e = new Employee();
		e.setEid("itcast007");
		e.setName("周星驰");
		e.setJob("高级工程师");
		e.show();

		//带参
		Employee e2 = new Employee("itcast003","刘德华","挖掘机工程师");
		e2.show();
	}
}