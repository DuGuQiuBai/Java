package cn.itcast_02;

/*
 * 反转功能	 public StringBuffer reverse()
 */
public class StringBufferDemo4 {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();

		buffer.append("java").append("霞青林爱我");

		buffer.reverse();

		System.out.println("buffer:" + buffer);
	}
}
