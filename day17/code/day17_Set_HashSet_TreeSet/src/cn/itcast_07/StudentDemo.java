package cn.itcast_07;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台
 * 
 * 分析：
 * 		A:定义一个学生类，里面有成员变量：姓名,语文成绩,数学成绩,英语成绩
 * 		B:因为我们最终要按照总分进行排序，说明我们要排序，所以，选择TreeSet集合
 * 		C:两种方式实现，我们选择一种，用比较器实现
 * 		D:键盘录入学生，存储到TreeSet集合
 * 		E:遍历集合
 */
public class StudentDemo {
	public static void main(String[] args) {
		// 创建集合
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				// 主要条件
				int num = s2.getSum() - s1.getSum();
				// 次要条件，一次比较语文成绩，数学成绩，英语成绩，姓名
				int num2 = num == 0 ? s1.getName().compareTo(s2.getName())
						: num;
				return num2;
			}
		});
		System.out.println("学生录入开始");
		Scanner sc = new Scanner(System.in);
		// 5次
		for (int x = 1; x <= 5; x++) {
			// 录入学生信息
			System.out.println("请输入第" + x + "个学生的姓名：");
			String name = sc.nextLine();
			System.out.println("请输入第" + x + "个学生的语文成绩：");
			int chinese = Integer.parseInt(sc.nextLine());
			System.out.println("请输入第" + x + "个学生的数学成绩：");
			int math = Integer.parseInt(sc.nextLine());
			System.out.println("请输入第" + x + "个学生的英语成绩：");
			int english = Integer.parseInt(sc.nextLine());

			// 创建学生对象
			Student s = new Student();
			s.setName(name);
			s.setChinese(chinese);
			s.setMath(math);
			s.setEnglish(english);

			// 添加到集合
			ts.add(s);
		}

		// 输出一句话
		System.out.println("学生录入完毕");

		// 遍历集合
		for (Student s : ts) {
			System.out.println(s.getName() + "---" + s.getChinese() + "---"
					+ s.getMath() + "---" + s.getEnglish());
		}
	}
}
