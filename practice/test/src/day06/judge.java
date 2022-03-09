package day06;

//在编程竞赛中，有6个评委为参赛的选手打分。分数为0-100的整数分。
//选手的最后得分为:去掉一个最高分和一个最低分后的4个评委平均值(不考虑小数部分)。

import java.util.Arrays;
import java.util.Scanner;

public class judge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] scole = new double[6];
        int j = 0;
        for (int i = 0; i < scole.length; i++) {
            j = i + 1;
            System.out.print("请输入第" + j + "位评委的打分：");
            scole[i] = sc.nextInt();
            Boolean flag = row(scole[i]);
            if (!(flag)) {
                System.out.println("输入数据有误，请重新输入");
                break;
            }
        }
        boolean flag = row(scole[j-1]);
        if (flag) {
            sc.close();
            Arrays.sort(scole);
            int total = 0;
            for (int i = 1; i < scole.length - 1; i++) {
                total += scole[i];
            }
            int totalscole = (int)(total/4);
            System.out.print("选手最后得分为：" + totalscole);
        } else {

        }
    }
    public static boolean row(double scole) {
        if (scole > 0 && scole < 100) {
            return true;
        }
        return false;
    }
}
