package cn.itcast_05;

/*
 * JDK5的新特性：
 * 		自动装箱:int -- Integer
 * 				底层方法：public static Integer valueOf(int i)
 * 		自动拆箱：Integer -- int
 * 				底层方法：public int intValue()
 * 
 * 注意：对象不能为null。
 * 开发原则：只要是对象，做操作，肯定先判断对象是否为null，如果不为null，才继续操作。
 */
public class IntegerDemo {
	public static void main(String[] args) {
		// Integer i = new Integer(100);
		Integer i = 100; // 自动装箱
		// Integer i = Integer.valueOf(100);

		i += 200; // i = i + 200
		// i = Integer.valueOf(i.intValue() + 200);

		System.out.println(i);
	}
}
