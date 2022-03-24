package day08;

import java.util.Scanner;

public class traverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input Strings:");
        String line = sc.nextLine();
        sc.close();
        int A = 0;
        int a = 0;
        int num = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) > 'A' && line.charAt(i) < 'Z') {
                A++;
            } else if (line.charAt(i) > 'a' && line.charAt(i) < 'z') {
                a++;
            } else if (line.charAt(i) > '0' && line.charAt(i) < '9') {
                num++;
            }
        }
        System.out.println("capital letters:" + A);
        System.out.println("lowercase letters:" + a);
        System.out.println("numbers:" + num);
    }
    
}