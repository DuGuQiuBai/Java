package day03;
public class and {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("1-5和为" + sum);
        sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i%2 == 0) {
                sum += i;
            }
        }
        System.out.println("1-100间偶数和为" + sum);

        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i%10;
            int shi = (i%100)/10;
            int bai = i/100;
            // System.out.println(ge);
            // System.out.println(shi);
            // System.out.println(bai);
            Double a = Math.pow(ge, 3);
            Double b = Math.pow(shi, 3);
            Double c = Math.pow(bai, 3);
            if (i == a + b + c) {
                System.out.println(i);
                count += 1;
            }
        }
        System.out.println("水仙花数总共有" + count + "个");

        double paper = 0.0001;
        double zf = 8848.86;
        int count1 = 0;
        while (paper <= zf) {
            paper *= 2;
            count1 += 1;
        }
        System.out.println("需要折叠" + count1 + "次");
    }
}
