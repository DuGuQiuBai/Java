package cn.itcast_02;

import java.math.BigDecimal;

/*
 * 由于在运算的时候，float类型和double很容易丢失精度，演示案例。所以，为了能精确的表示、计算浮点数，Java提供了BigDecimal
 * 
 * public BigDecimal(String val)
 */
public class BigDecimalDemo2 {
	public static void main(String[] args) {
		// System.out.println(0.09 + 0.01); // 0.1
		// System.out.println(1.0 - 0.32); // 0.68
		// System.out.println(1.015 * 100); // 101.5
		// System.out.println(1.301 / 100);// 0.01301

		// public BigDecimal add(BigDecimal augend)
		BigDecimal bd1 = new BigDecimal("0.09");
		BigDecimal bd2 = new BigDecimal("0.01");
		System.out.println("add:" + bd1.add(bd2));

		// public BigDecimal subtract(BigDecimal subtrahend)
		BigDecimal bd3 = new BigDecimal("1.0");
		BigDecimal bd4 = new BigDecimal("0.32");
		System.out.println("subtract:" + bd3.subtract(bd4));

		// public BigDecimal multiply(BigDecimal multiplicand)
		BigDecimal bd5 = new BigDecimal("1.015");
		BigDecimal bd6 = new BigDecimal("100");
		System.out.println("subtract:" + bd5.multiply(bd6));

		// public BigDecimal divide(BigDecimal divisor)
		BigDecimal bd7 = new BigDecimal("1.301");
		BigDecimal bd8 = new BigDecimal("100");
		System.out.println("divide:" + bd7.divide(bd8));
		// public BigDecimal divide(BigDecimal divisor,int scale,
		// int roundingMode)
		System.out.println(bd7.divide(bd8, 2, BigDecimal.ROUND_HALF_UP));
		System.out.println(bd7.divide(bd8, 3, BigDecimal.ROUND_HALF_UP));
		System.out.println(bd7.divide(bd8, 4, BigDecimal.ROUND_HALF_UP));
	}
}
