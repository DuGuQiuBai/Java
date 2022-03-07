package day05;
//已知一个数组arr = {19,28,37,46,50};键盘录入一个数据，查找该数据在数组中的索引，并在控制台输出找到的索引值。

import java.util.Scanner;

public class arrcheck {
    public static void main(String[] args) {
        int[] arr = {12, 54, 65, 23, 99, 10};
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要查找的数据：");
        int number = sc.nextInt();
        int i = check(number, arr);
        if (i == -1) {
            System.out.println("数组内没有此数据");
        } else {
            System.out.println(number + "在数组arr内的索引值为：" + i);
        }
        sc.close();
    }
    public static int check(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
