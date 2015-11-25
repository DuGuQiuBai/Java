package cn.itcast_03;

import java.util.Arrays;

/*
 * public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 */
public class SystemDemo2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 6, 7, 8, 9, 10 };

		System.arraycopy(arr, 1, arr2, 2, 2);

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
}
