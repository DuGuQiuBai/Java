package cn.itcast_02;

/*
 * 删除功能： 
 * public StringBuffer deleteCharAt(int index)：删除指定位置的字符
 * public StringBuffer delete(int start,int end):删除从指定位置开始到指定位置结束的内容
 */
public class StringBufferDemo2 {
	public static void main(String[] args) {
		// 创建对象
		StringBuffer buffer = new StringBuffer();

		// 添加数据
		buffer.append("hello");
		buffer.append("world");
		buffer.append("java");

		// public StringBuffer deleteCharAt(int index)：删除指定位置的字符
		// buffer.deleteCharAt(5);

		// public StringBuffer delete(int start,int end):删除从指定位置开始到指定位置结束的内容
		// buffer.delete(5, 10);
		buffer.delete(0, buffer.length());

		System.out.println("buffer:" + buffer);
	}
}
