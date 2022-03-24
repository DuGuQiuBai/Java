package day08;

import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        // 转换格式
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        String S = arrtostring(arr);
        System.out.println(S);
        StringBuilder S1 = arrtoSbuilder(arr);
        System.out.println(S1);
        // 反转字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("please input String:");
        String line = sc.nextLine();
        sc.close();
        String enil = reverse(line);
        String enil_upgrade = reverse_upgrade(line);
        System.out.println(enil_upgrade);
        System.out.println(enil);
        // stingbuilder 使用
        StringBuilder sss = new StringBuilder();
        sss.append("sb").append("sad").reverse();
        System.out.println(sss);

        String sb1 = sss.toString();
        StringBuilder sb2 = new StringBuilder(sb1);
        System.out.println(sb1 + sb2);
    }

    public static String arrtostring(int[] arr) {
        String S = "";
        S += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                S += arr[i];
                S += "]";
            } else {
                S += arr[i];
                S += ", ";
            }
        }
        return S;
    }

    public static StringBuilder arrtoSbuilder(int[] arr) {
        StringBuilder S = new StringBuilder();
        S.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                S.append(arr[i]).append("]");
            } else {
                S.append(arr[i]).append(", ");
            }
        }
        return S;
    }

    public static String reverse(String s) {
        String ss = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ss += s.charAt(i);
        }
        return ss;
    }

    public static String reverse_upgrade(String s) {
        StringBuilder ss = new StringBuilder(s);
        String result = ss.reverse().toString();
        return result;
        //return new Stringbuilder(s).reverse().toString();
    }
}
