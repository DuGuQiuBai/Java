package cn.itcast_01;

/*
 * 需求：请定义一个数组，存储三个学生对象，然后遍历该数组，得到每一个学生对象的成员变量值。
 * 
 * Student[]	对象数组。
 */
public class StudentDemo {
	public static void main(String[] args) {
		// 创建对象数组
		Student[] students = new Student[3];

		// 默认值是null
		for (int x = 0; x < students.length; x++) {
			System.out.println(students[x]);
		}

		// 创建学生对象元素
		Student s1 = new Student("林青霞", 28);
		Student s2 = new Student("风清扬", 31);
		Student s3 = new Student("林志玲", 18);

		// 把元素放到数组中
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;

		// 赋值后的学生对象
		for (int x = 0; x < students.length; x++) {
			// System.out.println(students[x]);
			Student s = students[x];
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
