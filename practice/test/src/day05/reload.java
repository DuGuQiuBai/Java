package day05;
/*
方法重载:
多个方法在同一个类中
多个方法具有相同的方法名
多个方法的参数不相同，类型不同或者数量不同
*/
public class reload {
    public static void main(String[] args) {
        double[] arr = {10, 12.2, 3.6, 9.5, 4.6};
        double sum = sum(arr);
        System.out.println(sum);
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("/" + arr[i]);
        }
        change(arr);
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("/" + arr[i]);
        }
    }
    public static double sum(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void change(double[] arr) {
        double[] arr2 = {10, 45.3, 65.3, 9.2};
        arr[2] = arr2[0];
        arr[1] = arr2[0];
        return;
    }
}
