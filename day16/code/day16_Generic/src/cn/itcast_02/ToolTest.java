package cn.itcast_02;

/*
 * 用Object可以让我们的程序提高扩展性。
 * 但是问题是，隐含了类型转换异常。
 * 所以，这种解决方案不是特别的好。
 * 这个时候，java就提供了泛型技术。
 */
public class ToolTest {
	public static void main(String[] args) {
		Student s = new Student();
		Teacher t = new Teacher();

		// Tool t = new Tool();
		// t.setStudent(s);
		// Student ss = t.getStudent();
		// ss.love();

		Tool tool = new Tool();
		// 设置为Student
		tool.setObj(s);
		Student ss = (Student) tool.getObj();
		ss.love();

		// 设置为Teacher
		tool.setObj(t);
		Teacher tt = (Teacher) tool.getObj();
		tt.love();

		Student sss = (Student) tool.getObj();
		sss.love();
	}
}
