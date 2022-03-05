package day03;
import java.util.Scanner;
public class week {
    public static void main(String[] args) {
        Scanner week = new Scanner(System.in);
        System.out.println("请输入一个星期数(1-7):");
        int weeknumber = week.nextInt();
        switch (weeknumber) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;        
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("星期数有误");
                break;
        }
        week.close();
    }
}
