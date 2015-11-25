package cn.itcast_01;

/*
 * 需求1：我给出了一个数据，我要判断这个数据是不是在int范围呢?肿么办呢?
 * 需求2：我给出一个数据100，我要得到它的二进制，八进制，十六进制? 三进制，五进制，七进制???
 * 那么，有没有比较简单的方式让我们来实现这样的需求呢?有。
 * 而基本类型是做不到的，因为基本类型没有功能可以使用。所以，这种的操作最好是能有功能实现。
 * 然后我们调用功能即可。
 * 为了简化我们针对基本类型数据的更复杂的操作，java就针对每种基本类型提供了一个包装类类型，基本类型包装类。
 * byte		Byte
 * short	Short
 * int		Integer
 * long		Long
 * float	Float
 * double	Double
 * char		Character
 * boolean	Boolean
 */
public class IntegerDemo {
	public static void main(String[] args) {
		// public static final int MAX_VALUE
		// public static final int MIN_VALUE
		// if(数据>=Integer.MIN_VALUE && 数据<=Integer.MAX_VALUE){}

		// public static String toBinaryString(int i)
		System.out.println(Integer.toBinaryString(100));
		// public static String toOctalString(int i)
		System.out.println(Integer.toOctalString(100));
		// public static String toHexString(int i)
		System.out.println(Integer.toHexString(100));
	}
}
