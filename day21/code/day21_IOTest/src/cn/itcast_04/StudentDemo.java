package cn.itcast_04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低存入文本文件
 * 
 * 分析：
 * 		A:创建学生类
 * 		B:使用TreeSet集合存储学生信息，并按照总分排序，用比较器实现
 * 		C:键盘录入学生信息
 * 		D:遍历Set集合，把学生信息存储到文本文件
 */
public class StudentDemo {
	public static void main(String[] args) throws IOException {
		// 创建Set集合
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int num = s2.getSum() - s1.getSum();
				int num2 = num == 0 ? s1.getName().compareTo(s2.getName())
						: num;
				return num2;
			}
		});

		System.out.println("学生录入开始----------------------");
		// 键盘录入数据
		for (int x = 1; x <= 5; x++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入第" + x + "个学生的姓名：");
			String name = sc.nextLine();
			System.out.println("请输入第" + x + "个学生的语文成绩：");
			int chinese = sc.nextInt();
			System.out.println("请输入第" + x + "个学生的数学成绩：");
			int math = sc.nextInt();
			System.out.println("请输入第" + x + "个学生的英语成绩：");
			int english = sc.nextInt();

			// 创建学生对象
			Student s = new Student();
			s.setName(name);
			s.setChinese(chinese);
			s.setMath(math);
			s.setEnglish(english);

			// 把学生添加到集合
			ts.add(s);
		}
		System.out.println("学生录入结束----------------------");

		// 把学生信息存储到文本文件
		BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"));
		bw.write("姓名,语文成绩,数学成绩,英语成绩");
		bw.newLine();
		bw.flush();

		for (Student s : ts) {
			StringBuilder sb = new StringBuilder();
			sb.append(s.getName()).append(",").append(s.getChinese())
					.append(",").append(s.getMath()).append(",")
					.append(s.getEnglish());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}

		bw.close();
		System.out.println("数据成功写入文件");
	}
}
