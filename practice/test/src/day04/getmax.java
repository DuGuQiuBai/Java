package day04;
import java.util.Scanner;
public class getmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数：");
        int a = sc.nextInt();
        System.out.print("请输入第二个数：");
        int b = sc.nextInt();
        getmax0(a, b);
    }
    public static void getmax0(int a, int b) {
        int c = a > b ? a : b;
        System.out.println("最大的数是：" + c);
    }
}
