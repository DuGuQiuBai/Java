package cn.itcast_04;

/*
 * 把数组拼接成一个字符串
 */
public class StringBufferTest {
	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55 };
		
		String result = arrayToString(arr);
		System.out.println(result);
	}

	public static String arrayToString(int[] arr) {
		StringBuffer sb = new StringBuffer();

		sb.append("[");
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				sb.append(arr[x]);
			} else {
				sb.append(arr[x]).append(", ");
			}
		}
		sb.append("]");

		return new String(sb);
	}
}
