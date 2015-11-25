package cn.itcast_02;

/*
 * 泛型在默认情况下，是Object类型。
 */
public class Tool2Test {
	public static void main(String[] args) {
		Student s = new Student();
		Teacher t = new Teacher();

		// Tool2 tool = new Tool2();
		// // 设置为Student
		// tool.setQq(s);
		// Student ss = (Student) tool.getQq();
		// ss.love();
		// // 设置为Teacher
		// tool.setQq(t);
		// Teacher tt = (Teacher) tool.getQq();
		// tt.love();
		// Student sss = (Student) tool.getQq();
		// sss.love();

		Tool2<Student> tool = new Tool2<Student>();
		tool.setQq(s);
		Student ss = tool.getQq();
		ss.love();

		// tool.setQq(t); // 编译期间就告诉你，你错了，我已经明确了，Student类型

		Tool2<Teacher> tool2 = new Tool2<Teacher>();
		tool2.setQq(t);
		Teacher tt = tool2.getQq();
		tt.love();
	}
}
