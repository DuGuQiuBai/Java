package day10;

import java.util.Scanner;

public class maopao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input how much numbers you have:");
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++) {
            String s = Ordinal(i + 1);
            System.out.print("Please input the " + s + " number:");
            num[i] = sc.nextInt();
        }
        System.out.print("Before sorting: ");
        PrintArr(num);

        int temp;
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] < num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        System.out.print("After sorting: ");
        PrintArr(num);
        sc.close();
    }

    public static void PrintArr(int[] num) {
        System.out.print("[");
        for (int i = 0; i < num.length; i++) {
            if (i == num.length - 1) {
                System.out.print(num[i]);
            } else {
                System.out.print(num[i] + ", ");
            }
        }
        System.out.println("]");
    }

    public static String Ordinal(int a) {
        String ord;
        switch (a % 10) {
            case 1:
                ord = a + "st";
                break;
            case 2:
                ord = a + "nd";
                break;
            case 3:
                ord = a + "rd";
                break;
            default:
                ord = a + "th";
                break;
        }
        return ord;
    }
}
