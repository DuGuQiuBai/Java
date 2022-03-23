package problems;

import java.util.Arrays;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        System.out.println("请输入待排列的数据总个数:");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] daysList = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("请输入第" + (i + 1) + "个数：");
            daysList[i] = in.nextInt();
        }
        in.close();
        permute(daysList, 0);
    }

    public static void permute(int[] array, int start) {
        Arrays.sort(array);// 先排个序
        int index = 0;

        while (true) {
            printArray(array);// 输出
            // 从右往左寻找第一个逆序
            for (int i = array.length - 2; i >= 0; i--) {
                if (array[i] < array[i + 1]) {
                    index = i;// 找到第一个逆序下标
                    break;
                } else if (i <= 0) {// 若不存在逆序，即到了例如54321这种排列，则说明排列完了
                    return;
                }
            }
            // 到这里找到了第一个逆序的下标，应该将这个下标的数字与，从右往左第一个大于该数字的数交换
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] > array[index]) {
                    swap(array, i, index);// 交换
                    break;
                }
            }

            // 接下来将index之后的数据逆序排列
            reverse(array, index + 1);
        }
    }

    /**
     * 将输入的数组反过来（逆序）
     * 
     * @param array 待逆序的数组
     * @param i     逆序开始的下标（该下标之前的数据不会变）
     */
    public static void reverse(int array[], int i) {
        int k = i, j = array.length - 1;
        while (k < j) {
            swap(array, k, j);
            k++;
            j--;
        }
    }

    /**
     * 交换array[s]和array[i]的数据
     * 
     * @param array
     * @param s
     * @param i
     */
    private static void swap(int[] array, int s, int i) {
        int t = array[s];
        array[s] = array[i];
        array[i] = t;
    }

    /**
     * 将array打印出来
     * 
     * @param array
     */
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.print("\n");
    }
}
