package day10;

public class ComputerTest {
    public static void main(String[] args) {
        long total = 0;
        for (int j = 0; j < 101; j++) {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);
            }
            long end = System.currentTimeMillis();
            total += (end - start);
        }
        System.out.println(total/100);
    }
}
