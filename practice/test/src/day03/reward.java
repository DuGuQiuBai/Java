package day03;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class reward {
    public static void main(String[] args) {
        Scanner range = new Scanner(System.in);
        System.out.print("输入卷面满分:");
        String num;
        if (range.hasNextInt()) {
            num = range.next();
            int total = Integer.parseInt(num);
            if (total < 0) {
                System.out.println("cnmd输错啦！！！！！！！！");
                range.close();
                return;
            }
            System.out.print("输入你的得分");
            Scanner sc = new Scanner(System.in);
            String num2;
            if (sc.hasNextInt()) {
                num2 = sc.next();
                int scole = Integer.parseInt(num2);
                if (scole >= total*0.9 && scole <= total) {
                    System.out.println("奖励100元");
                } else if (scole >= total*0.8 && scole < total*0.9) {
                    System.out.println("奖励90元");
                } else if (scole >= total*0.7 && scole < total*0.8) {
                    System.out.println("奖励50元");
                } else if (scole >= total*0.6 && scole < total*0.7) {
                    System.out.println("奖励一个大嘴巴子");
                } else if (scole < total*0.6 && scole >= 0){
                    int k = (int)total - scole;
                    System.out.println("奖励" + k + "个大嘴巴子");
                } else {
                    System.out.println("成绩不在范围内");
                }
                sc.close();
            } else {
                System.out.println("cnmd输错啦！！！！！！！！");
            }

        } else {
            System.out.println("cnmd输错啦！！！！！！！！");
        }
        range.close();
    }
}
