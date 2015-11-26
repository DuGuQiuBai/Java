package cn.itcast_02;

public class SingletDemo {
	public static void main(String[] args) {
		Teacher t1 = Teacher.getTeacher();
		Teacher t2 = Teacher.getTeacher();

		System.out.println(t1 == t2);
	}
}
