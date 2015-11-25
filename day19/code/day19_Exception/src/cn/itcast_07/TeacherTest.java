package cn.itcast_07;

import java.util.Scanner;

public class TeacherTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入考试成绩： ");
		int score = sc.nextInt();

		Teacher t = new Teacher();
		try {
			t.check(score);
		} catch (MyException e) {
			// System.out.println(e.toString()); // cn.itcast_07.MyException:
			// 分数不在0-100之间
			e.printStackTrace();
		}
	}
}
