package day05;
import java.util.Scanner;
// 方法不能嵌套定义
// void表示无返回值，可以省略return，也可以单独的书写return，后面不加数据

public class getmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数：");
        double a = sc.nextDouble();
        System.out.print("请输入第二个数：");
        double b = sc.nextDouble();
        //double c = getmax0(a, b);
        System.out.println(a + "和" + b + "中最大的数是：" + getmax0(a, b));
        sc.close();
    }
    public static double getmax0(double a, double b) {
        double c = a > b ? a : b;
        return c;
    }
}
