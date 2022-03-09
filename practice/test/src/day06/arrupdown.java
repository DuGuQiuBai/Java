package day06;
//已知一个数组arr = {19,28,37,46,50};用程序实现把数组中的元素值交换,
//交换后的数组arr = {50,46,37,28,19};并在控制台输出交换后的数组元素。

public class arrupdown {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 55, 22, 99};
        int temp = 0;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
