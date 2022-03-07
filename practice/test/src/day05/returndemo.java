package day05;
import java.util.Scanner;
public class returndemo {
    public static void main(String[] args) {
        System.out.print("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean flag = getevennumber(number);
        System.out.println(flag);
        if (flag) {
            System.out.println("您输入的整数" + number + "是一个偶数");
        } else {
            System.out.println("您输入的整数" + number + "是一个奇数");
        }
        sc.close();
    }
    public static boolean getevennumber(int a) {
        if (a%2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
