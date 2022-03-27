package day11;

import java.util.Calendar;
import java.util.Scanner;

public class GetFeb {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input in which YEAR you want for the number of the days in Feb:");
        int y = sc.nextInt();
        c.set(y, 2, 1);
        c.add(Calendar.DATE, -1);
        int num = c.get(Calendar.DATE);
        System.out.println("There're " + num + " days in Feb in " + y);
        sc.close();
        for (int i = 0; i < 2023; i++) {
            c.set(i, 2, 1);
            c.add(Calendar.DATE, -1);
            num = c.get(Calendar.DATE);
            System.out.println(num);
        }
    }
}
