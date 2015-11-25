package cn.itcast_02;

/*
 * 泛型方法：把泛型添加到方法上。
 * 格式：
 * 		public <泛型类型> 返回类型 方法名(泛型类型 .)
 */
public class Tool3 {
	// public void print(String s) {
	// System.out.println(s);
	// }
	//
	// public void print(Integer i) {
	// System.out.println(i);
	// }
	//
	// public void print(Boolean b) {
	// System.out.println(b);
	// }

	public <BMW> void print(BMW bmw) {
		System.out.println(bmw);
	}
}
