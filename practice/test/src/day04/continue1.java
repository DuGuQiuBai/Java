package day04;

public class continue1 {
    public static void main(String[] args) {
        int a = 3;
        for (int i = 1; i <= 13; i++) {
            if (i%2 == 1) {
                System.out.println(a);
                continue;
            }
            System.out.println("----");
        }
    }
}
