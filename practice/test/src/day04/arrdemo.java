package day04;

public class arrdemo {
    public static void main(String[] args) {
        int[] arr = new int[4];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        arr[0] = 100;
        arr[2] = 200;
        arr[3] = 300;
        arr[1] = 400;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        int[] arr2 = arr;
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);
        int[] arr3 = new int[]{1, 2, 3};
        int[] arr4 = {2,3,4};
        System.out.println(arr3[0] + arr3[1]);
        System.out.println(arr4[0] + arr4[1]);
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }
        int[] arr5 = {152, 122, 153, 466, 452, 495, 486};
        int max = arr5[0];
        for (int i = 1; i < arr5.length; i++) {
            if (arr5[i] > max) {
                max = arr5[i];
            }
        }
        System.out.println(max);
        int min = arr5[0];
        for (int i = 1; i < arr5.length; i++) {
            if (arr5[i] < min) {
                min = arr5[i];
            }
        }
        System.out.println(min);
    }
}
