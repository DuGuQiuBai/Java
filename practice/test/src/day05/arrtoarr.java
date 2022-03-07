package day05;
//需求:设计一个方法，用于比较两个数组的内容是否相同

import java.util.Arrays;

public class arrtoarr {
    public static void main(String[] args) {
        double[] arr1 = {1,22,33,4,5};
        double[] arr2 = {11,22,33,4,5};
        boolean flag = arrs(arr1, arr2);
        System.out.println(flag);
    }
    public static boolean arrs(double[] arr1, double[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}