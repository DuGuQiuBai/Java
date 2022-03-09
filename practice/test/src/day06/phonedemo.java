package day06;

import java.util.Scanner;

public class phonedemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        phone p = new phone();
        p.name = "xiaomi";
        System.out.print("请输入价格：");
        p.price = sc.nextInt();
        System.out.println("品牌为：" + p.name);
        System.out.println("价格为：" + p.price + "元");
        p.call();
        p.sendmassage();
        sc.close();
    }
}
