package day03;
import java.util.Scanner;
public class season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份:");
        int season = sc.nextInt();
        switch (season) {
            case 3: case 4: case 5:
                System.out.println(season + "月是春季");
                break;
            case 6: case 7: case 8:
                System.out.println(season + "月是夏季");
                break;
            case 9: case 10: case 11:
                System.out.println(season + "月是秋季");
                break;
            case 12: case 1: case 2:
                System.out.println(season + "月是冬季");
                break;
            default:
                System.out.println("你输入的月份有误");
                break;
        }
        sc.close();
    }
}
