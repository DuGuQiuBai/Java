package cn.itcast_02;

public class CharacterDemo {
	public static void main(String[] args) {
		// public static boolean isUpperCase(char ch)
		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isUpperCase('0'));
		// public static boolean isLowerCase(char ch)
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isLowerCase('0'));
		// public static boolean isDigit(char ch)
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isDigit('A'));
		System.out.println(Character.isDigit('0'));
		// public static char toUpperCase(char ch)
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toUpperCase('A'));
		// public static char toLowerCase(char ch)
		System.out.println(Character.toLowerCase('a'));
		System.out.println(Character.toLowerCase('A'));
	}
}
