package day03;
import java.util.Scanner;
public class reward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scole = sc.nextInt();
        if (scole < 0 || scole >100) {
            System.out.println("错误数据，请重新输入");
            int scole2 = sc.nextInt();
            if (scole2 >= 95 && scole2 <= 100) {
                System.out.println("奖励100元");
            } else if (scole2 >= 85 && scole2 < 95) {
                System.out.println("奖励90元");
            } else if (scole2 >= 70 && scole2 < 85) {
                System.out.println("奖励50元");
            } else if (scole2 >= 60 && scole2 < 70) {
                System.out.println("奖励一个大嘴巴子");
            } else {
                int k = 100-scole2;
                System.out.println("奖励" + k + "个大嘴巴子");
            }
        } else if (scole >= 95 && scole <= 100) {
            System.out.println("奖励100元");
        } else if (scole >= 85 && scole < 95) {
            System.out.println("奖励90元");
        } else if (scole >= 70 && scole < 85) {
            System.out.println("奖励50元");
        } else if (scole >= 60 && scole < 70) {
            System.out.println("奖励一个大嘴巴子");
        } else {
            int k = 100-scole;
            System.out.println("奖励" + k + "个大嘴巴子");
        }
        sc.close();
    }
}
