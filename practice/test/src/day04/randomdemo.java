package day04;
import java.util.Random;
public class randomdemo {
    public static void main(String[] args) {
        Random j = new Random();
        int i = j.nextInt(10);
        System.out.println(i);
        double a = j.nextDouble(13);
        System.out.println(a);
    }
}
