package cn.itcast_06;

/*
 * È¥³ý×Ö·û´®Á½¿Õ¸ñ	
 * String trim()
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String s = "     hello  world           ";

		System.out.println("---" + s + "---");
		System.out.println("---" + s.trim() + "---");
	}
}