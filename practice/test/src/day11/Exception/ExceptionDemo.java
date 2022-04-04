package day11.Exception;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        Teacher t = new Teacher();
        try {
            t.ScoreCheck(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
