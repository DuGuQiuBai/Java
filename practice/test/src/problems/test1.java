package problems;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.print("please input A:");
        int a = sc.nextInt();
        System.out.print("please input B:");
        int b = sc.nextInt();
        int c = a + b;
        System.out.print("A + B = " + c);
        sc.close();
    }
}