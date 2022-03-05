package day03;
import java.util.Scanner;
public class reward {
    public static void main(String[] args) {
        Scanner range = new Scanner(System.in);
        System.out.print("输入卷面满分:");
        String num;
        if (!range.hasNextInt() && range.hasNextDouble()) {
            System.out.println("tnnd谁设计的卷面满分是小数的？？！！！给老子去SPA！！！！");
        } else if (range.hasNextDouble()) {
            num = range.next();
            double total = Double.parseDouble(num);
            if (total < 0) {
                System.out.println("cnmd输错啦！！！！！！！！");
                range.close();
                return;
            }
            System.out.print("输入你的得分:");
            Scanner sc = new Scanner(System.in);
            String num2;
            if (sc.hasNextDouble()) {
                num2 = sc.next();
                double scole = Double.parseDouble(num2);
                if (scole >= total*0.9 && scole <= total) {
                    System.out.println("奖励100元");
                } else if (scole >= total*0.8 && scole < total*0.9) {
                    System.out.println("奖励90元");
                } else if (scole >= total*0.7 && scole < total*0.8) {
                    System.out.println("奖励50元");
                } else if (scole >= total*0.6 && scole < total*0.7) {
                    System.out.println("奖励一个大嘴巴子");
                } else if (scole < total*0.6 && scole >= 0){
                    int k = (int)(total - scole);
                    System.out.println("奖励" + k + "个大嘴巴子");
                } else if (scole > total){
                    System.out.println("你个小子是不是改分了？？满分是多少都不知道？？？欠揍是吧");
                } else {
                    System.out.println("少的分被你吃了？？你个饭桶");
                }
                sc.close();
            } else {
                System.out.println("cnmd输错啦！！！！");
            }
        } else {
            System.out.println("你他奶奶滴输错啦！！！你家卷子满分是符号和字母？？？");
        }
        range.close();
    }
}
