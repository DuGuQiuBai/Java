package day11;

import java.util.Arrays;

public class IntegerTest {
    public static void main(String[] args) {
        String s = "12,45,89,62,34,57";
        String[] split =  s.split(",");
        int[] temp = new int[split.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(temp);
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1) {
                ss.append(temp[i]);
            } else {
                ss.append(temp[i]).append(" ");
            }
        }
        System.out.println(ss);

        
    }
}
