package cn.itcast_02;

import java.util.Date;

public class DateToolTest {
	public static void main(String[] args) {
		Date d = new Date();

		// 需求：我要获取年月日时分秒
		System.out.println(DateTool.getRiQi(d));
		System.out.println(DateTool.getNYR(d));
		System.out.println(DateTool.getSFM(d));
	}
}