package day11;

public class Trycatch {
    public static void main(String[] args) {
        System.out.println("kaishi");
        try {
            method();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("shuzuyuejie");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        
        System.out.println("end");
    }

    public static void method() {
        int[] a = { 1, 2, 3 };
        System.out.println(a[3]);
    }
}
