package cn.itcast_07;

public class Teacher {
	public void check(int score) throws MyException {
		if (score < 0 || score > 100) {
			throw new MyException("分数不在0-100之间");
		} else {
			System.out.println("分数正常");
		}
	}
}
