package day05;

import java.util.Scanner;

public class workout {
    public static void main(String[] args) {
        System.out.print("输入星期数：");
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        activity(week);
        sc.close();
    }

    public static void activity(int week) {
        switch (week) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("吃好的");
                break;
            default:
                System.out.println("输入有误");
                break;
        }  
    }
}
