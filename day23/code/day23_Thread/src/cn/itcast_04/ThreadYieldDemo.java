package cn.itcast_04;

/*
 * public static void yield():礼让线程,暂停当前正在执行的线程对象，并执行其他线程。 
 */
public class ThreadYieldDemo {
	public static void main(String[] args) {
		ThreadYield ty1 = new ThreadYield();
		ThreadYield ty2 = new ThreadYield();

		ty1.setName("孔融");
		ty2.setName("梨");

		ty1.start();
		ty2.start();
	}
}
