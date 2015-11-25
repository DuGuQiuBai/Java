/*
	假如我们在开发一个系统时需要对员工类进行设计，员工包含3个属性：姓名、工号以及工资。
	经理也是员工，除了含有员工的属性外，另为还有一个奖金属性。
	请使用继承的思想设计出员工类和经理类。要求类中提供必要的方法进行属性访问。
	
	员工类：
		普通员工：
			姓名、工号以及工资
		经理：
			姓名、工号以及工资，奖金
*/
abstract class Employee {
	private String name;
	private String eid;
	private int salary;

	public Employee() {}

	public Employee(String name,String eid,int salary) { //"白一懋","10000",500
		this.name = name; 
		this.eid = eid;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	} 

	public String getName() {
		return name;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEid() {
		return eid;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void show() {
		System.out.println(name+"---"+eid+"---"+salary);
	}

	public abstract void work();
}

class Programmer extends Employee {
	public Programmer() {}

	public Programmer(String name,String eid,int salary) {
		super(name,eid,salary);
	}

	public void work() {
		System.out.println("攻城狮辛辛苦苦写代码");
	}
}

class Manager extends Employee {
	private int bonus;

	public Manager() {}

	public Manager(String name,String eid,int salary,int bonus) { //"白一懋","10000",500,10000
		super(name,eid,salary); //"白一懋","10000",500
		this.bonus = bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void work() {
		System.out.println("经理辛辛苦苦和客户谈需求");
	}

	public void show() {
		//System.out.println(getName()+"---"+getEid()+"---"+getSalary()+"---"+bonus);

		super.show();
		System.out.println("经理额外的奖金是："+bonus);
	}
}

class EmployeeDemo {
	public static void main(String[] args) {
		//程序员
		Programmer p = new Programmer();
		p.setName("谢家进");
		p.setEid("10010");
		p.setSalary(7700);
		p.show();
		p.work();
		//另外三种不写了。
		System.out.println("---------------------");

		//经理的测试
		/*
		Employee e = new Manager();
		e.setName("王妮");
		e.setEid("10086");
		e.setSalary(6000);
		//e.setBonus(2000);
		e.show();
		e.work();
		*/

		Employee e = new Manager("白一懋","10000",500,10000);
		e.show();
		e.work();
	}
}