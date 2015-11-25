package cn.itcast_02;

public class Tool {
//	private Student student;
//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}
	
	//如果这工具，我要想获得Teacher，我们只需要把Student改为Teacher就可以了
	//但是，假如我们既要Teacher，又要Student，这个该怎么半呢?
	
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}

class Student {
	public void love() {
		System.out.println("学生爱学习");
	}
}

class Teacher {
	public void love() {
		System.out.println("老师爱林青霞");
	}
}