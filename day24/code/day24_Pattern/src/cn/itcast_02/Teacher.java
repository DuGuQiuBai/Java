package cn.itcast_02;

/*
 * 饿汉式：加载的时候就创建对象
 * 懒汉式：在用的时候再去创建对象
 * 		线程安全问题
 * 		延迟加载思想(什么时候用，什么时候加载)
 * 
 * 面试题:请写一个Singleton
 * 面试：懒汉式
 * 开发：饿汉式
 * 
 * 为什么呢?
 * 		懒汉式容易出问题，而饿汉式不会出问题。
 * 		线程安全问题。
 */
public class Teacher {
	private Teacher() {
	}

	private static Teacher t = null;

	public synchronized static Teacher getTeacher() {
		// t1,t2,t3
		if (t == null) {
			// t1,t2,t3
			t = new Teacher();
		}
		return t;
	}
}
