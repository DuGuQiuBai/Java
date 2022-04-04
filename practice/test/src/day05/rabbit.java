package day05;

public class rabbit {
    public static void main(String[] args) {
        int[] rabbitnumber = new int[20];
        rabbitnumber[0] = 1;
        rabbitnumber[1] = 1;
        for (int i = 1; i < 19; i++) {
            rabbitnumber[i+1] = rabbitnumber[i] + rabbitnumber[i-1];
        }
        System.out.println(rabbitnumber[19]);
    }
}
