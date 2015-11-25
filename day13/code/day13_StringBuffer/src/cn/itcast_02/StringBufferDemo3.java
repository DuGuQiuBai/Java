package cn.itcast_02;

/*
 * public StringBuffer replace(int start,int end,String str):用给定的字符串替换从指定位置开始到指定位置结束的数据
 */
public class StringBufferDemo3 {
	public static void main(String[] args) {
		// 创建对象
		StringBuffer buffer = new StringBuffer();

		buffer.append("hello").append("world").append("java");

		// public StringBuffer replace(int start,int end,String
		// str):用给定的字符串替换从指定位置开始到指定位置结束的数据
		buffer.replace(3, 8, "haha");

		System.out.println("buffer:" + buffer);
	}
}
