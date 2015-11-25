package cn.itcast_05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * String s = "你好";
 * 
 * 编码：
 * 		把你能够看懂的变成你看不懂
 * 解码：
 * 		把你看不懂变成你能看懂的
 * 
 * 谍战片：潜伏,回家看看去
 * 		今天晚上老地方见 -- 1011110000111  -- 十进制 -- 找个小本子 -- 找字符
 */
public class StringDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "你好";

		// public byte[] getBytes()
		// byte[] bys = s.getBytes();
		// [-60, -29, -70, -61]
		// public byte[] getBytes(String charsetName)
		byte[] bys = s.getBytes("GBK");
		// [-60, -29, -70, -61]
		// byte[] bys = s.getBytes("UTF-8");
		// [-28, -67, -96, -27, -91, -67]
		System.out.println(Arrays.toString(bys));

		// String(byte[] bytes)
		// String ss = new String(bys);
		// public String(byte[] bytes, String charsetName)
		String ss = new String(bys, "GBK");
		// String ss = new String(bys, "UTF-8");
		System.out.println(ss);
	}
}
