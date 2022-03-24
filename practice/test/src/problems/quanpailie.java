package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class quanpailie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        //ArrayList<int> arr = new ArrayList<int>();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        if (n >= 1 && n <= 9) {
            int index = 0;
            while (true) {
                arrprint(arr);
                for (int i = arr.length - 2; i >= 0; i--) {
                    if (arr[i] < arr[i + 1]) {
                        index = i;
                        break;
                    } else if (i <= 0) {
                        return;
                    }
                }
                for (int i = arr.length - 1; i >= 0; i--) {
                    if (arr[i] > arr[index]) {
                        num_exchg(arr, i, index);
                        break;
                    }
                }
                reverse(arr, index + 1);
            }
        }

    }

    // 逆序 i逆序开始的下标
    public static void reverse(int[] arr, int i) {
        int k = i, j = arr.length - 1;
        while (k < j) {
            num_exchg(arr, k, j);
            k++;
            j--;
        }
    }

    // 交换ab处数据
    public static void num_exchg(int[] arr, int a, int b) {
        int trans = arr[a];
        arr[a] = arr[b];
        arr[b] = trans;
    }

    // 输出arr
    public static void arrprint(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            if (j == arr.length - 1) {
                System.out.println(arr[j]);
            } else {
                System.out.print(arr[j] + " ");
            }
        }
    }
}
