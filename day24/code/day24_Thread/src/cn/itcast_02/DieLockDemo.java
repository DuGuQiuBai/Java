package cn.itcast_02;

/*
 * 死锁：是指两个或者两个以上的线程在执行的过程中，因争夺资源产生的一种互相等待现象
 * 
 * 举例：
 * 		中国人和一个美国人吃饭。
 * 			中国人：两只筷子
 * 			美国人：刀叉
 * 		真实情况：	
 * 			中国人：一只筷子，一把刀
 * 			美国人：一只筷子，一把叉
 */
public class DieLockDemo {
	public static void main(String[] args) {
		DieLock d1 = new DieLock(true);
		DieLock d2 = new DieLock(false);

		d1.start();
		d2.start();
	}
}
