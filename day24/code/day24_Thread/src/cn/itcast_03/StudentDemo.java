package cn.itcast_03;

/*
 * 我们针对学生可以设置学生的属性，也可以获取学生的属性。这里我们就把设置看成是生产，获取看成是消费就可以了。
 * 基本的类：
 * 		学生类
 * 		设置属性的线程
 * 		获取属性的线程
 * 		测试类
 * 
 * 问题1：写了一些简单的代码后，我们发现数据有问题，是null---0
 * 原因:
 * 		我们设置的对象和获取的对象不是同一个，所以，拿不到值
 * 解决：
 * 		把设置和获取的对象变成同一个
 */
public class StudentDemo {
	public static void main(String[] args) {
		// 创建一个学生资源
		Student s = new Student();

		// 创建线程对象
		SetThread st = new SetThread(s);
		GetThread gt = new GetThread(s);

		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);

		t1.start();
		t2.start();
	}
}
